package functionalInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



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
class xyz{
	public int x() throws Exception {
		
		try {
			y();
		} catch (MilkyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		z();
		return 10;
	}
	public void y() throws MilkyException{
		
	}
	public void z() throws MilkyException{
		
	}
}

class MilkyException extends Exception{
	static final long serialVersionUID = -3387516993124229948L;
	public MilkyException(String str) {
		super(str);
	}
}
public class LearnExceptionHandling {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int sum=-1;
		int[] num = new int[5];
		BufferedReader br = null;
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			br = new BufferedReader(in);
			int getN = Integer.parseInt(br.readLine());
			System.out.println("User input: "+ getN);
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
		finally {
			//finally is used when we want to execute some set of operation irrespective of exceptions arise or not
			//It is useful to close an opened resource 
			System.out.println("This line will be printed whatever happens");
		 br.close();
		}
		
		System.out.println(sum);
		System.out.println("Bye");
		xyz objA = new xyz();
		try {
			System.out.println(objA.x());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
