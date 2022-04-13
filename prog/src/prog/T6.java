package prog;

import java.util.Arrays;
import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		   System.out.print("Enter first String: ");
		    String str1 = input.nextLine();
		    System.out.print("Enter second String: ");
		    String str2 = input.nextLine();
		    if(str1.length() == str2.length()) {
		     char[] A= str1.toCharArray();
		      char[] B = str2.toCharArray();
		      Arrays.sort(A);
		      Arrays.sort(B);
		     if(Arrays.equals(A,B)==true) {
		        System.out.println( " anagram");
		      }
		      else {
		        System.out.println( "  not anagram");
		      }
		    
		    }
		    }

}
