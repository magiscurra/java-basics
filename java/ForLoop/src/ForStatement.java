import java.util.Scanner;

public class ForStatement {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your values: ");
		int num=sc.nextInt();
		int sum=0;
		
		
		for(int i=0;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("Nunbers are: "+sum);
		
	}
}
