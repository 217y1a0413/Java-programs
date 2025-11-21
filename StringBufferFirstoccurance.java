package com.codegnan.stringexamples;

import java.util.Scanner;

public class StringBufferFirstoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter User Input: ");
        String userInput=sc.nextLine();
        StringBuffer str1=new StringBuffer(userInput);
        System.out.println("Enter  string to delete :");
      	String deletestr=sc.nextLine();
      	StringBuffer str2=new StringBuffer(deletestr);
      	int index=str1.indexOf(deletestr);
      	if(index!=-1) {
      		str1.delete(index, index+str2.length());
      		
      	}
      	System.out.println(str1);
      	sc.close();

	}

}
