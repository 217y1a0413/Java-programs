package com.codegnan.stringexamples;

import java.util.Scanner;

public class StringBufferFirstCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter User Input: ");
        String userInput=sc.nextLine();
        StringBuffer str1=new StringBuffer(userInput);
        
        StringBuffer s=str1.delete(0, 1);
        System.out.println(s);
        sc.close();
	}

}
