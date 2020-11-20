/*

Rahul is given a task to manipulate a string, He hired you as a developer 
your task is to delete all the repeating characters and print the result left.

Input Description:
==================
You are given a string ‘s’

Output Description:
===================
Print the remaining string

Sample Input :
==============
mississipie

Sample Output :
===============
mpe

*/
import java.util.Scanner;
class String_9 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String str=sa.nextLine();
		String s[]=str.split("");
		int count=0;
		String result="";
		for(int i=0;i<s.length;i++){
			for(int j=i+1;j<s.length;j++){
				if(s[i].equals(s[j]) && !s[j].equals("-1")){
					s[i]="-1";
					s[j]="-1";
				}
			}
		}
		for(int i=0;i<s.length;i++){
			if(!s[i].equals("-1")){
				result+=s[i];
			}
		}
		System.out.print(result);
	}
}
