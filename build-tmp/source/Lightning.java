import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

  int startX=300;
  int startY = 0;
  int endX = 300;
  int endY = 0;

public void setup()
{
  size(600,600);
}
public void draw()
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
public void mousePressed()
{
	startX=mouseX;
	startY=0;
	endX=mouseX;
	endY=0;
}


public void zeus()
{
	fill(255,255,15);
	strokeWeight (4);
	textSize (36);
	text ("WRATH OF ZEUS UNLEASHED!",50,270);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
