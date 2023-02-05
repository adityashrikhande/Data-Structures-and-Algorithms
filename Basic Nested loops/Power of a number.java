
// Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java or C++ built-in method)

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		long ans = 1;
		for (int i=0; i<p; i++){
			ans *= n;
		}
		System.out.println(ans);
        sc.close();
	}
}
