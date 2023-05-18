package functionalInterface;
/*
Types of errors:
* Compile time error
* Logical Error
* Runtime error(Exceptions): We have to handles these, if not handled the application will stop when runtime errors occurs
* Exception is of two types:
* Checked & Unchecked Exception

 */
//@SuppressWarnings("serial")
//We can create our own exception by entending to exception class
class MilkyException extends Exception{
	static final long serialVersionUID = -3387516993124229948L;
	public MilkyException(String str) {
		super(str);
	}
}
public class LearnExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=-1;
		int[] num = new int[5];
		try {
			sum=32/35;
			num[3]=6;
			if(sum == 0) throw new MilkyException("This is my own Exception");
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			if(sum!=0) System.out.println("You are trying to divide a number with zero");
			else System.out.println("You are trying to divide a number greater than numerator");
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("You are trying to go beyond the array limits");
		} catch(MilkyException e) {
			System.out.println(e);
		}
		System.out.println(sum);
		System.out.println("Bye");

	}

}
