/*************************************************************************
 * Author: RAHUL BABU
 * Program: Inheritance
 * Date: 9th DECEMBER 2021
 * Version: 1.0
 **************************************************************************/

package lab21;
import java.util.*;
class employee1
{
	String name,address,phonenum;
	int age,salary;
	void printsalary()
    {
	System.out.println("Salary is"+salary);
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Phone Number:"+phonenum);
		System.out.println("Address:"+address);
	}
}
class officer extends employee1
{
	String specialization;
	
}
class manager extends employee1
{
	String department;
	
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
officer of=new officer();
manager m=new manager();
System.out.println("name of the officer:");
of.name=sc.nextLine();
System.out.println("age of the officer:");
of.age=sc.nextInt();
sc.nextLine();
System.out.println("phone number of the officer:");
of.phonenum=sc.nextLine();
System.out.println("address of the officer:");
of.address=sc.nextLine();
System.out.println("salary of the officer:");
of.salary=sc.nextInt();
sc.nextLine();
System.out.println("Specialization:");
of.specialization=sc.nextLine();

System.out.println("name of the manager:");
m.name=sc.nextLine();
System.out.println("age of the manager:");
m.age=sc.nextInt();
sc.nextLine();
System.out.println("phone number of the manager:");
m.phonenum=sc.nextLine();
System.out.println("address of the manager:");
m.address=sc.nextLine();
System.out.println("salary of the manager:");
m.salary=sc.nextInt();
sc.nextLine();
System.out.println("Department:");
m.department=sc.nextLine();
System.out.println("Details of the officer:");
of.display();
of.printsalary();
System.out.println("specialization is:"+of.specialization);
System.out.println("Details of the manager:");
m.display();
m.printsalary();
System.out.println("Department is"+m.department);
sc.close();





	}

}
