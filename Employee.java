package Employee;

public class Employee {
	String name;
	int id;
	long salary;
	Employee(String name,int id,long salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	void display() {
		System.out.println("Employee name"+name);
		System.out.println("Employee id"+id);
		System.out.println("Employee salary"+salary);
	}
	void inc_salary(int q) {
		double inc=(salary*q)/100;
		salary+=inc;
		System.out.println("increased salary is:"+salary);
	}

}
