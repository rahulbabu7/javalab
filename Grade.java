package lab21;
import java.util.*;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("enter mark1");
		int mark1 = sc.nextInt();
		System.out.println("enter mark2");
		int mark2 = sc.nextInt();
		System.out.println("enter mark3");
		int mark3 = sc.nextInt();
		int total = mark1+mark2+mark3;
		System.out.println("total "+total);
		float average = total/3;
		System.out.println("average " +average);
		if(mark1>=90)
		{
			System.out.print(" A grade");
		}
		else if(mark1<90&&mark1>=70)
		{
			System.out.print(" B grade");
		}
		else if(mark1<70&&mark1>=50)
		{
			System.out.print(" PASS");
		}
		else
		{
			System.out.print(" FAIL");
		}
		if(mark2>=90)
		{
			System.out.print(" A grade");
		}
		else if(mark2<90&&mark2>=70)
		{
			System.out.print(" B grade");
		}
		else if(mark2<70&&mark2>=50)
		{
			System.out.print(" PASS");
		}
		else
		{
			System.out.print(" FAIL");
		}
		if(mark3>=90)
		{
			System.out.print(" A grade");
		}
		else if(mark3<90&&mark3>=70)
		{
			System.out.print(" B grade");
		}
		else if(mark3<70&&mark3>=50)
		{
			System.out.print(" PASS");
		}
		else
		{
			System.out.print(" FAIL");
		}
		System.out.println(" \nenter the number of days present ");
		float a = sc.nextInt();
		System.out.println("enter total days ");
		float b = sc.nextInt();
		float percentage = (a/b)*100;
		System.out.println("Attendance percentage " +percentage);
		
		
		
		
		
		
		
		
			
		
		
		
		
		

	}

}
