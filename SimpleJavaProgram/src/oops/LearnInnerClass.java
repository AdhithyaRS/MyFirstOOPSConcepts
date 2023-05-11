package oops;



//When you need a class which is totally depends on another class, We can create a class inside another class
class Outer{
	//private int age;
	public void show() {
		System.out.println("In Outer Show");
	}
	class Inner{
		public void config() {
			System.out.println("In Inner show");
			
		}
	}
	//We can make a class static only if it is a inner class
	static class Inner1{
		public void config() {
			System.out.println("In InnerStatic show");
			
		}
	}
	
}
public class LearnInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer objOuter = new Outer();
		objOuter.show();
		//If we want to change the behaviour of a method. This is called as Anonymous inner class
		Outer objOuter2 = new Outer() {
			public void show() {
				System.out.println("In New Show");
			}
		};
		objOuter2.show();
		//When the inner class is not static, we can create an obj of inner class only with the help of outer class object
		Outer.Inner obj1 = objOuter.new Inner();
		obj1.config();
		Outer.Inner1 obj2 = new Outer.Inner1();
		obj2.config();

	}

}
