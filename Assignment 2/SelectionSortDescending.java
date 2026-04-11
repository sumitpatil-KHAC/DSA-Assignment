/*
Q3.Selection Sort in Descending Order
Problem Description:
Modify the Selection Sort algorithm to sort an array in descending order.
.
Example:
Input: [3, 5, 1, 2]
Output: [5, 3, 2, 1]
*/
class SelectionSortDescending{
	public static void selectionSort(int []arr){
		int n = arr.length;
		for(int i = 0 ; i < n-1 ; i++){
			int minIndex = i;
			for(int j = i+1 ; j < n ; j++){
			    if(arr[j] > arr[minIndex]){
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
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
		int []arr = {3,5,1,2};
		selectionSort(arr);
	}
}