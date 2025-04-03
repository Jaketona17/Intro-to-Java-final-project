package dafault_package;
import java.util.Scanner;

public class Tutorial {

	public static void main(String[] args) {
		/*
		 * multi-line
		 * comment 
		 */
		System.out.print("Hello\n");
		System.out.println("Hello");
		long x = 668565654548419556L;
		double y = 3.14;
		
		System.out.println(x*y);
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Who are you? ");
		String name = scanner.nextLine();
		System.out.println("Hello ");
		System.out.println("Have we met before? ");
		boolean met = scanner.nextBoolean();
				//true = "Yes";
		scanner.nextLine();
		
	}
}
