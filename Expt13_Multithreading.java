package lab21;

import java.util.Random;

class EvenThread extends Thread
{
	int n;
	EvenThread (int a){
		n = a;
	}
	public void run()
	{
	//square
		System.out.println("Square of " + n + " = " + (n * n));
	}
}
class OddThread extends Thread
{	int n;
	OddThread (int a){
		n = a;
	}
	public void run()
	{
	//cube
		System.out.println("Cube of " + n + " = " + n*n*n);
	}
}
class RandThread extends Thread
{
	public void run()
	{ 
	//create random number and check odd/even
		
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			int x = r.nextInt(100);
			System.out.println("Random Integer generated : " + x);
			if((x%2) == 0) {
				EvenThread e = new EvenThread(x);
				e.start();
			}
			else {
				OddThread o = new OddThread(x);
				o.start();
			}
			try {
				Thread.sleep(1500);
			} 
			catch (InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}
}

public class Expt13_Multithreading {
	public static void main(String[] args) {
		RandThread r = new RandThread();
		r.start();
	}
}
