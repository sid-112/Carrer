int led = 8;
int but = 7;

void setup(){
  pinMode(led, OUTPUT);
  pinMode(but, INPUT);
}

void loop(){
  if (digitalRead(but) == HIGH){
    digitalWrite(led, HIGH);
  }

  else{
    digitalWrite(led, LOW);
  }
}