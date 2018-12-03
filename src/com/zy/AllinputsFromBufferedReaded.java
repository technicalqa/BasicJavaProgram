package com.zy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllinputsFromBufferedReaded {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//INPUT FROM INTEGER
		System.out.println("enter number1");
		int number =Integer.parseInt(br.readLine());
		System.out.println("Number is :"+ number);
		//Input from String
		System.out.println("enter String");
		String s = br.readLine();
		System.out.println("String is :"+ s);
	}

}
