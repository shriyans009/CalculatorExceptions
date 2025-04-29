// Calculator class containing all arithmetic and additional operations

class Calculator {

	int[] input_nums = {};

	// Constructor to fetch input from Input class
	Calculator() {
		Input in = new Input();
		input_nums = in.input();
	}

	// Function to calculate sum
	int calcSum() {
		return input_nums[0] + input_nums[1];
	}

	// Function to calculate difference
	int calcDiff() {
		return input_nums[0] - input_nums[1];
	}

	// Function to calculate product
	int calcProd() {
		return input_nums[0] * input_nums[1];
	}

	// Function to calculate division with error handling
	double calcDiv() {
		if (input_nums[1] == 0) {
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		return (double) input_nums[0] / input_nums[1];
	}

	// Function to calculate square
	int calcSquare() {
		return input_nums[0] * input_nums[0];
	}

	// Function to calculate cube
	int calcCube() {
		return input_nums[0] * input_nums[0] * input_nums[0];
	}

	// Function to calculate square root
	double calcSqrt() {
		return Math.sqrt(input_nums[0]);
	}

	// Function to calculate Fibonacci of given number
	int calcFib(int num) {
		if (num == 0) return 0;
		if (num == 1) return 1;

		int a = 0, b = 1;
		for (int i = 2; i <= num; i++) {
			int temp = a + b;
			a = b;
			b = temp;
		}
		return b;
	}

	// Function to calculate mean of an array
	double calcMean(int[] arr) {
		int sum = 0;
		for (int value : arr) {
			sum += value;
		}
		return (double) sum / arr.length;
	}

	// Function to calculate mode of an array
	int calcMode(int[] arr) {
		int mode = arr[0];
		int maxCount = 0;

		for (int i = 0; i < arr.length; i++) {
			int currentCount = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					currentCount++;
				}
			}
			if (currentCount > maxCount) {
				maxCount = currentCount;
				mode = arr[i];
			}
		}
		return mode;
	}
}
