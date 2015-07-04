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

public class Board extends JPanel implements ActionListener{
	
	Image img;
	Timer time;
	Dragon d;
	
	public Board(){
		d = new Dragon();
		addKeyListener(new ActionListener());
		setFocusable(true);
		ImageIcon background = new ImageIcon(getClass().getResource("scene.png"));;
		img = background.getImage();
		time = new Timer(5, this);
		time.start();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent reDraw) {
		d.move();
		repaint();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawImage(img, 0, 0, null);
		g2d.drawImage(d.getImage(), d.getX(), d.getY(), null);
	}
	
	private class ActionListener extends KeyAdapter{
		
		public void keyReleased(KeyEvent e){
			d.keyReleased(e);
		}
		
		public void keyPressed(KeyEvent e){
			d.keyPressed(e);
		}
	}
}
