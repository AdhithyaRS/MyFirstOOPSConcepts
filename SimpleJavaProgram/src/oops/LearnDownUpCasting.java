package oops;

class AA{
	public void show1() {
		System.out.println("In A show");
	}
}
class BB extends AA{
	public void show2() {
		System.out.println("In B show");
	}
}
public class LearnDownUpCasting {

	public static void main(String[] args) {

		AA obj = new AA();
		obj.show1();
		BB obj1 = (BB) obj;
		obj1.show2();
		

	}

}
