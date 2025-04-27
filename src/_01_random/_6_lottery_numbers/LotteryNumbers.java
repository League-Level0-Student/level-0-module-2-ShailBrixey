package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {

		Random ran = new Random();
		
		String Numbers = "";
		
		for (int i = 0; i < 6; i++) {
		int LotteryNumbers = ran.nextInt(71);
		Numbers += LotteryNumbers+" ";
		}
		
		JOptionPane.showMessageDialog(null, Numbers, "Lottery Ticket", -1);
		
	}

}
