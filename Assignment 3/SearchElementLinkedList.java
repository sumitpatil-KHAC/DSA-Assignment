/*
7. Search for an element in a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Element to search: 30
Expected Output: Element found at index 2
*/
public class SearchElementLinkedList{
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
	int search(int value){
	
		Node current = head;
		int index = 0;
		while(current != null){
			if(current.data == value){
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
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
		SearchElementLinkedList sel = new SearchElementLinkedList();
		
		sel.insert(10);
		sel.insert(20);
		sel.insert(30);
		sel.insert(40);
		System.out.println("Element found at index "+sel.search(30));
		sel.display();
	}
}