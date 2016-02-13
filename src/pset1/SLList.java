package pset1;

import java.util.HashSet;
import java.util.Set;

public class SLList {
	Node header;
	static class Node {
		int elem;
		Node next;
	}
	boolean repOk() {
		// postcondition: returns true iff <this> is an acyclic list, i.e.,
		//                          there is no path from a node to itself,
		//                          and the elements are sorted (<=)
		Set<Node> visited = new HashSet<Node>();
		Node n = header;
		while (n != null) {
			if (!visited.add(n)) {
				return false;
			}
			if (n.next != null) {
				if (n.elem > n.next.elem) 
					return false;
			}
			n = n.next;
		}
		return true;
	}
	void add(int e){
		// precondition: this.repOk()
		// postcondition: adds <e> in a new node in the list in sorted order;
		// the rest of the list is unmodified
		// your code goes here
		Node temp = new Node();
		temp.elem = e;
	    Node current = header;

	    if (header == null) {
	        header = temp;
	    } 
		else if (e < header.elem)
		{

			temp.next = header;
			header = temp;
		}
	    else{
	    	Node previous = current;
	    	while(current.elem < e){
	    		if(current.next == null){
	    			current.next = temp;
	    			return;
	    		}
	    		previous =current;
	    		current = current.next;
	    	}
	    	temp.next = current;
	    	previous.next = temp;
	    }
	    		
	}
	
	
	public static void main(String[] args) {
		SLList myList = new SLList();
		myList.add(8);
		myList.add(6);
		myList.add(4);
		//myList.add(12);
		//myList.add(15);
		myList.add(7);
		myList.add(2);
		myList.add(1);
		myList.add(4);
		myList.add(16);
		Node n = myList.header;
		while(n.next != null){

		System.out.println(n.elem);
		n = n.next;
		}
		System.out.println(n.elem);
	}

}