import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		Scanner choice = new Scanner(System.in);

		// Displaying the menu options
		System.out.println("\n\tMenu");
		System.out.println("-----------------------");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Square");
		System.out.println("6. Cube");
		System.out.println("7. Square Root");
		System.out.println("8. Fibonacci");
		System.out.println("9. Mean");
		System.out.println("10. Mode");
		System.out.println("11. Exit");

		while (true) {
			System.out.print("\nChoose an option: ");
			int option;
			try {
				option = choice.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a number.");
				choice.next(); // clear invalid input
				continue;
			}

			switch (option) {
				case 1:
					// Perform Addition
					System.out.println("Sum = " + calculator.calcSum());
					break;

				case 2:
					// Perform Subtraction
					System.out.println("Difference = " + calculator.calcDiff());
					break;

				case 3:
					// Perform Multiplication
					System.out.println("Product = " + calculator.calcProd());
					break;

				case 4:
					// Perform Division with exception check
					try {
						System.out.println("Quotient = " + calculator.calcDiv());
					} catch (ArithmeticException e) {
						System.out.println("Error: " + e.getMessage());
					}
					break;

				case 5:
					// Calculate Square
					System.out.println("Square = " + calculator.calcSquare());
					break;

				case 6:
					// Calculate Cube
					System.out.println("Cube = " + calculator.calcCube());
					break;

				case 7:
					// Calculate Square Root
					System.out.println("Square Root = " + calculator.calcSqrt());
					break;

				case 8:
					// Calculate Fibonacci
					System.out.print("Enter a number for Fibonacci: ");
					int num = choice.nextInt();
					System.out.println("Fibonacci(" + num + ") = " + calculator.calcFib(num));
					break;

				case 9:
					// Calculate Mean
					System.out.print("Enter the size of the array: ");
					int size1 = choice.nextInt();
					int[] arr1 = new int[size1];
					System.out.println("Enter the numbers:");
					for (int i = 0; i < size1; i++) {
						arr1[i] = choice.nextInt();
					}
					System.out.println("Mean = " + calculator.calcMean(arr1));
					break;

				case 10:
					// Calculate Mode
					System.out.print("Enter the size of the array: ");
					int size2 = choice.nextInt();
					int[] arr2 = new int[size2];
					System.out.println("Enter the numbers:");
					for (int i = 0; i < size2; i++) {
						arr2[i] = choice.nextInt();
					}
					System.out.println("Mode = " + calculator.calcMode(arr2));
					break;

				case 11:
					// Exit Program
					System.out.println("Exiting program. Goodbye!");
					choice.close();
					System.exit(0);

				default:
					System.out.println("Invalid option. Please try again.");
			}
		}
	}
}
