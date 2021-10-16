/**
 * Jacob Wyman
 * 
 * N01430059
 * 
 * Project 2
 * 
 * 
 * 
 */


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int min = 0, max = 0, i, temp = 0;
		
		min = input();
		max = input();
		
		if(max < min) {
			temp = max;
			max = min;
			min = temp;
		}
		
		for(i = min;i <= max; i++ ) {
			checkLeapYear(i);
		}
		
	}
	
	/*
	 *	This function compares input to check if the current year being operated on is a leap year and prints
	 *	message if it is a leap year 
	 */
	
	static void checkLeapYear(int userYear){
		
		int remHund = 0;
		int remFour = 0;
		int remFourHund = 0;
		
		remHund = userYear % 100;
		remFour = userYear % 4;
		remFourHund = userYear % 400;
		
		if(remFour == 0 && remHund != 0) {
			System.out.println(userYear +" is a leap year!");
		}else if(remHund == 0 && remFourHund == 0){
			System.out.println(userYear +" is a leap year!");
		}
		
		return;
		
		
	}
/*
 * This function scans for a year
 * 
 * 
 */

	static int input() {
		int in = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a year between 1500 and 2020");
		do {
			in = input.nextInt();
			if(in < 1500 || in > 2020) {
				System.out.println("Invalid Entry\nThe year cannot be checked!");
			}
		}while(in < 1500 || in > 2020);
		return in;
	
	}
}