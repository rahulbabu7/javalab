/***********************************************************************************
 * Author: RAHUL BABU
 * Program:  java program to find gross salary of employee and engineer.
 * Date:16th December 2021
 * version:1.0
 **************************************************************************************/
package lab21;
import java.util.*;
class Employee
{
	double salary,sal;
	double har,da;
	void display()
	{
		System.out.println("Name of the class is EMPLOYEE");
		
	}
	void calcsalary()
	{
		sal=salary+(da/100*salary)+(har/100*salary);
		System.out.println("The gross salary of the employee is :"+sal);
		
	}	
}
class Engineer extends Employee
{
	void display()
	{
		super.display();
		super.calcsalary();
		System.out.println("Name of the class is ENGINEER");
		
	}
	void calcsalary()
	{
		System.out.println("The gross salary of the engineer is :"+2*sal);
		
	}
}
public class EmployeeEngineer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
Engineer eng=new Engineer();

System.out.println("Enter the base salary of the employee:");
eng.salary=sc.nextDouble();
System.out.println("Enter the DA of the employee:");
eng.da=sc.nextDouble();
System.out.println("Enter the HAR of the employee:");
eng.har=sc.nextDouble();
eng.display();
eng.calcsalary();
sc.close();






	}

}
