/*
4. Check if an Array is Sorted
Problem Description:
Given an integer array, determine whether it is sorted in ascending order using recursion.
Instead of checking the whole array at once, compare elements step by step recursively.
Approach Hint:
 Compare the current element with the next one.
 Then recursively check the rest of the array.
Example:
Input: [2, 4, 6, 8] → Output: true
Input: [3, 5, 2, 9] → Output: false
Requirements:
 Do not use loops.
 Use an index parameter to track position. 
*/
import java.util.Scanner;
class SortedArray{
	static boolean array(int []a , int i ){
		if(i == a.length -1 )
			return true;
		else if(a[i] > a[i+1])
				return false;
		return array(a, i+1);
			
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int size = sc.nextInt();
		int []a = new int[size];
		for(int i = 0 ; i < a.length ; i++){
			a[i] = sc.nextInt();
		}
		System.out.println(array(a , 0));
	}
}