
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

	}
}
