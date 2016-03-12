package pset2;

public class D extends C {
	
	int g;

	public D(int f, int g) {
		super(f);
		this.g = g;
	}
	
	@Override
	public boolean equals(Object o){
		if(o==this){
			return true;
		}
		else if(o == null || getClass() != o.getClass()){
			return false;
		}
		
		D d = (D) o;
		return Integer.compare(d.f, f)==0 && Integer.compare(d.g, g)==0;
	}
	
	@Override
	public int hashCode(){
		int result = 67;
		result = 37 * result + f;
		result = 37 * result + g;
		return result;
	}

}
