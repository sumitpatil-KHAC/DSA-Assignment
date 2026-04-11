/*
Q1. Trace Bubble Sort Passes
Problem Description:
Given an array, print the array after each pass of Bubble Sort.
Example:
Input: [4, 3, 2]
Output:
Pass 1: [3, 2, 4]
Pass 2: [2, 3, 4]
*/
import java.util.Scanner;
class TraceBubbleSortPass{
	public static void bubbleSort(int[] arr){
		int n = arr.length;
		for(int i = 0 ; i < n-1 ; i++){
			for(int j = 0 ; j < n-1-i ; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
			display(arr);
			System.out.println("");
		}
		
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
		int []arr = {4 , 3 , 2};
		bubbleSort(arr);
		
	}
}