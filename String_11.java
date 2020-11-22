/*

You are given a string ‘s’.Your task is to print the string 
in the order they are present and then sum of digits.

Input Description:
==================
You are given a string ‘s’.

Output Description:
===================
Print the string and then at last sum of all the digits

Sample Input :
==============
AC30BD40

Sample Output :
===============
ACBD7

*/
import java.util.Scanner;
class String_11 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String str=sa.next();
		String s[]=str.split("");
		int sum=0;
		String res="";
		for(int i=0;i<s.length;i++){
			if(s[i].charAt(0)>=48 && s[i].charAt(0)<=57){
				int num=Integer.parseInt(s[i]);
				sum+=num;
				s[i]="-1";
			}
		}
		for(int i=0;i<s.length;i++){
			if(!s[i].equals("-1")){
				res+=s[i].charAt(0);
			}
		}
		res+=sum;
		System.out.print(res);
	}
}