package dafault_package; 

 

import java.util.Random; //imports the randomizer for the CPU opponent 

import java.util.Scanner; //imports the scanner for player inputs 

 

public class Main { 

	public static void main(String[] args) { 

		 

		int PlayerScore = 0; //keeps track of player wins 

		int CPUscore = 0; //keeps track of player loses 

		int TieGames = 0; //keeps track of ties 

		Scanner scanner = new Scanner(System.in); 

		while (true) { 

	//while loops through moves while game is in session	 

			String[] rps = {"r", "p", "s"}; 

			//array for the different moves: rock, paper, or scissors 

			String CPUmove = rps[new Random().nextInt(rps.length)]; 

			 

			String playerMove; 

	 

	//while loops through all outcomes until player chooses to end game	 

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

				TieGames += 1; //increments the Tie score 

				System.out.println("The game was a a tie"); 

			} 

			else if (playerMove.equals("r")) { 

				if (CPUmove.equals("p")) { 

					CPUscore += 1; //increments the CPU score 

					System.out.println("You lose"); 

					 

				} else if (CPUmove.equals("s")) { 

					PlayerScore += 1; //increments the player score 

					System.out.println("You win"); 

				} 

			} 

			 

			else if (playerMove.equals("p")) { 

				if (CPUmove.equals("r")) { 

					PlayerScore += 1; 

					System.out.println("You win"); 

					 

				} else if (CPUmove.equals("s")) { 

					CPUscore += 1; 

					System.out.println("You lose"); 

				} 

			} 

			 

			else if (playerMove.equals("s")) { 

				if (CPUmove.equals("p")) { 

					PlayerScore += 1; 

					System.out.println("You win"); 

					 

				} else if (CPUmove.equals("r")) { 

					PlayerScore += 1; 

					System.out.println("You win"); 

				} 

			} 

			 

			System.out.println("Shall we play again? (y/n)"); 

			String playAgain = scanner.nextLine(); 

			 

			if (!playAgain.equals("y")) { //allows player to continue loop to play indefinitely 

				break; 

			} 

			 

		} 

		System.out.println("Have a nice day!"); 

		 

		int totalgames = (PlayerScore + CPUscore + TieGames); //calculates total number of games played 

		 

		System.out.print("You won "); 

		System.out.print(PlayerScore); 

		System.out.print(" games out of "); 

		System.out.print(totalgames); 

		System.out.print("!\n"); 

		 

		 

		int winrate = PlayerScore*100/totalgames; //calculates the win percentage 

		System.out.print("Your winning percentage is: "); 

System.out.print(winrate); 

System.out.print("%"); 

scanner.close();

		 

	} 

 

} 