
// Given the 3 sides of a triangle, find out whether it is acute-angled, right-angled, or obtuse-angled.

// You need to output 1 for acute, 2 for right-angled, and 3 for an obtuse-angled triangle. You can assume that the input values always form a triangle and are valid integers.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc  = new Scanner(System.in);
		int a,b,c;
		int[] arr = new int[3];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		Arrays.sort(arr);
		
		a = arr[0];
		b = arr[1];
		c = arr[2];
		
		if (a*a + b*b < c*c){
				System.out.println(3);
		}else if(a*a + b*b > c*c){
				System.out.println(1);
		}else{
				System.out.println(2);
		}
		sc.close();
	}
}
