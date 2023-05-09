//define libraries
#include <FastLED.h>
#include <WiFi.h>
#include <WiFiClient.h>
#include <WebServer.h>
#include <ArduinoJson.h>
#include <SPI.h>

#define NUM_LEDS 64  //define number of bulbs
#define LED_PIN 5    //define the data pin connect with ws2812
#define potentiometer 34//define the data pin for potentiometer

int brightness;

CRGB leds[NUM_LEDS];  //create an array 'CRGB' object to represent the LEDs

//These lines define the SSID and password for the Wi-Fi network that the ESP32 will connect to.
const char* ssid = "HUAWEI nova 2i";
const char* password = "12345678";

WebServer server(80);  //This line creates a web server object that listens on port 80.

/*These lines set up the ESP32 and the web server. The setup() function sets up the serial port, initializes the LED strip with the FastLED library, 
connects to the Wi-Fi network, sets up the web server to handle requests to the "/color-and-button" endpoint, and starts the web server.*/
void setup() {
  Serial.begin(115200);
  FastLED.addLeds<WS2812, LED_PIN, GRB>(leds, NUM_LEDS);
  FastLED.setBrightness(50);

  Serial.println("Connecting to WiFi...");
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(1000);
    Serial.println("Connecting...");
  }
  Serial.println("WiFi connected");
  Serial.println(WiFi.localIP());

  server.on("/color-and-button", handleColorAndButton);
  server.begin();
  Serial.println("HTTP server started");
}
//This line runs the main loop for the web server, which waits for incoming client requests and handles them.
void loop() {
  server.handleClient();
  // read the brightness value from a potentiometer connected to analog pin 0
  brightness = map(analogRead(potentiometer), 0, 1023, 0, 255);
  
  // set the brightness of the LED panel
  FastLED.setBrightness(brightness);
  
  // update the LEDs
  FastLED.show();
  
  // add a small delay to prevent flickering
  delay(10);
}

/*This is the function that handles incoming requests to the "/color-and-button" endpoint. 
It extracts the "color" and "button" values from the JSON payload of the request, converts the "color" value into an RGB color using bit shifting, 
sets the color of the specified button on the LED strip, and sends a response back to the client with a "200 OK" status code.*/
void handleColorAndButton() {
  String data = server.arg("plain");
  Serial.println("Received data: " + data);

  StaticJsonDocument<64> doc;
  DeserializationError error = deserializeJson(doc, data);
  if (error) {
    Serial.println("Error parsing JSON");
    return;
  }

  int color = doc["color"];
  int button = doc["button"];
  Serial.println("Selected color: " + String(color));
  Serial.println("Selected button: " + String(button));

  CRGB colorRGB;
  colorRGB.r = (color >> 16) & 0xFF;  // Extract the red component from the integer value
  colorRGB.g = (color >> 8) & 0xFF;   // Extract the green component from the integer value
  colorRGB.b = color & 0xFF;          // Extract the blue component from the integer value

  leds[button] = colorRGB;

  FastLED.show();

  server.send(200, "text/plain", "OK");
}

