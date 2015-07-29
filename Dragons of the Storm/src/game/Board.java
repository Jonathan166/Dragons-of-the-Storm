/*
* Program: Board
* Programmer name: DoTerra
* Date: Jul 2, 2015
*
*
*
*/

package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Board extends JPanel implements ActionListener{
	
	Image img;
	Timer time;
	Dragon d;
	
	public Board(){
		d = new Dragon();
		addKeyListener(new ActionListener());
		setFocusable(true);
		ImageIcon background = new ImageIcon(getClass().getResource("BackGround.png"));;
		img = background.getImage();
		time = new Timer(5, this);
		time.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent reDraw) {
		d.move();
		d.jump();
		repaint();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawImage(img, 685-d.nx2, 0, null);
		if(d.getX() > 700)g2d.drawImage(img, 685-d.nx2, 0, null);
		g2d.drawImage(d.getImage(), 75, d.getY(), null);
	}
	
	private class ActionListener extends KeyAdapter{
		public void keyReleased(KeyEvent e){
			d.moveReleased(e);
		}
		public void keyPressed(KeyEvent e){
			d.movePressed(e);
		}
		public void jumpReleased(KeyEvent e){
			d.spaceReleased(e);
		}
		public void jumpPressed(KeyEvent e){
			d.spacePressed(e);
		}
	}
}
