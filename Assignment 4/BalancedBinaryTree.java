/*
Q13. Check if a Binary Tree is Balanced
A balanced tree means the height difference of left and right subtrees for every node is
≤ 1.
Test Cases:
 Input: Balanced tree → Output: True
 Input: Skewed tree (like linked list: 1→2→3→4) → Output: False 
*/

class BalancedBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    // Returns true if tree is balanced
    boolean isBalanced(Node node) {
        return checkHeight(node) != -1;
    }

    // Returns height if balanced, otherwise -1
    int checkHeight(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) {
            return -1;
        }

        // If difference is more than 1, tree is not balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BalancedBinaryTree tree1 = new BalancedBinaryTree();

        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);

        System.out.println("Balanced Tree: " + tree1.isBalanced(tree1.root));
   

        BalancedBinaryTree tree2 = new BalancedBinaryTree();
        tree2.root = new Node(1);
        tree2.root.right = new Node(2);
        tree2.root.right.right = new Node(3);
        tree2.root.right.right.right = new Node(4);

        System.out.println("Skewed Tree: " + tree2.isBalanced(tree2.root));
       
    }
}