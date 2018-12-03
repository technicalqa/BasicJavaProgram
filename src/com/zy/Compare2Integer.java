package com.zy;

import java.io.*;

public class Compare2Integer {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number1");
	    int num1=Integer.parseInt(br.readLine());
	    System.out.println("Number is :"+ num1);
	    System.out.println("enter number2");
	    int num2=Integer.parseInt(br.readLine());
	    System.out.println("Number is :"+ num2);
	    if (num1==num2)
	    	System.out.println("EQUAL");
	    else
	    	System.out.println("UNEQUAL");
	    
	}
	

}
