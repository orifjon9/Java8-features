package library.unitestvsexceptionhandling.example6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class QueueSync {

	private final Lock lock = new ReentrantLock();

	class Node {
		Object value;
		Node next;
	}

	private Node head;
	private Node tail;

	public synchronized void add(Object newValue) {

		lock.lock();
		Node n = new Node();
		if(head == null) head = n;
		else tail.next = n;
		tail = n;
		tail.value = newValue;

		lock.unlock();
	}

	public synchronized Object remove() {

		lock.lock();

		if(head == null) return null;
		Node n = head;
		head = n.next;

		lock.unlock();

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
