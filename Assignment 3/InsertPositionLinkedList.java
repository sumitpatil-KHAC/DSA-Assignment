/*
3. Insert a new node at a given position in a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Node to insert: 25 at position 2
Expected Output: LinkedList: 10 → 20 → 25 → 30 → 40
*/
public class InsertPositionLinkedList{
	
	private static class Node{
		int data ;
		Node next;
		Node(int data){
			this.data = data;
	    }
	}
	Node head;
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
	void insertAtBeginning(int value){
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	void insertAtPosition(int value , int position){
		if(position <= 1 || head == null){
			insertAtBeginning(value);
			return;
		}
		Node current = head;
		int i = 0;
		while(current != null && i < position-1){
			current = current.next;
			i++;
		}
		Node newNode = new Node(value);
		newNode.next = current.next;
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
		InsertPositionLinkedList ial = new InsertPositionLinkedList();
		
		ial.insert(10);
		ial.insert(20);
		ial.insert(30);
		ial.insert(40);
		
		ial.insertAtPosition(25,2);
		
		ial.display();
		
		
	}
	
}