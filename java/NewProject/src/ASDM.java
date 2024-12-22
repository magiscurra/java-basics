import java.util.Scanner;

public class ASDM {
	public static void main(String ar[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		
		Add s=new Add();
		
		s.calculateAddd(num1, num2);
		s.displayAdd();
		
		Subract n=new Subract();
		
		n.calculateDivident(num1, num2);
		n.displayDivident();
		
		Multiply m=new Multiply();
		
		m.calculateProduct(num1, num2);
		m.displayMultipy();
		
		Divide d=new Divide();
		
		d.calculateDivisor(num1, num2);
		d.displayDivisor();
	}

}
