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
	int xPos, dx, yPos, dy, nx, nx2;
	Image dragon;

	ImageIcon dr = new ImageIcon(getClass().getResource("dragon1.png"));
	ImageIcon dl = new ImageIcon(getClass().getResource("dragon1.png"));
	
	public Dragon(){
		dragon = dr.getImage();
		xPos = 75;
		yPos = 370;
		nx2 = 685;
		
	}
	
	public void move(){
		xPos = xPos + dx;
		nx2 = nx2 + dx;
	}
	
	public void jump(){
		yPos = yPos + dy;
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
	
	public void movePressed(KeyEvent e){
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_A){
			dx = -5;
			dragon = dl.getImage();
		}
		if(key == KeyEvent.VK_D){
			dx = 5;
			dragon = dr.getImage();
		}
	}
	
	public void moveReleased(KeyEvent e){
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_A)dx = 0;
		if(key == KeyEvent.VK_D)dx = 0;
	}
	
	public void spacePressed(KeyEvent e){
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_SPACE)dy = 20;
	}
	
	public void spaceReleased(KeyEvent e){
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_SPACE)dy = -20;
	}
}
