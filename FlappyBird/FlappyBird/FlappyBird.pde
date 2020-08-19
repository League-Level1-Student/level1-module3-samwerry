int BirdX=250;
int BirdY=250;
int xSpeed=2;
int gravity=1;
int birdYVelocity = 0;
int rectx1=460;

int upperPipeHeight = (int) random(100, 400);
void setup(){
size(500,500);
}
void mousePressed(){
  birdYVelocity = -10;
}
void draw(){
  BirdY+=birdYVelocity;
  birdYVelocity += gravity;
  rectx1-=2;
  
  
background(43, 0, 22);
fill(200, 44, 22);
stroke(11, 63, 143);
ellipse(BirdX, BirdY, 10, 10);
int upperPipeHeight = (int) random(100, 400);
rect(rectx1,0,50,upperPipeHeight);
if(rectx1==-50){
    rectx1=510;
   
  }
}
