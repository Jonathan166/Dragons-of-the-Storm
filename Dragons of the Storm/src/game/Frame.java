/*
* Program: Frame
* Programmer name: DoTerra
* Date: Jul 2, 2015
*
*
*
*/

package game;

import javax.swing.JFrame;

public class Frame {
	public Frame(){
		JFrame frame = new JFrame();
		frame.add(new Board());
		frame.setTitle("Dragons of the Storm");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1600, 900);
		frame.setVisible(true);
		
		//sets the window to the center of the screen 
		frame.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new Frame();
	}
}
