/*
Q4.Optimized Bubble Sort
Problem Description:
Modify the Bubble Sort algorithm to improve its efficiency by stopping early if the array is
already sorted.
Requirements:
 If no swaps happen in a pass, terminate early.
*/
class OptimizedBubbleSort{
	public static void bubbleSort(int arr[]){
		int n = arr.length;
		for(int i = 0 ; i < n-1 ; i++){
			boolean swapped = false;
			for(int j = 0 ; j < n-1-i ; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped){
				break;
			}
		}
		display(arr);
	}
	static void display(int[] arr){
		System.out.print("[");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]);
			if(i != arr.length-1){
				System.out.print(", ");
			}
		}
	    System.out.print("]");
	}
	public static void main(String[] args){
		int arr[] = {1 , 3 , 7, 5 , 9};
		bubbleSort(arr);
	}
}