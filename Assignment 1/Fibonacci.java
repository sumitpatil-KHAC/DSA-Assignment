/*
2. Fibonacci Sequence with Recursive Definition
Problem Description:
The Fibonacci sequence is defined as:
 F(0) = 0, F(1) = 1
 F(n) = F(n-1) + F(n-2) for n ≥ 2
Write a recursive function that returns the nth Fibonacci number.
Example:
Input: n = 5
Output: 5
*/
import java.util.Scanner;
class Fibonacci{
	static int fibo(int n){
		if(n == 0) 
			return 0;
		if(n == 1)
			return 1;
		else if(n > 1)
			return fibo(n-1)+fibo(n-2);
		return 0;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find its fibonacci ");
		int a = sc.nextInt();
		System.out.println(fibo(a));
	}
}