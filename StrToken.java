package lab21;


import java.io.*;
import java.util.*;
  

public class StrToken {

	 public static void main(String[] args) throws IOException {
		 System.out.println("Enter the values: ");
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String str = br.readLine();
	        int size;
	        int[] arr = new int[(size=str.length())];
	        StringTokenizer st = new StringTokenizer(str);
	        for(int i=0; st.hasMoreTokens(); ++i) {
	            arr[i] = Integer.parseInt(st.nextToken());
	        }
	        int sum=0;
	        for(int i=0; i<size; ++i) {
	            sum += arr[i];
	        }
	        System.out.println("The sum of the numbers is: "+sum);
	    }
	
		    }
		
	


