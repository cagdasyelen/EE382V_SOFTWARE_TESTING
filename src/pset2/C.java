package pset2;

public class C {
	int f;
	public C(int f){
		this.f = f;
	}
	
	@Override
	public boolean equals(Object o){
		if(o==this){
			return true;
		}
		else if(o == null || getClass() != o.getClass()){
			return false;
		}
		
		C c = (C) o;
		return Integer.compare(c.f, f)==0;
	}
	
	@Override
	public int hashCode(){
		int result = 67;
		result = 37 * result + f;
		return result;
		
	}
	
	public static void main(String [] args){
		C c = new C(10);
		System.out.println(c.hashCode());
	}

}
