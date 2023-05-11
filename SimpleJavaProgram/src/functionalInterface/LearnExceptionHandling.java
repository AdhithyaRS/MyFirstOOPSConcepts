package functionalInterface;
/*
Types of errors:
* Compile time error
* Logical Error
* Runtime error(Exceptions): We have to handles these, if not handled the application will stop when runtime errors occurs
* Exception is of two types:
* Checked & Unchecked Exception

 */
public class LearnExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] num = new int[5];
		try {
			//sum=32/0;
			num[5]=6;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("You are trying to divide a number with zero");
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("You are trying to go beyond the array limits");
		}
		System.out.println(sum);
		System.out.println("Bye");

	}

}
