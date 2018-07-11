package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String code = JOptionPane.showInputDialog("Do you know how to eat code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (code.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "You're going to rule the world!");
		} else {
			JOptionPane.showMessageDialog(null, "Good luck washing dishes TO DEATH! Maybe you shoulda eaten that computer.");
		}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

