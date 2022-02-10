package lab21;
import java.util.*;
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		String revstr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
		ch=str.charAt(i);
		revstr=ch+revstr;
		}
		if(str.equals(revstr))
		{
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println("NOT PALINDROME");
		}
			}

		}
