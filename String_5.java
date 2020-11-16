/*

You are given a paragraph.Your task is to print the words that come just after articles.

Input Description:
==================
You are given a string ‘s’

Output Description:
===================
print the words that come just after articles and -1 if there are no articles

Sample Input :
==============
The sun rises in the east

Sample Output :
===============
sun east

Input:
======
The dog bargs

Expected Output:
================
dog

*/
import java.util.Scanner;
import java.util.ArrayList;
class String_5 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String s=sa.nextLine();
		String str[]=s.split(" ");
		ArrayList ar=new ArrayList();
		int count=0;
		for(int i=0;i<str.length;i++){
			if(str[i].equals("the") || str[i].equals("The") || str[i].equals("a") || str[i].equals("A") || str[i].equals("an") || str[i].equals("An")){
				count++;
				ar.add(str[i+1]);
			}
		}
		if(count==0){
			System.out.print("-1");
		}
		else{
			for(int i=0;i<count;i++){
				if(i==count-1){
					System.out.print(ar.get(i));
				}
				else{
					System.out.print(ar.get(i)+" ");
				}
			}
		}
	}
}
