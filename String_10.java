/*

Indian PAN card issuing authority have found some fake PAN cards. 
They have hired you so that you can validate PAN card for them. 
Your task is to develop a suitable algorithm which could check if pan is valid or not

1)Pan must have uppercase letters only.

2)It must be of 10 character only

3)From index 1 to 5 all must be letters(A-Z),last index must be letter

4)Rest all must be integer Starting from 1

Input Description:
==================
You are given a input string which indicates the PAN number

Output Description:
===================
Print 'pan' if it is valid PAN number, else print 'not pan'

Sample Input :
==============
HXTPS2142R

Sample Output :
===============
pan

*/
import java.util.Scanner;
class String_10 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String str=sa.next();
		String s[]=str.split("");
		int ucheck=6;
		int len=s.length;
		int lindex=len-1;
		int index_check=6;
		int number_check=4;
		if(len==10){
			for(int i=0;i<s.length;i++){
				if(s[i].charAt(0)>=65 && s[i].charAt(0)<=90){
					ucheck--;
				}
				if(i<=4 || i==lindex){
					if(s[i].charAt(0)>=65 && s[i].charAt(0)<=90){
						index_check--;
					}
				}
				if(i>4 && i<lindex){
					if(s[i].charAt(0)>=48 && s[i].charAt(0)<=57){
						number_check--;
					}
				}
			}
		}
		else{
			System.out.print("not pan");
		}
		if(index_check==0 && number_check==0 && ucheck==0){
			System.out.print("pan");
		}
		else if(len==10){
			System.out.print("not pan");
		}
	}
}