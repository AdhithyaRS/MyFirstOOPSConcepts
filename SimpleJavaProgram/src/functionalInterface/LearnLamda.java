package functionalInterface;



//Lamda expresion only works with Functional Interface
@FunctionalInterface
interface A{
	void show();
}
@FunctionalInterface
interface B{
	void show(int i);
}
@FunctionalInterface
interface C{
	void show(int i, String str);
}
@FunctionalInterface
interface D{
	String show(int i, String str);
}
public class LearnLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new A() {
			public void show() {
				System.out.println("In Lengthy A show");
			}
		};
		obj1.show();
		
		A obj = () -> System.out.println("In A show");
		obj.show();
		
		B objB = i -> System.out.println("In B show " +i);// If only one variable no need to mention the type
		objB.show(5);
		
		C objC = (i,j) -> System.out.println("In " + j + " show " + i);// If only one variable no need to mention the type
		objC.show(5,"Adhithya");
		
		D objD = (i,j) -> {
			return j + " wins " + i + " times!!!";
		};
		/*
		 * //If there is only one statement and when the method should return something,
		 * Then we cannot write a return keyword like mentioned below 
		 * D objD = (i,j) -> j + " wins " + i + " times!!!";
		 */
		
		System.out.println(objD.show(5, "Adhithya"));
	}

}
