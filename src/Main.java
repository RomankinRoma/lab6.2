import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Component> components=new ArrayList<>();
        Company company=new Company(components);
        Client client=new Client();
        Component Department1=new Department("Dep1");
        Component Department2=new Department("Dep2");
        Component Department3=new Department("Dep3");
        Component EmployeeCEO=new Employee(6000, EmployeeType.CEO);
        Component EmployeeCTO=new Employee(6000,EmployeeType.CTO);
        Component Employee=new Employee(5000,EmployeeType.COMMON);
        client.addDepartment(company,Department1);
        client.addDepartment(company,Department2);
        client.addEmployee(company,EmployeeCEO);
        client.addEmployee(company,EmployeeCTO);
        client.addEmployee(Department1,Employee);
        client.addEmployee(Department1,Employee);
        client.addEmployee(Department2,Employee);
        client.addDepartment(Department2,Department3);
        client.addEmployee(Department3,Employee);
        client.addEmployee(Department3,Employee);
        client.employee(company);
        client.Wage(company);
    }
}
