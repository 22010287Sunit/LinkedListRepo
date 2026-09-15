
public class LLDeleteMethods {
	public Node DeleteAtStart(Node head) {
		if(head==null) {// means There is no Node object at the head.
			return null;
		}
		return head.next;
	}
	
	public Node DeleteEndNode(Node head) {
		Node temp = head; // temp is just pointer which points at nodes in list by next var
		while(temp.next.next!= null) {
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}
	
	public Node DeleteByVal(Node head, int x) {// Delete all nodes in list which has value of x
		while(head!=null && head.data==x) {
			head=head.next;
		}
		Node temp = head;
		while(temp!=null && temp.next!=null) {
			if(temp.next.data==x) {
				temp.next=temp.next.next;
			}else {
				temp = temp.next;
			}
		}
		return head;
	}
}
