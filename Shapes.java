// Write an applet to draw following shapes : (i) Oval (ii) Rectangle (iii) Arc

import java.awt.*; 
import java.applet.*; 
  


public class Shapes  
{ 
    public void paint(Graphics g)  
    { 
        // Drawing an Oval 
        g.drawOval(50, 50, 100, 50); 
  
        // Drawing a Rectangle 
        g.drawRect(50, 150, 100, 50);  
  
        // Drawing an Arc 
        g.drawArc(50, 250, 100, 50, 0, 90);  
    } 
}