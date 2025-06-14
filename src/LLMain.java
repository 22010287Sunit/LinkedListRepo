
public class LLMain {
	public static void main(String[] args) {
		Node node1 = new Node(10);
		Node node2 = new Node(30);
		Node node3 = new Node(50);
		Node node4 = new Node();
		Node node5 = new Node(755);
		
		node4.data = 60;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		System.out.println(node1.next.next.data);
		System.out.println(node1.data);
		System.out.println("");
		//Node node = node1;
		LLMethods impl1 = new LLMethods();
		impl1.displayLL(node1);
		System.out.println("");
		impl1.insertAtEnd(node1, new Node(400));
		
		int arr [] = {404, 340,545,543};
		
		for (int i=0; i<arr.length; i++) {
			impl1.insertAtEnd(node1, new Node(arr[i]));
		}
		
		impl1.displayLL(node1);
		
		node1 = impl1.InsertAtBeginning(node1, node5);
		System.out.println("");
		impl1.displayLL(node1);
		
		node1 = impl1.InsertAtBeginning(node1, 344);
		System.out.println("");
		impl1.displayLL(node1);
		
		
		
	}
	

}


