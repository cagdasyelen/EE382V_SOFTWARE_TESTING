package pset5;

/** 
 * @author Cagdas Yelen
 * @see Graph
 */	

import static org.junit.Assert.*;
import java.util.TreeSet;
import java.util.Set;
import org.junit.Test;

public class GraphTester {
	// tests for method "addEdge" in class "Graph"
	@Test
	public void tae0() {
		Graph g = new Graph();
		g.addEdge(0, 1);
		assertEquals(g.toString(), "nodes: [0, 1]\nedges: {0=[1]}");
	}
	
	@Test
	public void tae1(){
		Graph g = new Graph();
		g.addEdge(0, 0);
		assertEquals(g.toString(),"nodes: [0]\nedges: {}");
	}
	
	@Test
	public void tae2(){
		Graph g = new Graph();
		g.addEdge(0,1);
		g.addEdge(0, 2);
		assertEquals(g.toString(), "nodes: [0, 1, 2]\nedges: {0=[1, 2]}");
	}
	
	@Test
	public void tae3(){
		Graph g = new Graph();
		g.addEdge(0, 1);
		g.addEdge(1, 0);
		assertEquals(g.toString(), "nodes: [0, 1]\nedges: {0=[1], 1=[0]}");	
	}
	
	@Test
	public void tae4(){
		Graph g = new Graph();
		g.addEdge(0, 0);
		g.addEdge(1, 2);
		g.addEdge(1, 0);
		g.addEdge(0, 2);
		assertEquals(g.toString(), "nodes: [0, 1, 2]\nedges: {0=[2], 1=[0, 2]}");	
		
	}

	// your tests for method "addEdge" in class "Graph" go here
	// you must provide at least 4 test methods;
	// each test method must have at least 1 invocation of addEdge;
	// each test method must have at least 1 test assertion;
	// your test methods must provide full statement coverage of your
	// implementation of addEdge and any helper methods
	// no test method directly invokes any method that is not
	// declared in the Graph class as given in this homework
	// tests for method "reachable" in class "Graph"
	
	@Test
	public void tr0() {
		Graph g = new Graph();
		g.addNode(0);
		Set<Integer> nodes = new TreeSet<Integer>();
		nodes.add(0);
		assertTrue(g.reachable(nodes, nodes));
	}
	
	@Test
	public void tr1(){
		Graph g = new Graph();
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		Set<Integer> nodes1 = new TreeSet<Integer>();
		nodes1.add(0);
		Set<Integer> nodes2 = new TreeSet<Integer>();
		nodes2.add(2);
		assertTrue(g.reachable(nodes1, nodes2));
	}

	@Test
	public void tr2(){
		Graph g = new Graph();
		g.addEdge(0, 1);
		g.addEdge(1, 0);
		g.addEdge(1, 2);
		Set<Integer> nodes1 = new TreeSet<Integer>();
		nodes1.add(0);
		Set<Integer> nodes2 = new TreeSet<Integer>();
		nodes2.add(2);
		assertTrue(g.reachable(nodes1, nodes2));
	}

	@Test
	public void tr3(){
		Graph g = new Graph();
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 1);
		g.addEdge(1, 0);
		Set<Integer> nodes = new TreeSet<Integer>();
		nodes.add(0);
		nodes.add(1);
		nodes.add(2);
		assertTrue(g.reachable(nodes, nodes));
	}

	@Test
	public void tr4(){
		Graph g = new Graph();
		g.addEdge(0, 1);
		Set<Integer> nodes = new TreeSet<Integer>();
		nodes.add(0);
		nodes.add(1);
		nodes.add(2);
		assertFalse(g.reachable(nodes, nodes));		
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void tr5(){
		Graph g = new Graph();
		g.reachable(null, null);
	}


	@Test
	public void tr6(){
		Graph g = new Graph();
		g.addEdge(0,1);
		g.addEdge(0, 2);
		Set<Integer> nodes1 = new TreeSet<Integer>();
		nodes1.add(1);
		Set<Integer> nodes2 = new TreeSet<Integer>();
		nodes2.add(2);
		assertFalse(g.reachable(nodes1, nodes2));
		
	}
	
	@Test 
	public void tr7(){
		Graph g = new Graph();
		Set<Integer> nodes1 = new TreeSet<Integer>();
		nodes1.add(0);
		Set<Integer> nodes2 = new TreeSet<Integer>();
		assertFalse(g.reachable(nodes1, nodes2));
	}
	@Test 
	public void tr8(){
		Graph g = new Graph();
		g.addNode(2);
		g.addEdge(0, 1);
		g.addEdge(1	, 3);
		g.addEdge(3, 0);
		Set<Integer> nodes1 = new TreeSet<Integer>();
		nodes1.add(0);
		Set<Integer> nodes2 = new TreeSet<Integer>();
		nodes2.add(2);
		assertFalse(g.reachable(nodes1, nodes2));
	}
	
	@Test 
	public void tr9(){
		Graph g = new Graph();
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		Set<Integer> nodes1 = new TreeSet<Integer>();
		nodes1.add(3);
		Set<Integer> nodes2 = new TreeSet<Integer>();
		nodes2.add(0);
		assertFalse(g.reachable(nodes1, nodes2));
	}

	

	
	// your tests for method "reachable" in class "Graph" go here
	// you must provide at least 6 test methods;
	// each test method must have at least 1 invocation of reachable;
	// each test method must have at least 1 test assertion;
	// at least 2 test methods must have at least 1 invocation of addEdge;
	// your test methods must provide full statement coverage of your
	// implementation of reachable and any helper methods
	// no test method directly invokes any method that is not
	// declared in the Graph class as given in this homework
}