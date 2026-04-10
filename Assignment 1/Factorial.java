/*
1. Factorial with Edge Case Handling
Problem Description:
You are given a non-negative integer n. Write a recursive function to compute its factorial.
The factorial of a number n is defined as:
 n! = n × (n-1) × (n-2) × ... × 1
 By definition, 0! = 1
Your function must correctly handle the edge case when n = 0. Also consider what should
happen if a negative number is passed.
Requirements:
 Use recursion only (no loops).
 Clearly define the base case.
 Ensure your function does not cause infinite recursion
*/
import java.util.Scanner;

class Factorial{
	static int fact(int a){
		if(a < 0){
			return -1;
		}
		else if(a == 0 || a == 1){
			return 1;	
		}
        else{
			return a * fact(a-1);
		}			
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find Factorial ");
		int n = sc.nextInt();
		System.out.println("Factorial of n = "+fact(n));
	}
}
