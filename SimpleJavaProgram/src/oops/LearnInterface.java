package oops;
//When we have an abstract class with only abstract methods, We can create interface instead of an abstract class
//In interface there is no need to mention the method as public abstract void drive();, by default "public abstract" is implemented for all methods
// Need for interface is : It gives what are the methods we need to implement something, but it is our job to define it
// To extend an interface , we have to use implements keyword
// A class can implement multiple interface
//Interface is of three types:
//* Normal Interface: Interface with more than 1 abstract methods
//* Functional Interface/SAM(Single Abstract Method): Interface with only 1 abstract method
//* Marker Interface: Interface with no methods.
//Marker Interface are used to serialization and de-serialization
interface LearnInterface {
	int age = 5;// The variable of an interface is by default final & static
	//It is static because we are not going to create an object of it
	// It is final because interface has no own memory, So without own memory how can we create an non-final variable
	String area = "Mumbai";
	void show();
	void config();
	
}
interface X{
	void run();
}

interface Y extends X{
	// An interface can inherit another interface, But by default all the abstract methods will be included in the child interface
	void walk();
}

class B implements LearnInterface,Y{

	@Override
	public void show() {
		System.out.println("In B show");
		
	}

	@Override
	public void config() {
		System.out.println("In B config");
		
	}
	
	public void run() {
		System.out.println("Running...");
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
	
	
}
interface Computer{
	void code();
}
class Laptop implements Computer{
	public void code() {
		System.out.println("Coding...Compile...run...");
	}
}
class Desktop implements Computer{
	public void code() {
		System.out.println("Coding...Compile...run...:Faster");
	}
}
class Developer{
	public void devApp(Computer obj) {
		obj.code();
	}
}
