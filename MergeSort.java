/*
Q4. Merge Sort
Write a recursive program to implement Merge Sort.
Test Cases:
 Input: [38, 27, 43, 3, 9, 82, 10] → Output: [3, 9, 10, 27, 38, 43, 82]
 Input: [5, 4, 3, 2, 1] → Output: [1, 2, 3, 4, 5] 
*/
import java.util.Scanner;
class MergeSort{
	static void mergeSort(int arr[] , int left , int right){
		if(left < right){
			int mid = (left+right)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left, mid , right);
			
		}
	}
	static void merge(int []arr,  int left ,int mid , int right ){
		int[] temp = new int[right-left+1];
		int i = left;     // starting index of left half
		int k = 0;        
		int j = mid+1;    // starting index of right half
		while(i <= mid && j <= right){
			if(arr[i] < arr[j]){
				temp[k++] = arr[i++];
			}
			else{
				temp[k++] = arr[j++];
			}
			
		}
		while(i <= mid){
			temp[k++] = arr[i++];
		}
		while(j <= right){
			temp[k++] = arr[j++];
		}
		for(int x = 0 ; x < temp.length ; x++){
			arr[left+x] =temp[x];
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
        System.out.println("Enter elements of array ");
		for(int i = 0 ; i < n ; i++){
			arr[i] = sc.nextInt();
		}
		mergeSort(arr, 0 , arr.length -1);
		for(int a : arr){
			System.out.print(a+" ");
		}
	}
}
