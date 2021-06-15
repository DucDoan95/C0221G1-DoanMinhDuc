package model.bean;

public class Employee {
    private int employeeID;
    private String employeeName;
    private String EmployeeBirthday;

    public Employee(int employeeID, String employeeName, String employeeBirthday) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        EmployeeBirthday = employeeBirthday;
    }

    public Employee() {
    }

    public Employee(String employeeName, String employeeBirthday) {
        this.employeeName = employeeName;
        EmployeeBirthday = employeeBirthday;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthday() {
        return EmployeeBirthday;
    }

    public void setEmployeeBirthday(String employeeBirthday) {
        EmployeeBirthday = employeeBirthday;
    }
}
