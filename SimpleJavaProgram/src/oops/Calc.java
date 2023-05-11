package oops;

public class Calc {
	int a;//instance variable
	int b;//instance variable
	
	//Every Objects has behaviour and property
	public void show() {
		System.out.println("In Calc show");
	}
	public int add(int num1, int num2) {
		return num1+num2;
	}
	public double add(double num1, int num2) {
		return num1+num2;
	}
	public int add(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	public int sub(int num1, int num2) {
		return num1-num2;
	}


}