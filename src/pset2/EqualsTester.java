package pset2;

import static org.junit.Assert.*;
import org.junit.Test;


public class EqualsTester {
	/*
	 * P4:It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true
	 * and y.equals(z) returns true, then x.equals(z) should return true; 
	 */

	@Test
	public void t0_OOO(){
		Object x = new Object();
		Object y = new Object();
		Object z = new Object();
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	
	@Test
	public void t1_OOC(){
		Object x = new Object();
		Object y = new Object();
		C z = new C(10);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	
	@Test
	public void t2_OOD(){
		Object x = new Object();
		Object y = new Object();
		D z = new D(10,20);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	
	@Test
	public void t3_OCO(){
		Object x = new Object();
		C y = new C(10);
		Object z = new Object();
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}

	@Test
	public void t4_OCC(){
		Object x = new Object();
		C y = new C(10);
		C z = new C(10);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	@Test
	public void t5_OCD(){
		Object x = new Object();
		C y = new C(10);
		D z = new D(10,20);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	@Test
	public void t6_ODO(){
		Object x = new Object();
		D y = new D(10,20);
		Object z = new Object();
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}

	@Test
	public void t7_ODC(){
		Object x = new Object();
		D y = new D(10,20);
		C z = new C(10);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}

	@Test
	public void t8_ODD(){
		Object x = new Object();
		D y = new D(10,20);
		D z = new D(10,20);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	
	@Test
	public void t9_COO(){
		C x = new C(10);
		Object y = new Object();
		Object z = new Object();
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	
	@Test
	public void t10_COC(){
		C x = new C(10);
		Object y = new Object();
		C z = new C(10);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	
	@Test
	public void t11_COD(){
		C x = new C(10);
		Object y = new Object();
		D z = new D(10,20);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	
	@Test
	public void t12_CCO(){
		C x = new C(10);
		C y = new C(10);
		Object z = new Object();
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}

	@Test
	public void t13_CCC(){
		C x = new C(10);
		C y = new C(10);
		C z = new C(10);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	@Test
	public void t14_CCD(){
		C x = new C(10);
		C y = new C(10);
		D z = new D(10,20);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	@Test
	public void t15_CDO(){
		C x = new C(10);
		D y = new D(10,20);
		Object z = new Object();
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}

	@Test
	public void t16_CDC(){
		C x = new C(10);
		D y = new D(10,20);
		C z = new C(10);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}

	@Test
	public void t17_CDD(){
		C x = new C(10);
		D y = new D(10,20);
		D z = new D(10,20);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	
	@Test
	public void t18_DOO(){
		D x = new D(10,20);
		Object y = new Object();
		Object z = new Object();
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	
	@Test
	public void t19_DOC(){
		D x = new D(10,20);
		Object y = new Object();
		C z = new C(10);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	
	@Test
	public void t20_DOD(){
		D x = new D(10,20);
		Object y = new Object();
		D z = new D(10,20);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	
	@Test
	public void t21_DCO(){
		D x = new D(10,20);
		C y = new C(10);
		Object z = new Object();
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}

	@Test
	public void t22_DCC(){
		D x = new D(10,20);
		C y = new C(10);
		C z = new C(10);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	@Test
	public void t23_DCD(){
		D x = new D(10,20);
		C y = new C(10);
		D z = new D(10,20);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	@Test
	public void t24_DDO(){
		D x = new D(10,20);
		D y = new D(10,20);
		Object z = new Object();
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}

	@Test
	public void t25_DDC(){
		D x = new D(10,20);
		D y = new D(10,20);
		C z = new C(10);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}

	@Test
	public void t26_DDD(){
		D x = new D(10,20);
		D y = new D(10,20);
		D z = new D(10,20);
		if(x.equals(y) && y.equals(z)){
			assertTrue(x.equals(z));
		}
	}
	

}
