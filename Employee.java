public class Employee {
    String name;
    String position;
    int id;
    double salary;

    public Employee() {
        System.out.println("No parameterized constructor");
    }

    public Employee(String name, String position, int id, double salary) {
        this.name = name;
        this.position = position;
        this.id = id;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

