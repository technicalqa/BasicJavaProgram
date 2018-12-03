package com.zy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountChar {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Input from String
				System.out.println("enter String");
				String s = br.readLine();
				System.out.println("String is :"+ s);
	}

}
