package library.unitestvsexceptionhandling.example6;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class Queue {


	class Node {
		Object value;
		Node next;
	}

	private Node head;
	private Node tail;

	public void add(Object newValue) {

		Node n = new Node();
		if(head == null) head = n;
		else tail.next = n;
		tail = n;
		tail.value = newValue;

	}

	public Object remove() {

		if(head == null) return null;
		Node n = head;
		head = n.next;

		return n.value;
	}

	public String getValueNodes(){
		if(head == null) return "";

		return getValue(head);
	}

	public int getCountNodes(){
		if(head == null) return 0;

		return getCalcCount(head);
	}

	private String getValue(Node n){
		if(n == null)
			return "";

		return n.next != null ? String.join(", ", n.value.toString(), getValue(n.next)) : n.value.toString();
	}

	private int getCalcCount(Node n){
		if(n == null)
			return 0;

		return getCalcCount(n.next) + 1;
	}
}
