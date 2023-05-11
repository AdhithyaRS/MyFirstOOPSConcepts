package helloWorld;
// static means we are making something a class member or belongs to class not a object member.
//import java.lang.*;
class Mobile{
	private String brand;
	private int price;
	static String name;
	static {
		/*static block
		 * Irrespective of how many objects you create static block is called only once*/
		name = "Smart Phones";
		System.out.println("Irrespective of how many objects you create static block is called only once");
	}
	public Mobile() {
		this.brand="xxxxxx";
		this.price=0;
	}
	public Mobile(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
		
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", name=" + name + "]";
	}
	
	public static void show(Mobile obj) {
		//Cannot use non-static variable in static methods, unless you pass the object you want to work with
		System.out.println("Mobile [brand=" + obj.brand + ", price=" + obj.price + ", name=" + name + "]");
	}
	
}
public class LearnStatic {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("helloWorld.Mobile");
		//It loads class 
		System.out.println("Even before objects are created the class loads and static block will be called");
		Mobile obj1= new Mobile("Apple", 1000);
		Mobile obj2= new Mobile("Samsung", 1200);
		Mobile obj3= new Mobile();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		System.out.println(Mobile.name);//static variables should be called with class name
		Mobile.show(obj1);
		
	}

	

}
