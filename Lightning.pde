  int startX=300;
  int startY = 0;
  int endX = 300;
  int endY = 0;

void setup()
{
  size(600,600);
}
void draw()
{
frameRate (10);
background (0);
stroke ((int) (Math.random()*256),(int) (Math.random()*256),(int) (Math.random()*256));
while (endY < 600)
{
	strokeWeight(1);
	endX = startX + (int)(Math.random()*19)-9;
	endY = startY + (int)(Math.random()*16);
	line (startX,startY,endX,endY);
	startX=endX;
	startY=endY;
	zeus();
}
}
void mousePressed()
{
	startX=mouseX;
	startY=0;
	endX=mouseX;
	endY=0;
}


void zeus()
{
	fill(255,255,15);
	strokeWeight (4);
	textSize (36);
	text ("WRATH OF ZEUS UNLEASHED!",50,270);
}