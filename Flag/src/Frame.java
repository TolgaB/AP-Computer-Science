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
	    if (i == 14) {
	    	System.out.println("Super special final size number is" + newNum);
	    }
		}
		//Line going down on left side
	    g.drawLine(100, 30, 100, 420);
	    //Line going down on the riht side
	    g.drawLine(841, 30, 841, 420);
	    //Line that draws the box
	   
	    
	    /*
	     * Fill Lines
	     */
	    for (int u = 0; u < 9; u++) {
	    	if ( u ==0) {
	    		g.setColor(Color.red);
	    		g.fillRect(100, 30, 741, 30);
	    	}
	    	else {
	    		g.setColor(Color.red);
	    		int newNum = 60 * u;
	    		newNum = newNum + 30;
	    		g.fillRect(100, newNum, 741, 30);
	    	}
	    	
	    }
	    /*
	     * Draw box
	     * 
	     */
	    g.setColor(Color.BLUE);
	    g.fillRect(100, 30, 296, 210);
	   for (int k =1; k < 10; k++) {
		   if (k % 2 == 0) {
			   //When even
			   for (int h =1; h < 6; h++) {
				   g.setColor(Color.green);
				   int yNum = (int) 22.68 * k;
				   double xNum = 0;
				   if (h > 1) {
					   
				   }
				   else {
					   xNum = 52.92;
				   }
				   xNum = xNum + 100;
				   
				   yNum = yNum + 30;
				   g.fillRect((int) xNum, yNum, 5, 5);
			   }
		   }
		   else {
			   //When odd
			   for (int o =1; o < 7; o++) {
				   g.setColor(Color.green);
				   int yNum =  (int) 22.68 * k;
				   double xNum;
				   if (o > 1) {
					   xNum = (o * 52.92) - 30;
				   }
				   else {
				       xNum =  (o * 26.46);
				   }
				   
				   xNum = xNum + 100;
				
				   
				   yNum = yNum + 30;
				   g.fillRect((int) xNum, yNum, 5, 5);
			   }
		   }
	   }
	}
}
