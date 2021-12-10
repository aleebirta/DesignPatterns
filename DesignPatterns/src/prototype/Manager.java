package prototype;

class Manager implements Employee {
    private String name;
    public long empId;
    private String position;

    public Manager(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId+" " +name+ " " + position );
    }

    public long showEmployeeID(){
        return empId;
    }

    public String showEmployeeName() {
        return name;
    }
}
