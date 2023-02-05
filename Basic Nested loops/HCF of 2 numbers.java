
// Given two number a and b, find their HCF.

// What Is HCF?

// HCF or Highest Common Factor is the greatest common divisor between two numbers.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long  ans = 0;
		while (true){
			long mini = Math.min(a, b);
			long maxi = Math.max(a, b);
			a = mini;
			b = maxi;    
			if ((a == 0) || (a == b)) {
				ans = b;
				break;
			}
			if (b == 0){
				ans = a;
				break;
			}
			b = b%a;
		}
		System.out.println(ans);
        sc.close();
	}
}
