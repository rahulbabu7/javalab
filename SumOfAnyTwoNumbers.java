package lab21;
import java.util.Scanner;

public class SumOfAnyTwoNumbers {

	public static void main(String[] args) {
		int num1 , num2 , sum ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		num1 = sc.nextInt();
		
		System.out.println("enter the second number");
		num2 = sc.nextInt();
		
		sc.close();
		 sum = num1 + num2;
	        System.out.println("Sum of these numbers: "+sum);
		

	}

}
