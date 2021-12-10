package prototype;

class Cashier implements Employee {
    public long empId;
    private String name;
    private String position;

    public Cashier(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId+" " +name+ " " + position );
    }

    public long showEmployeeID() {
        return empId;
    }
    public String showEmployeeName() {
        return name;
    }
}
