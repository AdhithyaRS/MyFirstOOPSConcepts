package oops;
//abstract method is created if we dont have a design, but maybe defined in future
//If a class has abstract method, then class should be also abstract
//We cannot create an object of abstract class
//If we extend an abstract class, then the sub class should be responsible to define the abstract method of parent class which is compulsory
//It is not compulsory to have abstract method in a abstract class

abstract class Car{
	int age;
	public abstract void drive();
	public abstract void fly();
	
	public void playMusic() {
		System.out.println("Playing Music....");
	}
}
class WagonR extends Car{
	public void drive() {
		System.out.println("Driving WagonR...");
	}
	public void fly() {
		System.out.println("Flying WagonR...");
	}
	
}
//If an inherited class of an abstract class is not able to define the parent abstract methods, even the subclass becomes a abstract class
abstract class Polo extends Car{
	public void drive() {
		System.out.println("Driving Polo...");
	}
	
}
class UpdatedPolo extends Polo{
	public void drive() {
		System.out.println("Driving AdvPolo...");
	}
	public void fly() {
		System.out.println("Flying AdvPolo...");
	}
	
}
public class LearnAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car objCar = new WagonR();
		objCar.drive();
		objCar.playMusic();
		objCar.fly();
		Car objCar2 = new UpdatedPolo();
		objCar2.drive();
		objCar2.playMusic();
		objCar2.fly();
		//Or If we want to create an object of abstract class we can use anonymous inner class as below, but actually we are creating an object of that anonymous inner class
		Car objCar3 = new Car() {
			public void fly() {
				System.out.println("Car Flying...");
			}
			public void drive() {
				System.out.println("Car Driving...");
			}
		};
		
		objCar3.drive();
		objCar3.fly();
		objCar3.playMusic();
		//interface
		B objB = new B();
		objB.show();
		objB.config();
		objB.walk();
		objB.run();
		LearnInterface objLearnInterface = new B();
		objLearnInterface.config();
		//objLearnInterface.run();// We can call methods which are present in interface even if B objects implements other interface.
		Computer desk = new Desktop();
		Computer lap = new Laptop();
		Developer human = new Developer();
		human.devApp(lap);
		human.devApp(desk);
		

	}

}
