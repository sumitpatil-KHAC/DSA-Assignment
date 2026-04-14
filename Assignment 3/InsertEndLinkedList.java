/*
1. Create a LinkedList and insert elements at the end.
Testcase:
Existing LinkedList: [5, 10, 15]
Elements to insert: [20, 25]
Expected Output: LinkedList: 5 → 10 → 15 → 20 → 25
*/
public class InsertEndLinkedList{
	
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
	
	void insert(int value){
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
	void display(){
		if(head == null){
			System.out.println("Linked List is Empty");
			return;
		}
		Node current = head;
		while(current != null){
			System.out.print(current.data+" ->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	
	public static void main(String[] args){
		InsertEndLinkedList ial = new InsertEndLinkedList();
		ial.insert(5);
		ial.insert(10);
		ial.insert(15);
		
		ial.insertAtEnd(20);
		ial.insertAtEnd(25);
		
		ial.display();
	}
	
}