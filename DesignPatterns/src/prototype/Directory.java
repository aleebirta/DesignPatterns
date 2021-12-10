package prototype;

import java.util.ArrayList;
import java.util.List;

class Directory implements Employee {
    public List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails() {
        for(Employee emp:employeeList) {
            emp.showEmployeeDetails();
        }
    }
    public long showEmployeeID() {
        long maxid=1;
        String name="";
        for(Employee emp:employeeList) {
            if (emp.showEmployeeID()>maxid) {
                maxid=emp.showEmployeeID();
                name=emp.showEmployeeName();
            }
        }
        System.out.println("The employee of the year is "+name+". The ID is " + maxid);
        return  0;
    }

    public String showEmployeeName() {
        return null;
    }

    public void HigherEmpId() {}

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }

    public void sizeList() {
        System.out.println(employeeList.size());
        System.out.println();
    }
}
