/*
4. Delete the first node of a LinkedList
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Expected Output: LinkedList: 20 → 30 → 40 
*/
class DeleteFirstNodeLinkedList{
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
			current = current.next ;
		}
		current.next = newNode;
	}
	int deleteBegin(){
		if(head == null){
			System.out.println("Linked List is Empty");
			return -1;
		}
		
		int removed = head.data;
		head = head.next;
		return removed;
		
	}
	void display(){
		if(head == null){
			System.out.println("Linked List is Empty");
			return;
		}
		Node current = head;
		while(current != null){
			System.out.print(current.data+" -> ");
			current = current.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args){
		DeleteFirstNodeLinkedList dfl = new DeleteFirstNodeLinkedList();
		
		dfl.insert(10);
		dfl.insert(20);
		dfl.insert(30);
		dfl.insert(40);
		dfl.deleteBegin();
		dfl.display();
		
	}
	
}