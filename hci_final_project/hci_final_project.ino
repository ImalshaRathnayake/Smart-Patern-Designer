#include <WiFi.h>
#include <WiFiClient.h>
#include <WebServer.h>
#include <Adafruit_NeoPixel.h>

#define PIN 13
#define NUMPIXELS 64

const char* ssid = "Dialog 4G 640";
const char* password = "a59Bb9d1";

WebServer server(80);
Adafruit_NeoPixel pixels(NUMPIXELS, PIN, NEO_GRB + NEO_KHZ800);

void handleRoot() {
  server.send(200, "text/html", "Hello from ESP32!");
}

void handleColor() {
  int ledIndex = server.arg("led").toInt();
  int r = server.arg("r").toInt();
  int g = server.arg("g").toInt();
  int b = server.arg("b").toInt();
  pixels.setPixelColor(ledIndex, pixels.Color(r, g, b));
  pixels.show();
  server.send(200, "text/html", "LED color set!");
}


void setup() {
  pixels.begin();
  pixels.show();
  Serial.begin(115200);
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(1000);
    Serial.println("Connecting to WiFi...");
  }
  Serial.println("Connected to WiFi");
  server.on("/", handleRoot);
  server.on("/color", handleColor);
  server.begin();
  Serial.println("Server started");
}

void loop() {
  server.handleClient();
}
