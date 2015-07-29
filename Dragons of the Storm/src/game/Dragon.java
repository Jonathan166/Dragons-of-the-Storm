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

	ImageIcon dStandR = new ImageIcon(getClass().getResource("DragonStatR.gif"));
	ImageIcon dStandL = new ImageIcon(getClass().getResource("DragonStatL.gif"));
	ImageIcon dWalkR = new ImageIcon(getClass().getResource("DragonWalkingR.gif"));
	ImageIcon dWalkL = new ImageIcon(getClass().getResource("DragonWalkingL.gif"));
	
	public Dragon(){
		dragon = dStandR.getImage();
		xPos = 75;
		yPos = 470;
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
			dx = -7;
			dragon = dWalkL.getImage();
		}
		if(key == KeyEvent.VK_D){
			dx = 7;
			dragon = dWalkR.getImage();
		}
	}
	
	public void moveReleased(KeyEvent e){
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_A){
			dx = 0;
			dragon = dStandL.getImage();
		}
		if(key == KeyEvent.VK_D){
			dx = 0;
			dragon = dStandR.getImage();
		}
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
