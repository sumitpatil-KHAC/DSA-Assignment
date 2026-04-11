/*
Q2. Insert an Element into a Sorted Array
Problem Description:
Given a sorted array, insert a new element into its correct position using the logic of Insertion
Sort.
Example:
Input: [1, 3, 5, 7], insert 4
Output: [1, 3, 4, 5, 7]
Requirements:
 Do not use extra sorting.
 Shift elements as needed.
*/
class InsertInSortedArray{
	public static void insertionSort(int[] arr , int value){
		int n = arr.length;
		int []newArr = new int[n+1];
		int i = n-1;
		
		while( i >= 0 && arr[i] > value){
			newArr[i+1] = arr[i];
			i--;
		}
		newArr[i+1] = value;
		for(int j = 0 ; j <= i ; j++){
			newArr[j] = arr[j];
		}
		display(newArr);
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
		int []arr = {1,3,5,7};
		insertionSort(arr , 4);
    }
}