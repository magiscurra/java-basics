import java.util.Scanner;

public class IfStatement {
	public static void main(String ar[]) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int number=num.nextInt();
		
		if(number>=0) {
			System.out.println("Positive number");
		}else {
			System.out.println("Negative number");
		}
	}
		

}
