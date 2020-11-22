/*

Given a string S, find its length(including the spaces)without using any pre-defined functions.

Sample Testcase :
=================
INPUT
=====
codekata

OUTPUT
======
8

*/

//Method 1

/*
import java.util.Scanner;
class String_12 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String str=sa.nextLine();
		int length=0;
		char s[]=str.toCharArray();
		for(char c:s){
			length++;
		}
		System.out.print(length);
	}
}

*/

//Method 2

/*
import java.util.Scanner;
class String_12
{
	public static void main(String args[]){
	Scanner sa=new Scanner(System.in);
	String str=sa.nextLine();
	int i=0;
	try{
		for(i=0;;i++){
			str.charAt(i);
		}
	}
	catch(Exception e){
		
	}
	System.out.print(i);
}
}

*/