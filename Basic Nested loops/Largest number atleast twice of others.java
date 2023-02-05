
// You are given an integer array nums where the largest integer is unique.

// Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, print the index of the largest element, or print -1 otherwise.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int maxi = 0;
    int smax = 0;
    int ind = 0;
    for(int i=0; i<n; i++){
      int in = sc.nextInt();
      if(in > maxi){
        smax = maxi;
        ind = i;
        maxi = in; 
      }else{
        if (in >= smax){
          smax = in;
        }
      }
    }
    //System.out.println(maxi + " "+ smax);
    if (maxi >= 2*smax){
      System.out.println(ind);
    }else{
      System.out.println(-1);
    } 
    sc.close();   
	}
}
