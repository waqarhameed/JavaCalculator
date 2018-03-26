package javacalculator;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	static Random ran = new Random();
	static int randnum = ran.nextInt(100) + 1;

	public static void guessNum() {
		System.out.println(randnum);
		for (int i = 1; i < 6; i++) {
			System.out.println("Enter " + i + " try !");
			System.out.println("Enter a number: ");
			Scanner scan = new Scanner(System.in);
			String inputstr = scan.nextLine();
		    int input = 0;
			try {
				input=Integer.parseInt(inputstr);
			} catch (NumberFormatException e) {
				System.out.println("wrong input : ");
			}
			if(randnum == input){
				System.out.println("You Win !");
				scan.close();
				System.exit(0);
			}
			else if(i == 5) {
				System.out.println("NO More Tries ! ");
				System.exit(1);
			} else if (randnum < input) {
				System.out.println("Enter lesser number");
			} else {
				System.out.println("Enter greater number");
			} 
		}
		System.exit(1);
	}

	public static void main(String[] args) {
		System.out.println("Maximun Five Tries !");
		guessNum();

	}

}
