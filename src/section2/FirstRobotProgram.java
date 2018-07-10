package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class FirstRobotProgram {
	public static void main(String[] args) {
		Robot map = new Robot();
		map.move(100);
		map.setSpeed(10);
		map.turn(90);
		map.penDown();
		map.setPenColor(Color.red);
		int x = 0;
		while (x < 180) {
			map.move(2);
			map.turn(2);
			x++;
			if (x == 90) {
				map.setPenColor(Color.blue);
			}
		}
	}
}
