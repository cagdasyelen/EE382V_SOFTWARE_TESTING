package pset4;

import java.util.*;

import org.apache.bcel.Repository;
import org.apache.bcel.classfile.*;
import org.apache.bcel.generic.*;

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
				MethodGen mg1 = new MethodGen(m, cg1.getClassName(), cpg1);
				ins1 = mg1.getInstructionList().getInstructionHandles();
			}
		}

		for(InstructionHandle ih1: ins1){
			Instruction inst = ih1.getInstruction();
			if(inst instanceof INVOKESTATIC){
				//Assuming that the invoked method is in the same class
				if(((INVOKESTATIC) inst).getMethodName(cpg1).contains(methodTo)) return true;
			}
		}
		return false;
	}
}
