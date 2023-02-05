package Quick_sort_and_Mergesort;

// The previous challenges covered, which is a simple and intuitive sorting algorithm with a running time of (On^2) . In these next few challenges, we are covering a divide-and-conquer algorithm called (also known as Partition Sort). This challenge is a modified version of the algorithm that only addresses partitioning. It is implemented as follows:

// Step 1: Divide
// Choose some pivot element, p , and partition your unsorted array, arr , into three smaller arrays: left , right , and equal , where each element in left <p , each element in right >p , and each element in equal =p .

// In this challenge, the pivot will always be at arr[0], so the pivot is 5 .

// Given arr and p=arr[0] , partition arr into left , right , and equal using the Divide instructions above. Return a 1-dimensional array containing each element in left first, followed by each element in equal , followed by each element in right .

import java.util.*;

class Main
{

	public static void partition(int[] arr, int low, int high){
		int pivot = arr[low];
		int i=low;
		int cnt = 0;
		for(int j=low+1; j<=high; j++){
			if(arr[j] < pivot){
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
			}
			if(arr[j] == pivot){
				cnt++;
			}
		}
		
		int j = i;
		while(cnt > 0 && j <= high){
			if(arr[j] == pivot){
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
				cnt--;
			}
			j++;
		}	
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)arr[i] = sc.nextInt();

		int ans[] = new int[n];
		int k = 0;
		int pivot = arr[0];
		for(int i=0; i<n; i++){
			if(arr[i] < pivot){
				ans[k++] = arr[i];
			}
		}
		for(int i=0; i<n; i++){
			if(arr[i] == pivot){
				ans[k++] = arr[i];
			}
		}
		for(int i=0; i<n; i++){
			if(arr[i] > pivot){
				ans[k++] = arr[i];
			}
		}

		for(int i=0; i<n; i++)System.out.print(ans[i] + " ");
        sc.close();
	}
}
