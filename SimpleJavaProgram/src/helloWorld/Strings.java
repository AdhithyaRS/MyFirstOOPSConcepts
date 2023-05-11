package helloWorld;

public class Strings {
	private String str;//Immutable String
	public Strings() {
		
	}
	public void compute() {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(" "+this.str);
		String res = sb.toString();
		System.out.println(res);
	}
	public Strings(String str) {
		super();
		this.str = str;
	}

}
class demo{
	int a;
	int b;
	public demo(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
}
