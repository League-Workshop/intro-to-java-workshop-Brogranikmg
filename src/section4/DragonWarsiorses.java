package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class DragonWarsiorses {
	public static void main(String[] args) {
		int health = 75;
		int dragon = 100;
		int mana = 50;
		int selected = 0;
		int randamage = 0;
		int bars = 2;
		int stun = 0;
		Object attacks[] = {"Bash (-5 Mana)", "Blitz (-15 Mana)", "Candy Bar (Restore Mana)"};
		Random RNGsus = new Random();
		JOptionPane.showMessageDialog(null, "You're exploring a mysterious cave, when you stumble upon a vast pile of glittering treasure.");
		JOptionPane.showMessageDialog(null, "As you stand there, shocked and surprised by your extremely lucky find, you almost miss the roar of a dragon.");
		while (health > 0 && dragon > 0) {
			selected = JOptionPane.showOptionDialog(null, "You are fighting a dragon!\n\nYour Health: " + health + "/75\nYour Mana: " + mana + "/50\n-----\nDragon Health: " + dragon + "/100\n\nCandy Bars: " + bars, "Battle", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, attacks, null);
			if (selected == 0) {
				if (mana >= 5) {
					dragon -= 5;
					mana -= 5;
					stun = RNGsus.nextInt(5);
					if (stun == 0) {
						JOptionPane.showMessageDialog(null, "Noticing an opportunity, you aim your club and leap towards the dragon right as it exposes its weak underbelly. It takes 5 damage, and falls to the ground, immobilized.");
						stun = 10;
					} else {
						JOptionPane.showMessageDialog(null, "You grab your club and bash it with your hammer as hard as you can. You notice a slight grimace as it takes 5 damage.");
					}
				} else {
					selected = -1;
					JOptionPane.showMessageDialog(null, "You don't have enough mana!");
				}
			}
			if (selected == 1) {
				if (mana >= 15) {
					randamage = RNGsus.nextInt(30) + 1;
					dragon -= randamage;
					mana -= 15;
					JOptionPane.showMessageDialog(null, "You focus your will on destroying this vile beast, and launch yourself into the dragon. It recoils, taking " + randamage + " damage.");
				} else {
					selected = -1;
					JOptionPane.showMessageDialog(null, "You don't have enough mana!");
				}
			}
			if (selected == 2) {
				if (bars > 0 && mana < 50) {
					mana = 50;
					bars -= 1;
					JOptionPane.showMessageDialog(null, "You can already feel your strength coming back as you bite into the candy...");
				} else {
					selected = -1;
					JOptionPane.showMessageDialog(null, "You're out of candy bars, or your mana is already full!");
				}
			}
			if (selected >= 0 && dragon > 0) {
				if (stun == 10) {
					stun = 0;
					JOptionPane.showMessageDialog(null, "The dragon slowly wakes up, recovering from its paralysis.");
				} else {
					randamage = RNGsus.nextInt(10);
					if (randamage >= 0 && randamage <= 4) {
						health -= 5;
						JOptionPane.showMessageDialog(null, "The dragon grunts, and slashes at you. You suffer 5 damage.");
					} else if (randamage <= 7) {
						health -= 10;
						JOptionPane.showMessageDialog(null, "A sheet of flame blows from the dragon's mouth, and you narrowly duck out of the way, losing 10 health from the burns.");
					} else {
						health -= 15;
						JOptionPane.showMessageDialog(null, "The dragon burrows into the pile of treasure, then leaps out, shoving you backwards. You lose 15 health.");
					}
				}
			}
		}
		if (health == 0) {
			JOptionPane.showMessageDialog(null, "Overwhelmed by your wounds, you stumble to the floor. If only there was a way to try again, you think, as you take your dying breath...\n\nGAME OVER");
		} else {
			JOptionPane.showMessageDialog(null, "The dragon is becoming too weak to defend itself, and you run up to it and slice off its head! As it collapses, you begin wondering how you're going to move all this treasure...\n\nYOU WIN");
		}
	}
}
