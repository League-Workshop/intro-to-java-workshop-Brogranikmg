package section2;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		String spiders[] = new String[]{"a good friend (or a tasty snack)","try it once; spider lunch","bug time","it is time","i hunger","begin the feast of arachnid yeast","toil and trash, toil and trash, sell those organs for some cash"};
		// 1. Create a new Robot
		Robot wormtime = new Robot();
		// 5. Set your robot's pen down 
		wormtime.penDown();
		// 3. Set the robot to go at max speed (100)
		wormtime.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int skinCoveredInBugs = 0; skinCoveredInBugs < 75; skinCoveredInBugs++) {
			String crunch = spiders[new Random().nextInt(spiders.length)];
			// 7. Change the pen color to random
			wormtime.setPenColor(Color.green);
			// 6. Move the robot 5 times the loop counter (5*i)
			wormtime.move(5*skinCoveredInBugs);
			// 2. Turn the robot 360/7 degrees to the right
			wormtime.turn(360/7);
			// 8. Set the pen width to i
			wormtime.setPenWidth(skinCoveredInBugs);
			JOptionPane.showMessageDialog(null, crunch);
			
		}
	}
}
