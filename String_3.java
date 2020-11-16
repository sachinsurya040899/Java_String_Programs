/*

Write a program to get a string S, 
Type of conversion (1 - Convert to Lowercase, 2 - Convert to Uppercase) T, 
and integer P . Convert the case of the letters in the positions which are 
multiples of P.(1 based indexing).

Input Description:
==================
Given a string S, Type of conversion T, and integer P

Output Description:
===================
Convert the case of the letters and print the string

Sample Input :
==============
ProFiLe
1
2

Sample Output :
===============
Profile

*/
import java.util.Scanner;
class String_3 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String str=sa.nextLine();
		int t=sa.nextInt();
		int p=sa.nextInt();
		String s[]=str.split("");
		String result="";
		int p1=p;
		int p2=p-1;
		if(t==1){
			for(int i=0;i<s.length;i++){
				if((p1%p==0 && i==p2) && (s[i].charAt(0)>=65 && s[i].charAt(0)<=90)){
					result=result+(char)(s[i].charAt(0)+32);
					p2=p2+p;
				}
				else{
					if(i==p2){
						p2=p2+p;  
					}
					result+=s[i].charAt(0);
				}
				p1=p1*p;
			}
		}
		else{
			for(int i=0;i<s.length;i++){
				if((p1%p==0 && i==p2) && (s[i].charAt(0)>=97 && s[i].charAt(0)<=122)){
					result=result+(char)(s[i].charAt(0)-32);
					p2=p2+p;
				}
				else{
					if(i==p2){
						p2=p2+p;  
					}
					result+=s[i].charAt(0);
				}
				p1=p1*p;
			}
		}	
		System.out.print(result);
	}
}
