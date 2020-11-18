/*

You are given string ‘s’. Your task is to modify the string as mentioned below:-
1)The string should not have three consecutive same characters.

Input Description:
==================
You are given a string ‘s’

Output Description:
===================
print the required answer in a new line.

Sample Input :
==============
aabbbcc

Sample Output :
===============
1

Input:
======
xxwwwyy

Expected Output:
================
1

Input:
======
aaakaa

Expected Output:
================
1

*/
import java.util.Scanner;
class String_6 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String s=sa.nextLine();
		String str[]=s.split("");
		int len=str.length;
		int count=0;
		int res=0;
		for(int i=0;i<str.length;i++){
			for(int j=i;j<str.length;j++){
				if(str[i].equals(str[j])){
					res++;
				}
				count++;
				if(count==3){
					break;
				}
			}
			if(res>=3){
				System.out.print("1");
				break;
			}
			count=0;
			res=0;
		}
	}
}
