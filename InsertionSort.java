/*
Q2. Insertion Sort
Implement Insertion Sort to arrange elements in ascending order.
Test Cases:
 Input: [12, 11, 13, 5, 6] → Output: [5, 6, 11, 12, 13]
 Input: [4, 3, 2, 10, 12] → Output: [2, 3, 4, 10, 12]
*/
import java.util.Scanner;
class InsertionSort{
	static void insertionSort(int[] arr){
		int n = arr.length;
		for(int i = 1; i < n ; i++){
			int key = arr[i];
			int j = i - 1;
		    while(j >= 0 && arr[j] > key ){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of array ");
		for(int i = 0 ; i < n ; i++){
			arr[i] = sc.nextInt();
		}
		insertionSort(arr);
		for(int a : arr){
			System.out.print(a" ");
		}
	}
}