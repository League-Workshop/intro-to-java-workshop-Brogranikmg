package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot squarey = new Robot();
	void go() {
			squarey.penDown();
		// 4. Make the robot move as fast as possible
			squarey.setSpeed(100);
		// 5. Set the pen width to 5
			squarey.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
			for (int i = 0; i < 4; i++) {
				
			
			// 7. Set the pen color to random
				squarey.setPenColor(Color.red);
			// 1. Call the drawSquare() method
				drawSquare();
			// 8. Turn the robot 90 degrees to the right
				squarey.turn(90);
			}
	}

	
	void drawSquare() {
		String dingus = JOptionPane.showInputDialog(null, "you fool! you foolish fool! you called the drawSquare() method!");
		JOptionPane.showMessageDialog(null, dingus);
		/* 3. Fill in the code to draw a square inside the method below. */
		for (int i = 0; i < 4; i++) {
			squarey.move(50);
			squarey.turn(90);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



