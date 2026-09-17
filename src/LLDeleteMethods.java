
public class LLDeleteMethods {
	public Node DeleteAtStart(Node head) {
		if(head==null) {// means There is no Node object at the head.
			return null;
		}
		return head.next;
	}
	/*when we say if temp == null it means does the node to which temp is pointing exists or not
	And when we say if temp.next == null, it means does next node exist or not*/
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
	
	public Node RemoveNthNodeFromEnd(Node head, int n) {
		Node dummy = new Node(0);
		dummy.next = head;
		
		Node fast = dummy;
		Node slow = dummy;
		
		for (int i=0; i<=n; i++){
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
	}
}
