package oops;
import helloWorld.*;
import helloWorld.Strings;

//object
//Method overloading
//EVery Method will have its own stack memory
//Heap memory stores objects and its variable and methods.

class Students{
	private String name;
	private int age;
	private int marks;
	private int rollno;
	public Students(String name, int age, int marks, int rollno) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + ", marks=" + marks + ", rollno=" + rollno + "]";
	}
	
	
}

public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strings user= new Strings("Adhithya RS");
		user.compute();
		int num1 = 1676;
		int num2 = 89;
		Calc obj = new AdvCalc();//the second part will create an object and store its address in reference variable i.e obj.
		System.out.println(obj.add(num1, num2));
		System.out.println(obj.sub(num1, num2));
		

	}

}
