import java.util.NoSuchElementException;

public class OrderedLists {
	private static class Node{
		
		private Comparable value;
		private Node previous;
		private Node next;
		
		
		private Node(Comparable value, Node previous, Node next) {
			this.value=value;
			this.previous=previous;
			this.next=next;
		}
	}
	
	private Node head;
	
	public OrderedLists(){
		head = new Node(null,null,null);
		head.next = head;
		head.previous = head;
	}
	
	public int size(){
		Node p = head;
		int count = 0;
		while(p.next!=head){
			p = p.next;
			count++;
		}
		return count;
	}
	public Object get (int pos){
		if(pos<0)
			throw new IndexOutOfBoundsException(Integer.toString(pos));
		Node p = head.next;
		
		for (int i=0;i<pos;i++)
			if(p.next == head)
				throw new IndexOutOfBoundsException();
			else
				p=p.next;
		return p.value;
	
	}
	/**
	 * Adding an element while preserving the order
	 * @param o
	 * @return
	 */
	public boolean add(Comparable o) {
		if(o==null)
			throw new IllegalArgumentException("null");
		if(head.next == head){
			head.next = new Node(o,head,head.next);
		} else {
			Node p = head;
			
			while(p.next != head && p.next.value.compareTo(o) <0){
				p = p.next;
			}
			
			Node q = p.next;
			p.next = new Node(o,p,q);
			q.previous = p.next;
		}
		return true;
	}
	/**
	 * Removes the element from the position "pos"
	 * @param pos
	 */
	public void remove(int pos){
		if(pos < 0)
			throw new UnsupportedOperationException("not implemented yet");
		Node p = head.next;
		for(int i=0;i<pos;i++)
			if(p.next == head)
				throw new IndexOutOfBoundsException(Integer.toString(pos));
			else
				p = p.next;
		
		Node del = p; //the node to delete
		p = p.previous; //p designates the previous node
		Node q = del.next; // q designates the node that follows
		
		p.next = q;
		q.previous = p;
		
		del.value = null;
		del.next = null;
		del.previous = null;
		
		
	}
	
	/**
	 * Knowing that both lists store their elements in increasing order,
	 * both lists can be traversed simultaneously
	 * IMPORTANT TO KNOW FOR THE FINAL EXAM
	 */
	
	@SuppressWarnings("unchecked")
	public void merge(OrderedLists other){
		
		Node p = head.next;
		Node q = other.head.next;
		
		while(q!=other.head){
			if(p == head){
				p.next = new Node(q.value,p,p.next);
				p = p.next;
				q = q.next;
				
			} else if (q.value.compareTo(p.value)<0){
				//insert before
				p.previous = new Node(q.value,p.previous,p);
				p.previous.previous.next = p.previous;
				q = q.next;
			}else if(p.next == head){
				//insert after
				p.next = new Node(q.value,p, head);
				p = p.next;
				q = q.next;
			}else {
				p = p.next;
			}
		}
		
	}

}
