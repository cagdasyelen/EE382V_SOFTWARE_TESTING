package pset4;

import org.apache.bcel.Repository;
import org.apache.bcel.classfile.*;
import org.apache.bcel.generic.*;


public class GraphGenerator {
	public CFG createCFG(String className) throws ClassNotFoundException {
		CFG cfg = new CFG();
		JavaClass jc = Repository.lookupClass(className);
		ClassGen cg = new ClassGen(jc);
		ConstantPoolGen cpg = cg.getConstantPool();
		for (Method m : cg.getMethods()) {
			MethodGen mg = new MethodGen(m, cg.getClassName(), cpg);
			InstructionList il = mg.getInstructionList();
			InstructionHandle[] handles = il.getInstructionHandles();
			for (InstructionHandle ih : handles) {
				int position = ih.getPosition();
				cfg.addNode(position, m, jc);
				Instruction inst = ih.getInstruction();
				// 
				//
				// your code goes here
				//
				if( inst instanceof ReturnInstruction){
					cfg.addEdge(ih.getPosition(), m, jc, -1, m, jc);
				}	
				else if(!(inst instanceof GotoInstruction)){
					cfg.addEdge(ih.getPosition(), m, jc, ih.getNext().getPosition(), m, jc);
				}	
				else if(inst instanceof BranchInstruction){
					cfg.addEdge(ih.getPosition(), m, jc, ((BranchInstruction) inst).getTarget().getPosition(), m, jc);
				}		
			}
		}
		return cfg;
	}

	public CFG createCFGWithMethodInvocation(String className) throws ClassNotFoundException {
		CFG cfg = new CFG();
		JavaClass jc = Repository.lookupClass(className);
		ClassGen cg = new ClassGen(jc);
		ConstantPoolGen cpg = cg.getConstantPool();
		for (Method m : cg.getMethods()) {
			MethodGen mg = new MethodGen(m, cg.getClassName(), cpg);
			InstructionList il = mg.getInstructionList();
			InstructionHandle[] handles = il.getInstructionHandles();
			for (InstructionHandle ih : handles) {
				int position = ih.getPosition();
				cfg.addNode(position, m, jc);
				Instruction inst = ih.getInstruction();
				// 
				//
				//your code goes here
				//
				if( inst instanceof ReturnInstruction){
					cfg.addEdge(ih.getPosition(), m, jc, -1, m, jc);
				}
				else if(inst instanceof INVOKESTATIC){
					Method m2 = cg.containsMethod(((INVOKESTATIC) inst).getMethodName(cpg), ((INVOKESTATIC) inst).getSignature(cpg));
					cfg.addEdge(ih.getPosition(), m, jc, 0, m2, jc);
					cfg.addEdge(-1, m2, jc, ih.getNext().getPosition(), m, jc);
				}
				else if(!(inst instanceof GotoInstruction)){
					cfg.addEdge(ih.getPosition(), m, jc, ih.getNext().getPosition(), m, jc);
				}	
				else if(inst instanceof BranchInstruction){
					cfg.addEdge(ih.getPosition(), m, jc, ((BranchInstruction) inst).getTarget().getPosition(), m, jc);
				}		
			}
		}
		return cfg;
	}

	public static void main(String[] a) throws ClassNotFoundException {
		GraphGenerator gg = new GraphGenerator();
		gg.createCFG("pset4.C"); // example invocation of createCFG
		CFG a1 = gg.createCFGWithMethodInvocation("pset4.D"); // example invocation of
														// createCFGWithMethodInovcation
		System.out.println(a1);
	}
}