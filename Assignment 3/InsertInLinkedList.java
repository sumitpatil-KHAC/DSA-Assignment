/*
1. Create a LinkedList and insert elements at the end.
Testcase:
Existing LinkedList: [5, 10, 15]
Elements to insert: [20, 25]
Expected Output: LinkedList: 5 → 10 → 15 → 20 → 25
*/
public class InsertAtEndLinkedList{
	
	private static class Node{
		int data ;
		Node next;
		Node(int data){
			this.data = data;
	    }
	}
	Node head;
	void insertAtBeginning(int value){
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	void insertAtEnd(int value){
		Node newNode = new Node(value);
		if(head == null){
			head = newNode;
			return;
		}
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
	}
	
	
	public static void main(String[] args){
		InsertAtEndLinkedList ial = new InsertAtEndLinkedList();
		ial.insertAtBeginning()
	}
	
}