
// Given a 2D matrix mat of M rows and N columns , the task is to print the 2D matrix in an alternate manner.

// Alternate manner denotes that the elements of the odd rows (first row, third row, etc) will be printed from left to right, and the elements of the even rows(second row, fourth row, etc.) will be printed from right to left.

// For example, if M=3, then the first line will contain all the elements of the first row of the matrix from left to right. The second line will contain all the elements of the second row from right to left. The third line will contain all the elements of the third row from left to right.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int arr[][] = new int[n][m];
	    
	    for(int i=0; i<n; i++){
	      for(int j=0; j<m; j++){
	        arr[i][j] = sc.nextInt();
	      }
	    }
	    for(int i=0; i<n; i++){
	      for(int j=0; j<m; j++){
	        if (i%2 == 0){
	          System.out.print(arr[i][j] + " ");
	        }else{
	          System.out.print(arr[i][m-j-1] + " ");
	        }
	      }
	    }
		sc.close();
	}
}
