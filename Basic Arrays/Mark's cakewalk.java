
// Marc loves cupcakes, but he also likes to stay fit. Each cupcake has a calorie count, and Marc can walk a distance to burn those calories.

// On eating the jth cupcake with c calories, he must walk at least (2^j)*c miles to maintain his weight.

// For example, let calorie=[5,10,7]

// If he eats the cupcakes in the order shown, the miles he will need to walk are (20.5)+(21.10)+(22.7)=5+20+28=53. This is not the minimum, though, so we need to test other orders of consumption.

// In this case, our minimum miles is calculated as (20.10)+(21.7)+(22.5)=10+14+20=44.

// Given the individual calorie counts for each of the cupcakes, determine the minimum number of miles Marc must walk to maintain his weight.

// Note that he can eat the cupcakes in any order.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		long sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long[] calarr = new Long[n];
		for(int i=0; i<n; i++){
			calarr[i] = sc.nextLong();
		}
		Arrays.sort(calarr, Collections.reverseOrder());
		for(int i=n-1; i>=0; i--){
			sum += Math.pow(2, i)*calarr[i];
		}
		System.out.println(sum);
		sc.close();
	}
}