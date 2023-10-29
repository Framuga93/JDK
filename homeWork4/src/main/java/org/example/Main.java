package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.add(new Employee(987771,"Иван",4));
        employeeDirectory.add(new Employee(987772,"Алексей",2));
        employeeDirectory.add(new Employee(987773,"Степан",3));
        employeeDirectory.add(new Employee(987774,"Алексей",2));
        System.out.println(employeeDirectory.getEmpByExpLevel(2));
        System.out.println(employeeDirectory.getEmployeePhoneByName("Алексей"));
        System.out.println(employeeDirectory.getEmployeeByCardId(4));
    }
}