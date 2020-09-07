import java.util.Scanner;
// Debugging.java

public class Debugging {

	/* Method purpose: This method calculates the average (sum of numbers/quantity of numbers)
	 * Parameters: number1, number2, and number 3, the three integer numbers that will be averaged
	 * Return: a double that holds the average of the three parameters
	 *
	 */
	public static double average(int number1, int number2, int number3) {
		return number1 + number2 + number3 / 3;
	}


  /* Method purpose: This method calculates the average (sum of numbers/quantity of numbers) of three numbers entered through console input.
	 * Parameters: none
	 * Return: a double that holds the average of the three inputted numbers
	 *
	 */
	public static double averageFromInput() {
		Scanner scnr = new Scanner();
		int num1 = scnr.nextInt();
		int num2 = scnr.nextInt();
		int num3 = scnr.nextInt();
		return (num1 + num2 + num3) / 3;
	}

	/* Method purpose: This method calculates the sum
	 * Parameters: number1, number2, and number 3, the three integer numbers that will be summed
	 * Return: ain int that holds the sum of the three parameters
	 *
	 */
	public static int sum(int number1, int number2, int number3) {
		return number1 + number2 + number3;


	/* Method purpose: This method calculates the sum of three numbers entered through console input.
	 * Parameters: none
	 * Return: an int that holds the sum of the three inputted numbers
	 *
	 */
	public static int sumFromInput() {
		Scanner scnr = new Scanner(System.in);
		int num1 = scnr.nextInt();
		int num2 = scnr.nextInt()
		int num3 = scnr.nextInt();
		return num1 + num2 + num3;
	}

	public static void main (String[] args) {

	}


}
