/*
8. Count the total number of nodes in a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Expected Output: Total nodes: 4 
*/
public class TotalNodeLinkedList{
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
	int count(){
		Node current = head;
		int count = 0;
		while(current != null){
			count++;
			current = current.next;
		}
		return count;
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
		TotalNodeLinkedList sel = new TotalNodeLinkedList();
		
		sel.insert(10);
		sel.insert(20);
		sel.insert(30);
		sel.insert(40);
		System.out.println("Total Nodes : "+sel.count());
		sel.display();
	}
}