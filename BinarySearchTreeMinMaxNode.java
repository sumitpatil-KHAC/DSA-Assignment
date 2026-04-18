/*
Q11. Minimum & Maximum Node in BST
Find the smallest and largest element in a BST.
Test Case:
BST from Q4 → Min: 20, Max: 80 
*/
import java.util.Scanner;
class BinarySearchTreeMinMaxNode{
	static class Node{
		int data;
		Node right;
		Node left;
		Node(int data){
			this.data = data;
		}
	}
	Node root ;
	public void insert(int value){
		root = insertRecursive(root, value);
	}
	private Node insertRecursive(Node current, int value){
		if(current == null){
			return new Node(value);
		}
		if(value < current.data){
			current.left = insertRecursive(current.left , value);
		}
		else if(value > current.data){
			current.right = insertRecursive(current.right , value);
		}
		else{
			System.out.println("Duplicates are not allowed ");
		}
		return current;
	}
	int minValue(Node node){
		Node current = node;
		while(current.left != null){
			current = current.left;
		}
		return current.data;
	}
	int maxValue(Node node){
		Node current = node;
		while(current.right != null){
			current = current.right;
		}
		return current.data;
	}
	
	public static void main(String[] args){
		BinarySearchTreeMinMaxNode bt = new BinarySearchTreeMinMaxNode();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of values to add");
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++){
			System.out.println("Insert value to add");
			int value = sc.nextInt();
			bt.insert(value);
		}
		System.out.println("Minimum Value : "+bt.minValue(bt.root));
		System.out.println("Maximum Value : "+bt.maxValue(bt.root));
	}
}