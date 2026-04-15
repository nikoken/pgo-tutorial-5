public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private double baseSalary;
    public Employee(String employeeId, String firstName, String lastName, double baseSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }
    public final String getEmployeeId() {
        return employeeId;
    }
    public double calculateMonthlyCost() {
        return baseSalary;
    }
    public String introduceYourself() {
        return "I am an employee: " + firstName + " " + lastName;
    }
    @Override
    public String toString() {
        return  employeeId + " " + firstName + " " + lastName + " - Base Salary: " + baseSalary;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee other = (Employee) obj;
            return this.employeeId.equals(other.employeeId);
        }
        return false;
    }
}