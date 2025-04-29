import java.util.Scanner;
import java.util.InputMismatchException;

// Class to handle user input
class Input {

	// Function to input two integers from the user
	int[] input() {
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[2];

		try {
			System.out.print("Enter 1st number: ");
			numbers[0] = scan.nextInt();

			System.out.print("Enter 2nd number: ");
			numbers[1] = scan.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter integers only.");
			System.exit(1);
		}
		return numbers;
	}
}
