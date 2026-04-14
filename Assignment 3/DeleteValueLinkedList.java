/*
6. Delete a node by its value in a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Node to delete: 30
Expected Output: LinkedList: 10 → 20 → 40
*/
class DeleteValueLinkedList{
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
		Node current =  head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
	}
	boolean deleteByValue(int value){
		if(head == null){
			return false;
		}
		if(head.data == value){
			head = head.next;
			return true;
		}
		Node current = head;
		while(current != null && current.next.data != value){
			current = current.next;
		}
		if(current.next == null){
			return false;
		}
		current.next = current.next.next;
		return true;
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
			DeleteValueLinkedList dvl = new DeleteValueLinkedList();
			
			dvl.insert(10);
			dvl.insert(20);
			dvl.insert(30);
			dvl.insert(40);
			dvl.deleteByValue(30);
			dvl.display();
	}
}