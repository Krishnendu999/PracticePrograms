import java.util.Scanner;

public class Executioner {

	public static void main(String[] args) {

		System.out.println("YOU ARE USING THE BETA CALC v1.0 - 10.10.2016");

		Scanner scan = new Scanner(System.in);
		String nextinput = "N";
		String inputoperation = "NA";

		do {
			System.gc();

			System.out.println("  ");
			System.out.println("Enter the first number");
			double firstint = scan.nextDouble();
			System.out.println("Enter the second number");
			double secondint = scan.nextDouble();

			System.out.println("Choose operation :- ");
			System.out.println("A. Addition");
			System.out.println("S. Substraction");
			System.out.println("M. Multiplication");
			System.out.println("E. Exit");

			inputoperation = (scan.next()).toUpperCase();

			if (!"E".equals(inputoperation)) {

				@SuppressWarnings("unused")
				Machine mach1 = new Machine(firstint, secondint, inputoperation);

				System.out.println("Try Again: Y/N ");
				nextinput = (scan.next()).toUpperCase();
				mach1 = null;
			} else {
				nextinput = "N";
			}

		}

		while ("Y".equals(nextinput));
		System.out
				.println("Thanks. Find the source code here :- https://github.com/Krishnendu999/Learn/blob/master/Calculator.zip");

		scan.close();
	}

}
