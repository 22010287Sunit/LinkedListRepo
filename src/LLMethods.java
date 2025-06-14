
public class LLMethods {
	
	public void displayLL(Node head) {
		Node node = head;
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
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
			temp = temp.next;
		}
		
		if(temp == null) {
			System.out.println("Position is out of bounds");
			return head;
		}
		
		newNode.next = temp.next; // 
		temp.next = newNode;
		
		return head;
	}

}
