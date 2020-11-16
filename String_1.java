/*

You are given with a string which comprises of some numbers. 
Your task is to find the largest integer by converting the string to the corresponding integer.

Input Description:
==================
First line contains n denoting number of Test Cases. 
The first and only Line of testcase has the string

Output Description:
===================
Print the largest number

Sample Input :
==============
I was born on 12 october 1998.

Sample Output :
===============
1998

Input:
======
India got independence on 15 august 1947. But they were fighting for it for last 90 years.

Expected Output:
================
1947

*/
import java.util.Scanner;
public class  String_1
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String str=sa.nextLine();
		String s[]=str.split(" ");
		int max=0;
		int min=0;
	    for(int i=0;i<s.length;i++){
			if((s[i].charAt(0)>=65 && s[i].charAt(0)<=90) || (s[i].charAt(0)>=97 && s[i].charAt(0)<=122)){
				continue;
			}
			else{
				String s1[]=s[i].split("");
				String res="";
				for(int j=0;j<s1.length;j++){
					if(s1[j].charAt(0)>=48 && s1[j].charAt(0)<=57){
						res+=s1[j].charAt(0);
					}
					else{
						continue;
					}
				}
				s[i]=res;
				max=Integer.parseInt(s[i]);
				if(max>min){
					min=max;
					max=0;
				}
			}
		}
		System.out.print(min);
	}
}
