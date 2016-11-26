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
			for (int item1 : b.getActualArray()) {
				System.out.println(item1);
			}

		System.out.println("Sorted array is : ");
			for (int item2 : b.Compute()) {
				System.out.println(item2);
			}

		System.out.println("This Array is sorted using Selection Sort Algorithm");
	}

}
