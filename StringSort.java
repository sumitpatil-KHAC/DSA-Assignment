/*
Q6. Sorting Strings (Lexicographic Order)
Write a program to sort an array of strings using any sorting algorithm.
Test Cases:
 Input: ["apple", "banana", "cherry", "date"] → Output: ["apple", "banana",
"cherry", "date"]
 Input: ["dog", "cat", "elephant", "bee"] → Output: ["bee", "cat", "dog",
"elephant"]
*/
import java.util.Scanner;
class StringSort{
	static void stringSort(String[] arr){
		int n = arr.length;
		for(int i = 0 ; i < n-1 ; i++){
			for(int j = 0 ; j < n-i-1 ; j++){
				if(arr[j].compareTo(arr[j+1]) > 0 ){
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		String arr[] = new String[n];
        System.out.println("Enter elements of array ");
		for(int i = 0 ; i < n ; i++){
			arr[i] = sc.next();
		}
		stringSort(arr);
		for(String a : arr){
			System.out.print(a+" ");
		}
	}
}
