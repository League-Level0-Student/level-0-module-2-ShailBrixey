package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		String Age = JOptionPane.showInputDialog("How old are you?");
		
		if(Integer.parseInt(Age) >= 18) {
			JOptionPane.showInputDialog("Who should the next prseident be?");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		}

	}

}
