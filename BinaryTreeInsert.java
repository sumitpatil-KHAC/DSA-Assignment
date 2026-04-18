/*
Q10. Insert into a BST
Write a program to insert nodes into a BST and print inorder traversal.
Test Case:
Insert: 50, 30, 20, 40, 70, 60, 80
Tree (BST) Inorder: 20 30 40 50 60 70 80 
*/
import java.util.Scanner;
class BinaryTreeInsert{
	private static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	Node root;
    public void insert(int value){
		root = insertRecursive(root, value);
	}
	private Node insertRecursive(Node current , int value){
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
			System.out.println("Duplicates are not allowed in BST ");
		}
		return current;
	}
	public void inorder(){
		inorderRecursive(root);
		System.out.println();
	}
	private void inorderRecursive(Node current){
		if(current == null){
			return;
		}
		inorderRecursive(current.left);
		System.out.print(current.data+" ");
		inorderRecursive(current.right);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BinaryTreeInsert bt = new BinaryTreeInsert();
		System.out.println("Enter number of values to add");
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++){
			System.out.println("Insert value to add");
			int value = sc.nextInt();
			bt.insert(value);
		}
		bt.inorder();
	}
}