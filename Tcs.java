class Employee {
	int id;
	String eName;
	double salary;
	static String companyName;
	static  String country;
}

public class Tcs {
	public static void main(String[] args) {
// assinging value by creating object in standard format
		Employee e1 = new Employee();
		e1.id = 1;
		e1.eName = "Shubham";
		e1.salary = 20000.0;
		e1.companyName = "Tcs"; //Assinged a common value because it's static
		e1.country = "india"; //Assinged a common value because it's static
		System.out.println("Employee 1 id : " + e1.id);
		System.out.println("Employee 1 name : " + e1.eName);
		System.out.println("Employee 1 salary : " + e1.salary);
		System.out.println("Employee 1 Company Name : " + e1.companyName);
		System.out.println("Employee 1 Country : " + e1.country);

		System.out.println("\n \n \n ");
	
		// now let's assign values by using and creating reference

		Employee  e2 ; //created a reference of class Employee
		e2 = new Employee(); // object is created by using new keyword
		e2.id = 2;
		e2.eName = "samarth";
		e2.salary = 30000.0;

		System.out.println("Employee 2 id : " + e2.id);
		System.out.println("Employee 2 name : " + e2.eName);
		System.out.println("Employee 2 salary : " + e2.salary);
		System.out.println("Employee 2 Company Name : " + e2.companyName); // called a static variable
		System.out.println("Employee 2 Country : " + e2.country); // called a static variable

	}
}