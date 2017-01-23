import java.io.InputStream;
import java.util.Scanner;


public class Executioner {

	public static void main (String args[]){
		Scanner s=new Scanner(System.in);
		Brain.range=s.nextInt();
		s.close();
		
		Brain b = new Brain();
		System.out.println (b.calculate());
		
	}
}
