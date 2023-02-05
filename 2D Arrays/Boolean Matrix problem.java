
// You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1.

// Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to return the modified matrix.

// Your task is to complete the function BooleanMatrixProblem which takes m, n and the input array as the parameter and returns the modified matrix as specified in the question.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if (arr[i][j] == 1){
					for(int k = 0; k<n; k++){
						arr[i][k] = 1;
					}
					break;
				}
			}
		}
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
