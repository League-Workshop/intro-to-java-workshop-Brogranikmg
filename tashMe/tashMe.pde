PImage mustache;
PImage friend;
void setup() {
  friend = loadImage("tastysnack.jpg");
  mustache = loadImage("mustache.png");
  size(500,500);
  friend.resize(width,height);
  mustache.resize(200,100);
  background(friend);
}

void draw() {
  if(mousePressed) {
    image(mustache,mouseX-95,mouseY-50);
  }
  if(keyPressed && key == 'r') {
    background(friend);
  }
}