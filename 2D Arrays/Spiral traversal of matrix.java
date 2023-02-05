
// Given a matrix of size r*c, where r is number of rows and c is number of columns. Traverse the matrix in spiral form.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
	    int r,c;
	    Scanner sc = new Scanner(System.in);
	    r = sc.nextInt();
	    c = sc.nextInt();
	    int ans[] = new int[r*c+1];
	    int arr[][] = new int[r][c];
	    
	    for(int i=0; i<r; i++){
	      for(int j=0; j<c; j++){
	        arr[i][j] = sc.nextInt();
	      }
	    }
	    int cnt = 0;
	    int rs=0,re=r-1,cs=0,ce=c-1;
	    while (rs <= re && cs <= ce){
	      for(int i=cs; i<=ce; i++){
	        ans[cnt++] = arr[rs][i];
	      }
	      rs++;
	      for(int i=rs; i<=re; i++){
	        ans[cnt++] = arr[i][ce];
	      }
	      ce--;
	      for(int i=ce; i>=cs; i--){
	        ans[cnt++] = arr[re][i];
	      }
	      re--;
	      for(int i=re; i>=rs; i--){
	        ans[cnt++] = arr[i][cs];
	      }
	      cs++;
	    }
	    for(int i=0; i<r*c; i++){
	      System.out.print(ans[i]+" ");
	    }
		sc.close();
	}
}
