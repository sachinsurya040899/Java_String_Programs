/*

Given a string 'S' print the sum of weight of the String. 
A weight of character is defined as the ASCII value of corresponding character.

Input Description:
==================
You are given a string ‘s’

Output Description:
===================
Print weight

Sample Input :
==============
abc

Sample Output :
===============
294

*/
import java.util.Scanner;
class String_8 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String str=sa.nextLine();
		String s[]=str.split("");
		int sum=0;
		for(int i=0;i<s.length;i++){
			sum+=s[i].charAt(0);
		}
		System.out.print(sum);
	}
}
