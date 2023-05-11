package oops;

public class Oops1 {

	public static void main(String[] args) {
		System.out.println("I am back");
		// TODO Auto-generated method stub
		
		Students obj1= new Students("Navin", 18, 56, 1);
		Students obj2= new Students("Adhithya", 30, 99, 2);
		Students obj3= new Students("Giri", 17, 43, 3);
		Students[] arr= {obj1,obj2,obj3};
		for(Students studs: arr) {
			System.out.println(studs.toString());
			//System.out.println(studs.name);//once the instance variable are private from diff class
		}
		
		
	}

}
