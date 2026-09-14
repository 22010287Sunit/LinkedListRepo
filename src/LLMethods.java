
public class LLMethods {
	
	public void displayLL(Node head) {
		Node node = head;
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	// In any method of LL mostly we return node which represents first Node which can have any name
	public Node insertAtEnd(Node head, Node ToBeInserted) {
		if(head == null) {
			head = ToBeInserted;
			return head;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = ToBeInserted;
		return head;
	}
	
	public Node InsertAtBeginning(Node head, int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		return newNode;
	}
	
	public Node InsertAtBeginning(Node head, Node newHead) {
		newHead.next = head;
		return newHead;
	}
	
	public Node InsertAtGivenPosition(Node head, Node newNode, int pos) {
		if (pos == 0) {
			newNode.next = head;
			return newNode;
		}
		
		Node temp = head;
		for(int i=0; i<pos-1 && temp!=null; i++) {
			temp = temp.next; // temp will arrive at the point of pos-1
		}
		
		if(temp == null) {
			System.out.println("Position is out of bounds");
			return head;
		}
		// Before insertion:
		//
		// temp ---> A ---> B
		//
		// We want:
		//
		// temp ---> newNode ---> A ---> B
		//
		// So first connect newNode to A,
		// then connect temp to newNode.

		newNode.next = temp.next; 
		// newNode now points to A (remaining chain preserved)

		temp.next = newNode;
		// temp now points to newNode (insertion completed)
		
		return head;
	}

}
