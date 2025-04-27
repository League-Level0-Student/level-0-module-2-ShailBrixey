//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
				
		// 1. Use each value of randomNumber to give the user a random compliment.
		
		// 2. Repeat all the code above 10 times
		for (int i = 0; i < 10; i++) {
			int randomNumber = randomMaker.nextInt(5);
			
			System.out.println(randomNumber);

			if (randomNumber == 0) {
				System.out.println("Your neat!");
			} else if (randomNumber == 1) {
				System.out.println("You rock!");
			} else if (randomNumber == 2) {
				System.out.println("You rule!");
			} else if (randomNumber == 3) {
				System.out.println("Your amazing!");
			} else {
				System.out.println("You are outstanding!");
			}
		}
		// 3. Find someone to test out your program. They will like it :)
	}
}
