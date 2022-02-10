/***********************************************************************************
 * Author: RAHUL BABU
 * Program: Java program to calculate the area of different shapes namely circle, rectangle, and triangle using the concept of method overloading.
 * Date:9th December 2021
 * version:1.0
 **************************************************************************************/

package lab21;
import java.util.*;
class area
{
	void area(double b,double h)
	{
		double triangle=(b*h)/2;
		System.out.println("Area of the triangle is:"+triangle);
	}
	void area(int l,int b)
	{
		int rectangle=(l*b);
		System.out.println("Area of the rectangle is:"+rectangle);
	}
	void area(double r)
	{
		double circle=(3.14*r*r);
		System.out.println("Area of the circle is:"+circle);
	}
}


public class AreaOfShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		area ob=new area();
		System.out.println("Enter the base and height of the triangle:");
		double b=sc.nextDouble();
		double h=sc.nextDouble();
		ob.area(b,h);
		System.out.println("Enter the length and breadth of the rectangle:");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		ob.area(length,breadth);
		System.out.println("Enter the radius of the circle:");
		double r=sc.nextDouble();
		ob.area(r);
		

	}

}

