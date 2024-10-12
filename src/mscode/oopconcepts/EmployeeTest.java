package mscode.oopconcepts;

class Employee {
    int empNum;
    String empName;
    double empSalary;

    void setEmpDetails(int empNum, String empName,double empSalary) {
        this.empNum = empNum;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    void disEmpDetails() {
        System.out.println("Emp number: " + empNum);
        System.out.println("Emp Name: " + empName);
        System.out.println("Salary : " + empSalary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpDetails(111,"John Doe",8000.0);
        e1.disEmpDetails();
        Employee e2 = new Employee();
        e2.setEmpDetails(123,"Samuel James",8600.0);
        e2.disEmpDetails();


    }

}
