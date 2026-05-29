//simple code for Employee Management System
class Employee 
{

    int id = 101;
    String name = "Bhavi";
    int salary = 25000;
	String role = "developer";
	//String role = "Tester";
	//String role = "Devops";

    void display() 
	{

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
public class Main 
{

    public static void main(String[] args) {

        Employee E1 = new Employee();

        E1.display();
    }
}
	
