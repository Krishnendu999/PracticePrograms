import java.util.Scanner;
public class Executioner {

	public static void main(String[] args) {
		int result;
		Shapes s1 =new Shapes();
		Square sq=new Square();
		Square sq1=new Shapes();
	Scanner Scan=new Scanner(System.in);
	System.out.println ("");
	s1.setLength(Scan.nextInt());
	s1.setBreadth(Scan.nextInt());
	Scan.close();
	
	result=s1.Area();
	System.out.println (result);
	
	}

}
