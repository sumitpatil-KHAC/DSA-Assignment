/*
Problem Description:
Given a string, write a recursive function to reverse it. You are not allowed to use loops or builtin reverse functions.
Hint:
Think about reducing the problem size by removing one character at a time and solving the
smaller problem.
Example:
Input: "recursion"
Output: "noisrucer"
Requirements:
 Base case: when the string becomes empty or has one character.
 Recursive step: process the remaining substring.
*/
import java.util.Scanner;
class StringReversal{
	static void reverse(String s , int i){
		if(i < 0){
		     return;	
		}
		else{
			System.out.print(s.charAt(i));
			reverse(s, i-1);
		}
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse ");
		String s = sc.next();
		reverse(s, s.length()-1);
	}
}