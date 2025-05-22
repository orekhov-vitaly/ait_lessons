package homeworks.homework_25;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Max", 25, 5000.00);

        employee.info();

        Employee peter = new Employee("Peter", 45, 1000.00);

        peter.setSalary(1050);
        peter.info();
    }
}
