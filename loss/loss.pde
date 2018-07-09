void setup() {
  size(500,500);
}

void draw() {
  if(mousePressed) {
    fill(#FF0000);
  } else {
    fill(#00FF00);
  }
  rect(75,75,50,100);
  rect(300,50,50,100);
  rect(400,100,50,100);
  rect(50,350,50,100);
  rect(125,350,50,100);
  rect(300,375,50,100);
  rect(375,420,100,50);
}