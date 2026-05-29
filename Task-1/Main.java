//simple code for Employee Management System
class Employee
{
    int id = 101;
    String name = "Rahul";

    void displayEmployee()
    {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
    }
}

class Manager extends Employee
{
    double salary = 50000.00;

    void displayManager()
    {
        System.out.println("Salary : " + salary);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Manager m = new Manager();

        m.displayEmployee();  
        m.displayManager();
    }
}