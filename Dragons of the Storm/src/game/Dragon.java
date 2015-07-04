/*
* Program: Dragon
* Programmer name: DoTerra
* Date: Jul 2, 2015
*
*
*
*/

package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Dragon {
	int xPos, dx, yPos;
	Image dragon;
	
	public Dragon(){
		ImageIcon dr = new ImageIcon("Flarebrass.jpg");
		dragon = dr.getImage();
		xPos = 10;
		yPos = 50;
		
	}
	
	public void move(){
		xPos = xPos + dx;
	}
	
	public int getX(){
		return xPos;
	}
	
	public int getY(){
		return yPos;
	}
	
	
}
