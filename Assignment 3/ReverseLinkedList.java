/*
9. Reverse a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Expected Output: LinkedList: 40 → 30 → 20 → 10
Existing LinkedList: []
Expected Output: LinkedList: (empty) 
*/
public class ReverseLinkedList{
	private static class Node{
		int data;
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
	void reverse(){
		Node previous = null;
		Node current = head;
		while(current != null){
			Node nextNode = current.next;
			current.next = previous;
			previous = current;
			current = nextNode;
		}
		head = previous;
	}
	void display(){
		if(head == null){
			System.out.println("Linked List is empty");
			return ;
		}
		Node current = head;
		while(current != null){
			System.out.print(current.data +" ->");
			current = current.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args){
		ReverseLinkedList sel = new ReverseLinkedList();
		
		sel.insert(10);
		sel.insert(20);
		sel.insert(30);
		sel.insert(40);
		System.out.println("Forward ");
		sel.display();
		System.out.println("Reverse ");
		sel.reverse();
		sel.display();
	}
}