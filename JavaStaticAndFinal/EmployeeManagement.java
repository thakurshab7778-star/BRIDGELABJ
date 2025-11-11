package JavaStaticAndFinal;
class Employee {
    static String companyName = "Microsoft";
    static int totalEmployees = 0;
    final int id;
    String name;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Nishant", 0001, "Software Engineer");
        Employee e2 = new Employee("Zenith", 0002, "Web Development");
        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}