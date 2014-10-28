package employee;

public class App {

	public static void main(String[] args) {
		
		employee emp1 = new employee();
		
		emp1.firstName="Peter";
		emp1.lastName = "Müller";
		
		emp1.printFullName(firstName, lastName);
	}

}
