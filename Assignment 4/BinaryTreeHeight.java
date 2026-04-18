/*
Q12. Height of Binary Tree
Write a recursive function to find the height of a binary tree.
Test Case:
Tree:
   1
  / \
 2   3
/ \
4  5
Height = 3 
*/
import java.util.Scanner;
class BinaryTreeHeight{
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}		
	Node root;
	void addNode() {
        root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
    }
	public int height(){
		return heightRecursive(root);
	}
	private int heightRecursive(Node current){
		if(current == null){
			return 0;
		}
		int leftHeight = heightRecursive(current.left);
		int rightHeight = heightRecursive(current.right);
		
		return 1+Math.max(leftHeight , rightHeight);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        BinaryTreeHeight bt = new BinaryTreeHeight();
		bt.addNode();
		System.out.println(bt.height());
	}
}
/*
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
			System.out.println("Duplicates are not allowed");
		}
		return current;
	}
	*/