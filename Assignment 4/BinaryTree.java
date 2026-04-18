/*
Q7. Create a Binary Tree & Print Preorder Traversal
Write a program to create a binary tree and print its preorder traversal.
Test Case:
Tree:
   1
  / \
  2  3
 / \
4   5
Expected Output (Preorder): 1 2 4 5 3 
*/
import java.util.Scanner;
class BinaryTree{
	private static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	private Node root;
	void createTree() {
        root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
    }
	
	public void preorder(){
		preorderRecursive(root);
		System.out.println();
	}
	private void preorderRecursive(Node current){
		if(current == null){
			return;
		}
		System.out.print(current.data+" ");
		preorderRecursive(current.left);
		preorderRecursive(current.right);
		
	}
	public static void main(String[] args){
		
		BinaryTree bt = new BinaryTree();
		bt.createTree();
		bt.preorder();
	}
}