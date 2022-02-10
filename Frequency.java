package lab21;
import java.util.*;
public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE STRING :");
String str=sc.nextLine();
System.out.println("ENTER THE CHARACTER :");
char character=sc.nextLine().charAt(0);
int n;
n=str.length();
int c=0;
for(int i=0;i<n;i++)
{
	if(character==str.charAt(i))
	{
		c++;
	}
}
System.out.println("FREQUENCY of the string is "+c);
	}

}
