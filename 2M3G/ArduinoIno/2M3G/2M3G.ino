int ledPIN1 = 2;
int ledPIN2 = 3;
int ledPIN3 = 4;
int ledPIN4 = 5;
int ledPIN5 = 6;
int ledPIN6 = 7;
int ledPIN7 = 8;
int ledPIN8 = 9;
int ledPIN9 = 10;
int ledPIN10 = 11;
int ledPIN11 = 12;
char inputBuffer[11];

void setup() {
  Serial.begin(9600);
  pinMode(ledPIN1, OUTPUT);
  pinMode(ledPIN2, OUTPUT);
  pinMode(ledPIN3, OUTPUT);
  pinMode(ledPIN4, OUTPUT);
  pinMode(ledPIN5, OUTPUT);
  pinMode(ledPIN6, OUTPUT);
  pinMode(ledPIN7, OUTPUT);
  pinMode(ledPIN8, OUTPUT);
  pinMode(ledPIN9, OUTPUT);
  pinMode(ledPIN10, OUTPUT);
  pinMode(ledPIN11, OUTPUT);
}

void loop() {
 if (Serial.available() > 0 ){
  Serial.readBytes(inputBuffer,11);
  Serial.println(Serial.readBytes(inputBuffer,11));
  analogWrite(ledPIN1, inputBuffer[0]);
  analogWrite(ledPIN2, inputBuffer[1]);
  analogWrite(ledPIN3, inputBuffer[2]);
  analogWrite(ledPIN4, inputBuffer[3]);
  analogWrite(ledPIN5, inputBuffer[4]);
  analogWrite(ledPIN6, inputBuffer[5]);
  analogWrite(ledPIN7, inputBuffer[6]);
  analogWrite(ledPIN8, inputBuffer[7]);
  analogWrite(ledPIN9, inputBuffer[8]);
  analogWrite(ledPIN10, inputBuffer[9]);
  analogWrite(ledPIN11, inputBuffer[10]);
 }
}
