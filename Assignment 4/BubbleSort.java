/*
Q1. Bubble Sort
Write a program to implement Bubble Sort on an integer array.
Test Cases:
 Input: [5, 2, 9, 1, 5, 6] → Output: [1, 2, 5, 5, 6, 9]
 Input: [3, 2, 1] → Output: [1, 2, 3]
 Input: [1, 2, 3] → Output: [1, 2, 3] 
*/
import java.util.Scanner;
class BubbleSort{
	static void bubbleSort(int[] arr){
		int n = arr.length;
		for(int i = 0 ; i < n-1; i++){
			for(int j = 0 ; j < n-1-i ; j++){
				if(arr[j] > arr[j+1]){
				    int temp = arr[j];
				    arr[j] = arr[j+1];
				    arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ;  i < n ; i++){
			arr[i] = sc.nextInt();
		}
		bubbleSort(arr);
		for(int a : arr){
			System.out.print(a+" ");
		}
		
	}
}