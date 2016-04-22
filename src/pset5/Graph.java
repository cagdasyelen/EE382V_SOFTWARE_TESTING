package pset5;

import java.util.TreeMap;
import java.util.TreeSet;


import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Graph {
	private Set<Integer> nodes; // set of nodes in the graph
	private Map<Integer, TreeSet<Integer>> edges;

	// map between a node and a set of nodes that are connected to it by
	// outgoing edges
	// class invariant: fields "nodes" and "edges" are non-null;
	// "this" graph has no node that is not in "nodes"
	public Graph() {
		nodes = new TreeSet<Integer>();
		edges = new TreeMap<Integer, TreeSet<Integer>>();
	}

	public String toString() {
		return "nodes: " + nodes + "\n" + "edges: " + edges;
	}

	public void addNode(int n) {
		// postcondition: adds the node "n" to this graph
		nodes.add(n);
	}

	public void addEdge(int from, int to) {
		// postcondition: adds a directed edge "from" -> "to" to this graph
		// your code goes here
		
		if(from == to){
			nodes.add(from);
			return;
		}
		
		addNode(to);
		if(nodes.contains(from) && edges.get(from) != null){
			TreeSet<Integer> temp = edges.get(from);
			temp.add(to);
			edges.put(from, temp);
		}
		else{
			addNode(from);
			TreeSet<Integer> temp2 = new TreeSet<Integer>();
			temp2.add(to);
			edges.put(from,temp2);
		}
	}

	public boolean reachable(Set<Integer> sources, Set<Integer> targets) {
		if (sources == null || targets == null)
			throw new IllegalArgumentException();
		// postcondition: returns true if (1) "sources" is a subset of "nodes",
		// (2) "targets" is
		// a subset of "nodes", and (3) for each node "m" in set "targets",
		// there is some node "n" in set "sources" such that there is a
		// directed path that starts at "n" and ends at "m" in "this"; and
		// false otherwise
		
		if(!nodes.containsAll(sources) || !nodes.containsAll(targets)) return false;
		
		int control = 0;
		for(int target : targets){
			control = 0;
			for(int source: sources){
				if(bfs(source,target)) control++;
			}
			if(control == 0) return false;
		}
		return true;
	}
	
	public boolean bfs(int from, int to){
		Queue<Integer> q = new LinkedList<Integer>();
		Set<Integer> visitedNodes = new TreeSet<Integer>();
		q.add(from);
		visitedNodes.add(from);
		
		while(!q.isEmpty()){
			int node = (int) q.poll();
			visitedNodes.add(node);
			if(node == to) return true;
			if(edges.get(node) == null) return false;
			for(int next : edges.get(node)){
				if(!visitedNodes.contains(next)){
					q.add(next);
				}
			}
		}
		return false;
	}
}