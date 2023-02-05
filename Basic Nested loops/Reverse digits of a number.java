
// Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.

// For example, if the input is 12345, the output should be 54321.

// Note: Input number will not have any trailing zeros.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long rev = 0;
		while(n > 0){
			long rem = n%10;
			rev = 10 * rev + rem;
			n /= 10;
		}
		System.out.println(rev);
        sc.close();
	}
}