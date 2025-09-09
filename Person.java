package Person;

public class Person {
	  private String name;
	  private int age;
	  private Gender gender;


	public Person(String name,int age,Gender gender) {
		 this.name = name;
	     this.age = age;
	     this.gender = gender;

	}
	 void display_person() {
		 System.out.println("the name of person is "+ name);
		 System.out.println("the age of person is "+ age);
		 System.out.println("the gender of person is "+ gender);
	 }

}



