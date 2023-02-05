
// Given a number N and a digit D. Write a program to find how many times the digit D appears in the number N.

import java.util.*;

class Main
{
	public static int solve(String text, String s){
		int index = 0;
		int count = 0;
		while(true){
			index = text.indexOf(s, index);
			if (index != -1){
				count++;
				index += s.length();
			}else{
				break;
			}
		}
		return count;
	}
        
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		String a  = n + "";
		String b = d + "";

		int count = solve(a, b);

		System.out.println(count);
        sc.close();      
	}
}