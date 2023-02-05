
// You are given a chessboard of size N x N, where the top left square is black. Each square contains a value. Find the sum of the values of all black squares and all white squares.

// Remember that in a chessboard, black and white squares are alternate.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		long blackSum = 0;
		long whiteSum = 0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if ((i+j)%2 == 0){
					blackSum += arr[i][j];
				}else{
					whiteSum += arr[i][j];
				}
			}
		}
		System.out.println(blackSum);
		System.out.println(whiteSum);
		sc.close();
	}
}
