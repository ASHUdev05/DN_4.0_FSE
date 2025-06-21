public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1, "Alice", "Developer", 60000),
            new Employee(2, "Bob", "Designer", 55000),
            new Employee(3, "Charlie", "Manager", 70000)
        };

        EmpManager empManager = new EmpManager();

        empManager.traverseEmployees(employees);
        System.out.println("Adding a new employee:");
        empManager.addEmployee(employees, new Employee(4, "David", "Tester", 50000));
        empManager.traverseEmployees(employees);
        System.out.println("Searching for employee with ID 2:");
        Employee foundEmployee = empManager.searchEmployee(employees, 2);
        if (foundEmployee != null) {
            System.out.println("Found: " + foundEmployee);
        } else {
            System.out.println("Employee not found.");
        }
        System.out.println("Removing employee with ID 1:");
        empManager.removeEmployee(employees, 1);
        empManager.traverseEmployees(employees);
    }
}