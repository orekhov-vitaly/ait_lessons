package lesson_36.equals;

import lists.MyArrayList;
import lists.MyList;

public class EmployeeApp {
    public static void main(String[] args) {
        MyList<Employee> list = new MyArrayList<>();

        Employee employee1 = new Employee("Peter", "Petrov", "21.10.2000");
        Employee employee2 = new Employee("Ivan", "Ivanov", "05.12.1990");
        Employee employee3 = new Employee("Ivan", "Ivanov", "15.01.2000");
        Employee employee4 = new Employee("Ivan", "Ivanov", "15.01.2000");
        Employee employee5 = new Employee(null, "Ivanov", "15.01.2000");

        System.out.println("employee1 == employee2: " + (employee1 == employee2));
        System.out.println("employee3 == employee4: " + (employee3 == employee4));

        System.out.println("employee3.equals(employee4): " + employee3.equals(employee4));
        System.out.println("employee3.equals(employee2): " + employee3.equals(employee2));
        System.out.println("===================");
        System.out.println("employee5.equals(employee2): " + employee5.equals(employee2));
        System.out.println("employee5.equals(null): " + employee5.equals(null));
        System.out.println("===================");

        list.add(employee1);
        list.addAll(employee2, employee3, employee4, employee5);

        for (Employee empl : list) {
            System.out.println(empl);
        }

        System.out.println(list.contains(employee2));
    }
}
