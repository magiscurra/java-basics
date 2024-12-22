import java.util.Scanner;

public class FunctionStatement {
	
	public static void main(String arr[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int result=sum(num1,num2);
		System.out.println("Result: "+result);
		
	}
	
	    static int sum(int a,int b) {
		int sum=a+b;
		return sum;
		
	}

}
