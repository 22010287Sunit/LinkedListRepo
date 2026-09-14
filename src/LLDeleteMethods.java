
public class LLDeleteMethods {
	public Node DeleteAtStart(Node head) {
		if(head==null) {
			return null;
		}
		return head.next;
	}
}
