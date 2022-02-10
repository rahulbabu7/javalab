/***********************************************************************************
 * Author: RAHUL BABU
 * Program:  java program to create an abstract class named Shape that contains an empty method named numberOfSides.
 * Date:16th December 2021
 * version:1.0
 **************************************************************************************/
package lab21;
abstract class Shape
{
	abstract void numberofsides();
	
}
class rectangle extends Shape
{
	void numberofsides()
	{
		System.out.println("I am Rectangle,I have 4 sides");
	}
}
class triangle extends Shape
{
	void numberofsides()
	{
		System.out.println("I am Triangle,I have 3 sides");
	}
}
class hexagon extends Shape
{
	void numberofsides()
	{
		System.out.println("I am Hexagon,I have 6 sides");
	}
}
public class AbstractShape {

	public static void main(String[] args) {
		rectangle r=new rectangle();
		r.numberofsides();
		triangle t=new triangle();
		t.numberofsides();
		hexagon h=new hexagon();
		h.numberofsides();
		
		

	}

}
