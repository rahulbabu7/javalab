package lab21;
import java.util.*;
class MathTable
{
	
		 synchronized void printTable(int n) {
			
			 for(int i=0;i<5;i++)
	       {  
	        System.out.println(n+"*"+i+"="+n*i);  
	        try
		{  
	        Thread.sleep(200);  
	        }
	        catch(Exception e)
	        {System.out.println(e);
		}  
	      }  
	     
	     }
}
class MulTab extends Thread
{
	int n;
	Table t;
	 MulTab(int n,Table t)
	   { 
		 this.n=n;
		 this.t=t;   }  
	   public void run()
	   {  
	   t.printTable(n);  
	   }   
}

public class MulTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table you wanna run by thread1:");
		int n1=sc.nextInt();
		System.out.println("Enter the table you wanna run by thread2:");
		int n2=sc.nextInt();
		System.out.println("Enter the table you wanna run by thread3:");
		int n3=sc.nextInt();
		Table obj = new Table(); 
		  
		MulTab t1=new MulTab(n1,obj);  
		MulTab t2=new MulTab(n2,obj);  
		   MulTab t3=new  MulTab(n3,obj);  
		   t1.start();  
		   t2.start();  
		   t3.start();
		   sc.close();
	}

}
