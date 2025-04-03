package dafault_package;

import java.util.Random;
import java.util.Scanner;

public class RPS {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String[] rps = {"r", "p", "s"};
			String CPUmove = rps[new Random().nextInt(rps.length)];
			
			String playerMove;
	
	//while loops through all outcomes until user chooses to close loop		
			while(true) {
				System.out.println("Please enter your move (r, p, or s)");
				playerMove = scanner.nextLine();
				if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
					break;
				}
				System.out.println(playerMove + " is not a valid move.");
			}
			
			System.out.println("CPU played: " + CPUmove);
			
			if (playerMove.equals(CPUmove)) {
				System.out.println("The game was a a tie");
			}
			else if (playerMove.equals("r")) {
				if (CPUmove.equals("p")) {
					System.out.println("You lose");
					
				} else if (CPUmove.equals("s")) {
					System.out.println("You win");
				}
			}
			
			else if (playerMove.equals("p")) {
				if (CPUmove.equals("r")) {
					System.out.println("You win");
					
				} else if (CPUmove.equals("s")) {
					System.out.println("You lose");
				}
			}
			
			else if (playerMove.equals("s")) {
				if (CPUmove.equals("p")) {
					System.out.println("You win");
					
				} else if (CPUmove.equals("r")) {
					System.out.println("You win");
				}
			}
			
			System.out.println("Shall we play again? (y/n)");
			String playAgain = scanner.nextLine();
			
			if (!playAgain.equals("y")) {
				break;
			}
			
		}
		System.out.println("Have a nice day!");
	}

}
