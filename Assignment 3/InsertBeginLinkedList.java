/*
2. Insert a new node at the beginning of a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30]
Node to insert: 5
Expected Output: LinkedList: 5 → 10 → 20 → 30 
*/
public class InsertBeginLinkedList{
	
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
		InsertBeginLinkedList ial = new InsertBeginLinkedList();
		
		ial.insert(10);
		ial.insert(20);
		ial.insert(30);
		
		ial.insertAtBeginning(5);
		
		ial.display();
		
		
	}
	
}