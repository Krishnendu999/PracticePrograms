import java.util.Scanner;

public class Executioner {

	public static void Outputs(CommonFuncs comfunc) {
		System.out.println(comfunc.Area());

	}

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Enter the Length in metres:");
		Shapes.length = (Scan.nextInt());

		System.out.println("Enter the Breadth in metres:");
		Shapes.breadth = (Scan.nextInt());

		Scan.close();
		CommonFuncs cf2 = new Square();
		Outputs(cf2);

	}

}
