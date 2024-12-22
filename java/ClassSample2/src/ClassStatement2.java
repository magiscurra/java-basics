import java.util.Scanner;

public class ClassStatement2 {
	public static void main(String ar[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		Sum s=new Sum();
		
		s.calculateSum(num1,num2);
		s.displaySum();
	}

}
