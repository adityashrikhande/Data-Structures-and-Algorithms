
// Great scientific discoveries are often named by the last names of scientists that made them. For example, the most popular asymmetric cryptography system, RSA was discovered by Rivest, Shamir and Adleman. Another notable example is the Knuth-Morris-Pratt algorithm, named by Knuth, Morris and Pratt.

// Scientific papers reference earlier works a lot and it’s not uncommon for one document to use two different naming conventions: the short variation (e.g. KMP) using only the first letters of authors last names and the long variation (e.g. Knuth-Morris-Pratt) using complete last names separated by hyphens.

// We find mixing two conventions in one paper to be aesthetically unpleasing and would like you to write a program that will transform long variations into short.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();

		String ans = "";
		ans += s.charAt(0);
		for(int i=1; i<n; i++){
			if (s.charAt(i) == '-'){
				ans += s.charAt(i+1);
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
