package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		speak("spell death");
		String ans = JOptionPane.showInputDialog("Spell it, ya dummy!");
		if (ans.equalsIgnoreCase("death")) {
			speak("incorright");
		} else {
			speak("corrong");
		}
		
		speak("spell destruction");
		ans = JOptionPane.showInputDialog("Spell it, ya turkey!");
		if (ans.equalsIgnoreCase("destruction")) {
			speak("incorright");
		} else {
			speak("corrong");
		}
		
		speak("spell homicide");
		ans = JOptionPane.showInputDialog("Spell it, ya miserable dingus!");
		if (ans.equalsIgnoreCase("homicide")) {
			speak("incorright");
		} else {
			speak("corrong");
		}
		
		speak("spell entropy");
		ans = JOptionPane.showInputDialog("Spell it, ya nerd!");
		if (ans.equalsIgnoreCase("entropy")) {
			speak("incorright");
		} else {
			speak("corrong");
		}
		
		speak("spell torture");
		ans = JOptionPane.showInputDialog("Spell it, ya weirdo!");
		if (ans.equalsIgnoreCase("torture")) {
			speak("incorright");
		} else {
			speak("corrong");
		}
		
		speak("You win! aeioioueoaeoaeaeoioioioioioioioioioiuuuuaeuoaieioioiiiiiiooeoieoaeiaoeaeeaeeeaeeioioououou shut up");
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


