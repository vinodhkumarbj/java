package prog;

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    String A= sc.nextLine();
		    String B=sc.nextLine();
		    //if(A.compareTo(B)>0)
		    System.out.println(A.length()+B.length());
		    if(A.compareTo(B)>0)
		    System.out.println("yes");
		    else
		    	  System.out.println("no");
		    System.out.println(Character.toUpperCase(A.charAt(0))+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
		    	
		    
			}

	}


