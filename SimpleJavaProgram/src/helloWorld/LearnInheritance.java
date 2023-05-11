package helloWorld;

import oops.Calc;

//We need inheritance for adding extra features and sell each version easily by just selling the required class.
// Like in the below example I can sell Calc for 10$, AdvCalc for 20$ and SciCalc for 30$

class SciCalc extends AdvCalc{
	public double root(double a) {
		return Math.sqrt(a);
	}
	public double power(double a, double b) {
		return Math.pow(a,b);
	}
	
}

public class LearnInheritance {

	public static void main(String[] args) {
		Calc obj = new Calc();
		obj.add(5, 7);
		AdvCalc obj1 = new AdvCalc();
		obj1.add(3, 303);
		
		

	}

}
