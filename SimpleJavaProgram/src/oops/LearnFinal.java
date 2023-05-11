package oops;
// final variable's values cannot be changed
// final class cannot be inherited
// final method cannot be override by subClass methods 
public class LearnFinal extends Calc{
	public void compute() {
		final int num=20;
		System.out.println(num);
	}

}
