package pset4;

import java.util.*;

import org.apache.bcel.Repository;
import org.apache.bcel.classfile.*;
import org.apache.bcel.generic.*;

/** 
 * @author Cagdas Yelen
 * @see C
 * @see D
 * @see GraphGenerator
 */	


public class CFG {
	Set<Node> nodes = new HashSet<Node>();
	Map<Node, Set<Node>> edges = new HashMap<Node, Set<Node>>();

	public static class Node {
		int position;
		Method method;
		JavaClass clazz;

		Node(int p, Method m, JavaClass c) {
			position = p;
			method = m;
			clazz = c;
		}

		public Method getMethod() {
			return method;
		}

		public JavaClass getClazz() {
			return clazz;
		}

		public boolean equals(Object o) {
			if (!(o instanceof Node))
				return false;

			Node n = (Node) o;
			return (position == n.position) && method.equals(n.method) && clazz.equals(n.clazz);
		}

		public int hashCode() {
			return position + method.hashCode() + clazz.hashCode();
		}

		public String toString() {
			return clazz.getClassName() + "." + method.getName() + method.getSignature() + ": " + position;
		}
	}

	public void addNode(int p, Method m, JavaClass c) {
		addNode(new Node(p, m, c));
	}

	private void addNode(Node n) {
		nodes.add(n);
		Set<Node> nbrs = edges.get(n);
		if (nbrs == null) {
			nbrs = new HashSet<Node>();
			edges.put(n, nbrs);
		}
	}

	public void addEdge(int p1, Method m1, JavaClass c1, int p2, Method m2, JavaClass c2) {
		Node n1 = new Node(p1, m1, c1);
		Node n2 = new Node(p2, m2, c2);
		addNode(n1);
		addNode(n2);
		Set<Node> nbrs = edges.get(n1);
		nbrs.add(n2);
		edges.put(n1, nbrs);
	}

	public void addEdge(int p1, int p2, Method m, JavaClass c) {
		addEdge(p1, m, c, p2, m, c);
	}

	public String toString() {
		return nodes.size() + " nodes\n" + "nodes: " + nodes + "\n" + "edges: " + edges;
	}

	public boolean isReachable(String methodFrom, String clazzFrom, String methodTo, String clazzTo) {
		JavaClass jc1 = null;
		Method mFrom = null;
		try {
			jc1 = Repository.lookupClass(clazzFrom);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		ClassGen cg1 = new ClassGen(jc1);
		ConstantPoolGen cpg1 = cg1.getConstantPool();

		InstructionHandle[] ins1 =null;
		for(Method m : cg1.getMethods()){
			if(m.getName().equals(methodFrom)){
				//Assuming no overridden method exists
				mFrom = m;
				MethodGen mg1 = new MethodGen(m, cg1.getClassName(), cpg1);
				ins1 = mg1.getInstructionList().getInstructionHandles();
			}
		}
		
		Queue<Method> q = new LinkedList<Method>();
		Set<Method> visitedMethods = new HashSet<Method>();
		
		q.add(mFrom);
		visitedMethods.add(mFrom);
		
		while(!q.isEmpty()){
			Method tempM = q.poll();
			MethodGen tempMg = new MethodGen(tempM, cg1.getClassName(),cpg1);
			InstructionHandle[] tempIh = tempMg.getInstructionList().getInstructionHandles();
			
			for(InstructionHandle ih: tempIh){
				Instruction inst = ih.getInstruction();
				if(inst instanceof INVOKESTATIC){
					if(((INVOKESTATIC) inst).getMethodName(cpg1).contains(methodTo)) {
						return true;
					}
					Method addMethod = cg1.containsMethod(((INVOKESTATIC) inst).getMethodName(cpg1), ((INVOKESTATIC) inst).getSignature(cpg1));
					if(!visitedMethods.contains(addMethod)){
						q.add(addMethod);
						visitedMethods.add(addMethod);
					}
				}
			}
			
		}
		return false;
	}
	public void printCFG() {
		Map<Method, Set<Node>> clusters = new HashMap<Method, Set<Node>>();
		for (Node n : nodes) {
		if (!clusters.containsKey(n.getMethod())) {
		Set<Node> cluster = new HashSet<Node>();
		cluster.add(n);
		clusters.put(n.getMethod(), cluster);
		} else {
		Set<Node> cluster = clusters.get(n.getMethod());
		cluster.add(n);
		}
		}
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Method, Set<Node>> entry : clusters.entrySet()) {
		sb.append("Method " + entry.getKey() + ":\n");
		List<Node> froms = new ArrayList<Node>(entry.getValue());
		Collections.sort(froms, new Comparator<Node>() {
		@Override
		public int compare(Node o1, Node o2) {
		return o1.position - o2.position;
		}
		});
		for (Node from : froms) {
		sb.append(" <" + from.toString() + "> -> <");
		String prefix = "";
		List<Node> tos = new ArrayList<Node>(edges.get(from));
		Collections.sort(tos, new Comparator<Node>() {
		@Override
		public int compare(Node o1, Node o2) {
		return o1.position - o2.position;
		}
		});
		for (Node to : tos) {
		sb.append(prefix + to.toString());
		prefix = ", ";
		}
		sb.append(">\n");
		}
		sb.append("\n");
		}
		System.out.println(sb.toString());
		}
}
