package ClassAndObjects.Level1;
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class employeedetails {
    public static void main(String[] args) {
        Employee e1 = new Employee("Nishant", 10121, 55000);
        e1.displayDetails();
    }
}