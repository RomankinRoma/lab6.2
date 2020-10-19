public class Employee implements Component{
    Integer wage;
    EmployeeType type;

    public Employee(Integer wage, EmployeeType type) {
        this.wage = wage;
        this.type = type;
    }

    public Integer getWage() {
        return wage;
    }

    public void setWage(Integer wage) {
        this.wage = wage;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    @Override
    public String nameDep() {
        return null;
    }

    @Override
    public Integer sumWage() {
        return wage;
    }

    @Override
    public Integer sumEmployee() {
        return 1;
    }

    @Override
    public Integer sumDepartment() {
        return 0;
    }

    @Override
    public Boolean isComposite() {
        return false;
    }

    @Override
    public void add(Component component) {
    }

    @Override
    public void remove(Component component) {
    }

}
