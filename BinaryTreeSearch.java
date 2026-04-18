/*
Q10. Search in BST
Write a program to search for a value in a BST. Return true if found, false otherwise.
Test Case:
BST from Q4 → Search for 40 → Output: Found
BST from Q4 → Search for 90 → Output: Not Found 
*/
import java.util.Scanner;
class BinaryTreeSearch{
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	Node root;
	public void insert(int value){
		root = insertRecursive(root,value);
		
	}
	private Node insertRecursive(Node current , int value){
		if(current == null){
			return new Node(value);
		}
		if(value < current.data){
			current.left = insertRecursive(current.left,value);
			
		}
		else if(value > current.data){
			current.right = insertRecursive(current.right,value);
			
		}
		else{
			System.out.println("Duplicates are not allowed ");
		}
		return current;
	}
	public boolean search(int value){
		return searchRecursive(root,value);
	}
	private boolean searchRecursive(Node current, int value){
		if(current == null){
			return false;
		}
		if(current.data == value){
			return true;
		}
		if(value < current.data){
			return searchRecursive(current.left , value);
		}
		return searchRecursive(current.right , value);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BinaryTreeSearch bt = new BinaryTreeSearch();
		System.out.println("Enter number of values to add");
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++){
			System.out.println("Insert value to add");
			int value = sc.nextInt();
			bt.insert(value);
		}
		System.out.println("Enter elemnts to search in tree ");
		int s = sc.nextInt();
		if(bt.search(s)){
			System.out.println("Found");
		}
		else{
			System.out.println("Not Found");
		}
	}
}