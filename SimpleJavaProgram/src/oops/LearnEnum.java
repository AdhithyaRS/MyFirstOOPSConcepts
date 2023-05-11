package oops;
//enum are class, but only thing is it cannot be inherited by any other class

enum Status{
	Running, Failed, Success, Pending
}
enum Work{
	MacBook(2000), XPS(2200), Surface, ThinkPad(1800);
	private Work() {
		this.price=500;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int price;
	private Work(int i) {
		this.price = i;
	}
}
public class LearnEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Status s = Status.Running;
		System.out.println(s.name());
		Status[] ss = Status.values();
		for(Status i : ss) {
			System.out.println(i.name() +" : "+ i.ordinal());
		}
		
		if(s == Status.Running) {
			System.out.println("The Process is not yet over");
		}
		
		switch (ss[2]){
		case Running: 
			System.out.println("It is running");
			break;
		case Failed:
			System.out.println("The process failed");
			break;
		case Success:
			System.out.println("The process Completed");
			break;
		case Pending:
			System.out.println("The process is pending");
			break;
		default:
			System.out.println("The status not identified");
		}
		Work lap = Work.Surface;
		System.out.println(lap.getPrice());

	}

}
