package models;

public class Employee {
    private String id;
    private String nameEmployee;
    private String ageEmployee;
    private String addressEmployee;

    public Employee() {
    }

    public Employee(String id,String nameEmployee, String ageEmployee, String addressEmployee) {
        this.id=id;
        this.nameEmployee = nameEmployee;
        this.ageEmployee = ageEmployee;
        this.addressEmployee = addressEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public String getAgeEmployee() {
        return ageEmployee;
    }

    public String getId() {
        return id;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    @Override
    public String toString() {
        return "Employee{id='" +id+
                ", nameEmployee='" + nameEmployee +
                ", ageEmployee='" + ageEmployee +
                ", addressEmployee='" + addressEmployee +
                '}';
    }
}
