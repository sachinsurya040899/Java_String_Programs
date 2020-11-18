/*

You are given a string ‘s’. Your task is to tell whether string is beautiful or not.
A beautiful string is a string in which String starts with ‘a’ or ‘A’ and middle element
is either ‘m’ or ‘M’ and last element is ‘z’or ‘Z’
 

Input Description:
==================
You are given a string ‘s’.

Output Description:
===================
Print 1 if string is beautiful and 0 if it is not

Sample Input :
===============
Amz

Sample Output :
===============
1

Input:
======
Amz

Expected Output:
================
1

Input:
======
anmjhuiljvhkbjlnmhghlihfsdrgbnmlkjhgfxcvbnmmnbvcxcvbnmmnbvc

Expected Output:
================
0

*/
import java.util.Scanner;
class String_7 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String str=sa.nextLine();
		String s[]=str.split("");
		int len=s.length;
		int div=len/2;
		if((s[0].equals("a") || s[0].equals("A")) && (s[div].equals("m") || s[div].equals("M")) && (s[len-1].equals("z") || s[len-1].equals("Z"))){
			System.out.print("1");
		}
		else{
			System.out.print("0");
		}
	}
}
