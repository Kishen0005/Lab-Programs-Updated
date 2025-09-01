import Transport.*;
public class Main {
	public static void main(String[] args) {
		Ebike e = new Ebike("EB-101", 50);
		e.deliver("Burger ", "APJ BLOCK ");
		Drone d = new Drone("DR-991");
		d.deliver("pen", "ExamCell");
		d.deliver("USB", "ISE Block");
		double bill = d.cost(5);
		System.out.println("Drone delivery cost: Rs." + bill);
	}
}

