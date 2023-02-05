
// Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.

import java.util.*;

class Main
{
  public static void Transpose(int arr[][], int n){
    int temp;
    for(int i=0; i<n; i++){
      for(int j=0; j<i; j++){
        temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      } 
    }
  }
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[][] = new int[n][n];
    
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        arr[i][j] = sc.nextInt();
      }
    }
    
    Transpose(arr, n);
    
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        System.out.print(arr[i][j]+" ");
      }System.out.println();
    }
	sc.close();
	}
}
