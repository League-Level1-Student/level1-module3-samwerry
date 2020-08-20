int birdX=250;
int birdY=250;
int xSpeed=2;
int gravity=1;
int birdYVelocity = 0;
int rectx1=460;
int rectx2=460;
int upperPipeHieght = 200;
int lowerPipeHieght=200;
int pipeGap = 50;
int lowerY=upperPipeHieght+pipeGap;
void setup(){
size(500,500);
}
void mousePressed(){
  birdYVelocity = -10;
}
void draw(){
  birdY+=birdYVelocity;
  birdYVelocity += gravity;
  rectx1-=2;
  rectx2-=2;
  
  
background(43, 0, 22);
fill(200, 44, 22);
stroke(11, 63, 143);
ellipse(birdX, birdY, 10, 10);

lowerY=upperPipeHieght+pipeGap;
  lowerPipeHieght=500-lowerY;
rect(rectx1,0,50,upperPipeHieght);
rect(rectx2,lowerY,50,lowerPipeHieght);
if(rectx1==-50){
    rectx1=510;
   upperPipeHieght= (int)random(100,400);
  }
  if(rectx2==-50){
    rectx2=510;
 
  }
}
boolean intersectsPipes() { 
         if (birdY < upperPipeHieght && birdX > rectx1 && birdX < (rectx1+50)){
            return true; }
        else if (birdY>lowerY && birdX > rectx2 && birdX < (rectx2+50)) {
            return true; }
        else { return false; }
}
