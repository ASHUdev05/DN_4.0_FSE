public class EmpManager {
    // add employee
    public void addEmployee(Employee[] employees, Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                break;
            }
        }
    }

    // remove employee
    public void removeEmployee(Employee[] employees, int employeeId) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].employeeId == employeeId) {
                employees[i] = null;
                break;
            }
        }
    }

    // search employee
    public Employee searchEmployee(Employee[] employees, int employeeId) {
        for (Employee employee : employees) {
            if (employee != null && employee.employeeId == employeeId) {
                return employee;
            }
        }
        return null; // Not found
    }

    // traverse employees
    public void traverseEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
}
