/*

You are given a ‘true’ string. String is called true if weight of string 
is multiple of 8. Your task is to tell whether a string can be declared True or Not. 
Weight of string is the sum of ASCII value of Vowel character(s) present in the string.

Input Description:
==================
You are given as string ‘s’ in lower cases

Output Description:
===================
Print 1 for true and 0 for false

Sample Input :
==============
raja

Sample Output :
===============
0

Input:
======
zara

Expected Output:
================
0

*/
import java.util.Scanner;
class String_4 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String str=sa.nextLine();
		String s[]=str.split("");
		int sum=0;
		for(int i=0;i<s.length;i++){
			if(s[i].equals("a") || s[i].equals("e") || s[i].equals("i") || s[i].equals("o") || s[i].equals("u") ||s[i].equals("A") || s[i].equals("I") || s[i].equals("O") || s[i].equals("U")){
				sum+=s[i].charAt(0);
			}
		}
		if(sum%8==0){
			System.out.print("1");
		}
		else{
			System.out.print("0");
		}
	}
}
