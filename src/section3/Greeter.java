package section3;
import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "What's your name, man?");
		JOptionPane.showMessageDialog(null, "Hello there, " + name + "!");
		String color = JOptionPane.showInputDialog(null, "What's your favorite color?");
		JOptionPane.showMessageDialog(null, "Ah, " + color + ". An \"excellent\" choice.");
		String egg = JOptionPane.showInputDialog(null, "What's your favorite food?");
		if (egg.equalsIgnoreCase("egg")) {
			JOptionPane.showMessageDialog(null, "That is correct. You shall live, " + name + ".");
		} else if (!name.equalsIgnoreCase("Keith")) {
			JOptionPane.showMessageDialog(null, "You monster! I will destroy " + name + " the egg-hater for defecting to the side of " + egg + "!");
		} else {
			JOptionPane.showMessageDialog(null, "Your traitorous ways shall be forgiven, because your name is Keith.");
		}
	}
}
