
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

}
