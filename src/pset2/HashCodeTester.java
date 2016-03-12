package pset2;

import static org.junit.Assert.*;
import org.junit.Test;

public class HashCodeTester {
	 /*
     * P5: If two objects are equal according to the equals(Object)
     * method, then calling the hashCode method on each of
     * the two objects must produce the same integer result.
     */
	
	@Test
	public void t0_OO(){
		Object x = new Object();
		Object y = new Object();
		if(x.equals(y)){
			assertTrue(x.hashCode() == y.hashCode());
		}
	}
	
	@Test
	public void t1_CC(){
		C x = new C(10);
		C y = new C(10);
		if(x.equals(y)){
			assertTrue(x.hashCode() == y.hashCode());
		}
	}
	
	@Test
	public void t2_DD(){
		D x = new D(10,20);
		D y = new D(10,20);
		if(x.equals(y)){
			assertTrue(x.hashCode() == y.hashCode());
		}
	}
	
	@Test
	public void t3_OC(){
		Object x = new Object();
		C y = new C(10);
		if(x.equals(y)){
			assertTrue(x.hashCode() == y.hashCode());
		}
	}
	
	@Test
	public void t4_CO(){
		C x = new C(10);
		Object y = new Object();
		if(x.equals(y)){
			assertTrue(x.hashCode() == y.hashCode());
		}
	}
	
	@Test
	public void t5_OD(){
		Object x = new Object();
		D y = new D(10,20);
		if(x.equals(y)){
			assertTrue(x.hashCode() == y.hashCode());
		}
	}

	@Test
	public void t6_DO(){
		D x = new D(10,20);
		Object y = new Object();
		if(x.equals(y)){
			assertTrue(x.hashCode() == y.hashCode());
		}
	}
	
	@Test
	public void t7_CD(){
		C x = new C(10);
		D y = new D(10,20);
		if(x.equals(y)){
			assertTrue(x.hashCode() == y.hashCode());
		}
	}

	@Test
	public void t8_DC(){
		D x = new D(10,20);
		C y = new C(10);
		if(x.equals(y)){
			assertTrue(x.hashCode() == y.hashCode());
		}
	}
	
}
