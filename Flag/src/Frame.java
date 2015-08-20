import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class Frame extends JFrame {
	
	public Frame() {
		init();
	}
	public void init() {
		setSize(1500, 600);
		setBackground(Color.white);
		repaint();
	}
	public void paint (Graphics g) {
		for (int i = 0; i < 15; i ++) {
		int newNum = i * 30;
		System.out.println(newNum);
	    g.drawLine(100, newNum, 841, newNum);
		}
		//Line going down on left side
	    g.drawLine(100, 30, 100, 420);
	    //Line going down on the riht side
	    g.drawLine(841, 30, 841, 420);
	    //Line that draws the box
	    g.drawLine(444, 30, 296,210);
	    
	    /*
	     * Fill Lines
	     */
	    for (int u = 1; u < 9; u++) {
	    	if ( u ==1) {
	    		g.setColor(Color.red);
	    		g.fillRect(100, 30, 741, 30);
	    	}
	    	else {
	    		g.setColor(Color.red);
	    		int newNum = 30 * u;
	    		newNum = newNum + 60;
	    		g.fillRect(100, newNum, 741, 30);
	    	}
	    	
	    }
	    /*
	     * Draw box
	     * 
	     */
	    g.setColor(Color.BLUE);
	    g.fillRect(100, 30, 296, 210);
	}
}
