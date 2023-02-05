
// You are given a n x n 2-D matrix representing an image, rotate the image by 90 degrees (clockwise).

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
	    Scanner sc = new Scanner(System.in);
	    int m,n;
	  	m = sc.nextInt();
	    n = sc.nextInt();
	    int arr[][] = new int[m][n];
	    
	    for(int i=0; i<n; i++){
	      for(int j=0; j<n; j++){
	        arr[i][j] = sc.nextInt();
	      }
	    }

	    for(int i=0; i<n/2; i++){
	      for(int j=i; j<n-i-1; j++){
	        int temp = arr[i][j];
	        arr[i][j] = arr[n-j-1][i];
	        arr[n-j-1][i] = arr[n-i-1][n-j-1];
	        arr[n-i-1][n-j-1] = arr[j][n-i-1];
	        arr[j][n-i-1] = temp;
	      }
	    }
	    for(int i=0; i<n; i++){
	      for(int j=0; j<n; j++){
	        System.out.print(arr[i][j]+" ");
	      }System.out.println();
	    }
		sc.close();
	}
}