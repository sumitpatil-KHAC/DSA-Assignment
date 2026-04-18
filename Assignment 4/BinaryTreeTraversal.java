/*
Q8. Inorder, Preorder, Postorder Traversals
Implement recursive functions to print inorder, preorder, and postorder traversals.
Test Case:
Tree:
    10
   /  \
  20  30
 / \
40 50
 Inorder: 40 20 50 10 30
 Preorder: 10 20 40 50 30
 Postorder: 40 50 20 30 10
*/
class BinaryTreeTraversal{
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
        root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);
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
	public void postorder(){
		postorderRecursive(root);
		System.out.println();
	}
	private void postorderRecursive(Node current){
		if(current == null){
			return;
		}
		postorderRecursive(current.left);
		postorderRecursive(current.right);
		System.out.print(current.data+" ");	
		
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
		
		BinaryTreeTraversal bt = new BinaryTreeTraversal();
		bt.createTree();
		System.out.print("Inorder : ");
		bt.inorder();
		
		System.out.println("Preorder : ");
		bt.preorder();
		
		System.out.println("Postorder : ");
		bt.postorder();
		
	}
}