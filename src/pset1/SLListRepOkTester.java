package pset1;

import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

public class SLListRepOkTester {
	
	@Test 
	public void t0() {
		SLList l = new SLList();
		assertTrue(l.repOk());
	}

	@Test 
	public void t1() {
		SLList l = new SLList();
		Node n = new Node();
		l.header = n;
		assertTrue(l.repOk());
	}
	@Test
	public void t2(){
		SLList l = new SLList();
		Node n = new Node();
		l.header = n;
		l.header.elem = 1;
		assertTrue(l.repOk());
	}
	@Test 
	public void t3() {
		SLList l = new SLList();
		Node n = new Node();
		l.header = n;
		l.header.elem = 0;
		Node n2 = new Node();
		n2.elem = 1;
		l.header.next = n2;
		assertTrue(l.repOk());
	}
	@Test
	public void t4() {
		SLList l = new SLList();
		Node n = new Node();
		l.header = n;
		l.header.elem = 1;
		Node n2 = new Node();
		n2.elem = 0;
		l.header.next = n2;
		assertFalse(l.repOk());
	}
}