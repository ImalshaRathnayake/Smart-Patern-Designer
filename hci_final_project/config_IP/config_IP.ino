#include <WiFi.h>

void setup() {
  Serial.begin(115200);
  
  // Connect to Wi-Fi network with SSID and password
  WiFi.begin("Dialog 4G 640", "a59Bb9d1");

  Serial.println("Connecting to Wi-Fi");

  while (WiFi.status() != WL_CONNECTED) {
    delay(1000);
    Serial.println("Connecting...");
  }

  Serial.println("Connected to Wi-Fi");
  Serial.print("ESP32 IP address: ");
  Serial.println(WiFi.localIP());
}

void loop() {
  // put your main code here, to run repeatedly:
}

