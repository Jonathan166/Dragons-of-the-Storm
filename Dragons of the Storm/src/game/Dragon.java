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
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Dragon {
	int xPos, dx, yPos;
	Image dragon;
	
	public Dragon(){
		ImageIcon dr = new ImageIcon(getClass().getResource("Flarebrass.png"));
		dragon = dr.getImage();
		xPos = 20;
		yPos = 370;
		
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
	
	public Image getImage(){
		return dragon;
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_A){
			dx = -1;
		}
		if(key == KeyEvent.VK_D){
			dx = 1;
		}
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_A){
			dx = 0;
		}
		if(key == KeyEvent.VK_D){
			dx = 0;
		}
	}
}
