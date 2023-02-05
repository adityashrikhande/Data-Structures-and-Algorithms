package Quick_sort_and_Mergesort;


// In an array, arr , the elements at indices i and j (where i < j ) form an inversion if arr[i] > arr[j]. In other words, inverted elements arr[i] and arr[j] are considered to be "out of order". To correct an inversion, we can swap adjacent elements.

import java.util.*;

class Main
{
	public static int inv_count = 0;
	
	public static void merge(int[] arr, int low, int mid, int high, int temp[]){
			
		int l = low;
		int r = mid;
		int k = low;

		while(l < mid && r <= high){
			if(arr[l] > arr[r]){
				temp[k++] = arr[r++];
				Main.inv_count += mid-l;
			}else{
				temp[k++] = arr[l++];
			}
		}
		while(l < mid){
			temp[k++] = arr[l++];
		}
		while(r <= high){
			temp[k++] = arr[r++];
		}
		for(int i=low; i<=high; i++){
			arr[i] = temp[i];
		}
	}

        public static void mergeSort(int[] arr, int l, int r, int[] ans){
			if(l == r){
					return;
			}
			int mid = l + (r-l)/2;
			
			mergeSort(arr, l, mid, ans);
			mergeSort(arr, mid+1, r, ans);

			merge(arr, l, mid+1, r, ans);
                
        }
        
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		for(int k=0; k<d; k++){
			int n = sc.nextInt();
			int arr[] = new int[n];

			for(int i=0; i<n; i++){
					arr[i] = sc.nextInt();
			}
			Main.inv_count = 0;
			int[] ans = new int[n];
			mergeSort(arr, 0, n-1, ans);
			
			System.out.println(Main.inv_count);
		}
		sc.close();
	}
}
