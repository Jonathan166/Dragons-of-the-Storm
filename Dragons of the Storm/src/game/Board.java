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

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener{
	
	public Image img;
	Timer time;
	Dragon d;
	
	public Board(){
		d = new Dragon();
		addKeyListener(null);
		setFocusable(true);
		ImageIcon background = new ImageIcon("C:/Users/DoTerra/Downloads/Backgroud.jpg");
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
		Graphics2D g2d = (Graphics2d) g;
		
		g2d.drawImage(img, 0, 0, null);
		g2d.drawImage(d.getImage(), d.getX(), d.getY(), null);
	}
}
