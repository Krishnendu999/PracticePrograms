import java.util.Scanner;

public class Executioner {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		Brain b = new Brain();
		
		System.out.println("Enter the number of digits to be sorted: ");
		Brain.n = s.nextInt();
		int[] TempArray = new int[Brain.n];
		
		System.out.println("Enter the digits");
			for (int n = 0; n < TempArray.length; n++) {
				TempArray[n] = s.nextInt();
			}

		b.setActualArray(TempArray);

		System.out.println("UnSorted array is : ");
		System.out.println(java.util.Arrays.toString(b.getActualArray()));
		System.out.println("Sorted array is : ");
		System.out.println(java.util.Arrays.toString(b.Compute()));

		System.out.println("This Array is sorted using Bubbles Sort Algorithm");
	}

}
