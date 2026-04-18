/*
Q14. Convert Sorted Array to Balanced BST
Write a program to convert a sorted array into a balanced BST.
Test Case:
Input: [1, 2, 3, 4, 5, 6, 7]
Output (Preorder example): 4 2 1 3 6 5 7 
*/

class SortedArrayBalancedBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Function to convert sorted array into balanced BST
    static Node createBST(int[] arr, int start, int end) {

        if (start > end) {
            return null;
        }

        // Middle element becomes root
        int mid = (start + end) / 2;

        Node root = new Node(arr[mid]);

        // Recursively create left and right subtrees
        root.left = createBST(arr, start, mid - 1);
        root.right = createBST(arr, mid + 1, end);

        return root;
    }

    // Preorder Traversal
    static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        Node root = createBST(arr, 0, arr.length - 1);

        System.out.print("Preorder Traversal: ");
        preorder(root);
    }
}