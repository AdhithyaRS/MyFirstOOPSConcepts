package helloWorld;
//super() method calls the default constructor of its super/parent class, unless we explicitly mention which cons!
//Every class in java extends Object class
//this() method calls the constructor of the current class.
class A extends Object{
	public A() {
		super();//Every cons has this method Even it is not mentioned it is called by JVM
		System.out.println("In A Cons");
	}
	public A(int n) {
		super();//Every cons has this method Even it is not mentioned it is called by JVM
		System.out.println("In A int Cons");
	}
	public void show() {
		System.out.println("In A show");
	}
	public void config() {
		System.out.println("In A config");
	}
}

class B extends A{
	public B() {
		super();//Every cons has this method Even it is not mentioned it is called by JVM
		System.out.println("In B Cons");
	}
	public B(String str) {
		System.out.println("In B String Cons");
		
	}
	public B(int n) {
		this("Adhithya");
		//super(6);//Every cons has this method Even it is not mentioned it is called by JVM
		
		System.out.println("In B int Cons");
	}
	public void show() {
		System.out.println("In B show");
	}
}
public class LearnThisSuperOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj= new B();
		//new B();//anonymous Object Creation
		obj.show();

	}

}
