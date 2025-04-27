//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {
	// 2. Get the user to enter a question for the 8 ball to answer
	String Question = JOptionPane.showInputDialog("What do you want to know?");

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
	Random ran = new Random();
	int Numbers = ran.nextInt(4);
	System.out.println(Numbers);
	// 4. If the random number is 0
	if (Numbers == 0) {
	// -- tell the user "Yes"
		JOptionPane.showMessageDialog(null, "Yes");
	// 5. If the random number is 1
	} else if (Numbers == 1) {
	// -- tell the user "No"
		JOptionPane.showMessageDialog(null, "No");
	// 6. If the random number is 2
	} else if (Numbers == 2) {
	// -- tell the user "Maybe you should ask Google?"
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
	// 7. If the random number is 3
	} else {
	// -- write your own answer
		JOptionPane.showMessageDialog(null, "Answers may vary.");
	}
}
}
