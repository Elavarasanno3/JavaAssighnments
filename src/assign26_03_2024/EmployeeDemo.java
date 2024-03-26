package assign26_03_2024;
abstract class Employee{
    String name;
    String role;
    int age;

    public  Employee(String name, String role, int age) {
        this.name = name;
        this.role = role;
        this.age = age;
    }
    public abstract String getEmployeeDetails();
}
class HourlyEmployee extends Employee{
    double salaryPerHour ;
    HourlyEmployee(String name,String role,int age,double salaryPerHour ){
        super(name, role, age);
        this.salaryPerHour = salaryPerHour;

    }

    @Override
    public String getEmployeeDetails() {
        return "HourlyEmployee : { " +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                ", salaryPerHour=" + salaryPerHour +
                '}';
    }
}
class SalariedEmployee extends Employee{
    double salaryPerMonth;
    SalariedEmployee(String name,String role,int age,double salaryPerMonth){
        super(name, role, age);
        this.salaryPerMonth = salaryPerMonth;
    }

    @Override
    public String getEmployeeDetails() {
        return "SalariedEmployee : { " +
                " name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee salariedEmployee = new SalariedEmployee("kumar","Developer",24,45000);
        Employee hourlyEmployee = new HourlyEmployee("Ram","Tester",32,300);
        System.out.println(salariedEmployee.getEmployeeDetails());
        System.out.println(hourlyEmployee.getEmployeeDetails());
    }
}
