/*
You are given a string ‘s’. Your task is to print the characters which are not repeated with a single space in between the characters.

Input Description:
===================
You are given a string ‘s’.

Output Description:
===================
Print the characters present once and -1 if there is no character which satisfy above condition

Sample Input :
==============
dabbc

Sample Output :
===============
d a c

Input:
======
ddddddddabbc

Expected Output:
================
a c

*/
import java.util.Scanner;
public class String_1 {
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		String str=sa.nextLine();
		String ans="";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					i++;
					break;
				}
				else {
					ans=ans+str.charAt(i)+" ";
					break;
				}
			}
			if(i==str.length()-1 && (str.charAt(i-1)!=str.charAt(i))){
				ans=ans+str.charAt(i);
			}
		}
		if(!ans.equals(""))
			System.out.println(ans);
		else
			System.out.println("-1");
	}
}