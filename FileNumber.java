package lab21;
import java.io.*;
import java.util.Scanner;

public class FileNumber {

	public static void main(String[] args) throws IOException{
		  File myFile = new File("numbers.txt");
	        File myFile1 = new File("odd.txt");
	        File myFile2 = new File("even.txt");

	        FileOutputStream fout = new FileOutputStream("numbers.txt"); //,true);
	        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

	        System.out.println("Enter Data");
	        String s=br1.readLine();
	        char ch[] = s.toCharArray();
	        for (int i = 0; i < s.length(); i++)
	        {
	            fout.write(ch[i]);
	        }
	        System.out.println("Data added");

	        FileReader fin = new FileReader("numbers.txt");
	        BufferedReader br = new BufferedReader(fin);
	        String inp = br.readLine();
	        FileWriter oddfr = new FileWriter("odd.txt");
	        FileWriter evenfr = new FileWriter("even.txt");
	        for(String element: inp.split(" ")){
	            if(Integer.parseInt(element)%2==0) {
	                evenfr.write(element+" ");
	            }
	            else {
	                oddfr.write(element+ " ");
	            }
	        }
	        oddfr.close();
	        evenfr.close();

	        FileInputStream fin0 = new FileInputStream("numbers.txt");
	        FileInputStream fin1 = new FileInputStream("odd.txt");
	        FileInputStream fin2 = new FileInputStream("even.txt");

	        System.out.println("Contents of numbers.txt ----");
	        int i=0;
	        while ((i = fin0.read()) != -1) {
	            char c = (char) i;
	            System.out.print(c);
	        }
	        System.out.println("\nContents of odd.txt ----");
	         i=0;
	        while ((i = fin1.read()) != -1) {
	            char c = (char) i;
	            System.out.print(c);
	        }
	        System.out.println("\nContents of even.txt ----");
	        i=0;
	        while ((i = fin2.read()) != -1) {
	            char c = (char) i;
	            System.out.print(c);
	        }



	}

}
