import java.util.Scanner;

public class Executioner {

	public static void main(String[] args) {
		
		System.out.println("Find the greatest among n values - v1.0 11-10-2016");
		Scanner scan = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Define n :- ");
		Bucket.Arraywidth = scan.nextInt();
		System.out.println("Arraywidth set : " + Bucket.Arraywidth);
		Bucket balti = new Bucket();

		System.out.println("Enter the " + (Bucket.Arraywidth)
				+ " numbers to compare");
		for (int i = 0; i < Bucket.Arraywidth; i++) {

			System.out.println("Input the data for position[" + i + "] :");
			balti.myArray[i] = scan.nextInt();

		}

		System.out.println("The greatest number is : " + balti.Compute());
		scan.close();

	}

}
