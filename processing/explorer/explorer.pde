PImage ie;

void setup() {
  size(1000,500);
  ie = loadImage("explorer.jpg");
}

void draw() {
  image(ie,mouseX,mouseY);
}