import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
        int chose=-1;
        while (chose!=0){
            System.out.println("1.Add employee");
            System.out.println("2.Add department");
            System.out.println("3.Remove employee");
            System.out.println("4.Remove department");
            System.out.println("5.Number of employees and there wage");
            System.out.println("6.All departments");
            chose=in.nextInt();
            switch (chose){
                case 1:
                    Employee newEmployee=null;
                    System.out.println("Input wage of employee:");
                    Integer wage=in.nextInt();
                    System.out.println("1."+EmployeeType.COMMON);
                    System.out.println("2."+EmployeeType.CTO);
                    System.out.println("3."+EmployeeType.CEO);
                    Integer type=in.nextInt();
                    if (type==1) {
                         newEmployee= new Employee(wage, EmployeeType.COMMON);
                    }
                    if (type==2) {
                        newEmployee= new Employee(wage, EmployeeType.CTO);
                    }
                    if (type==3) {
                        newEmployee = new Employee(wage, EmployeeType.CEO);
                    }
                    System.out.println("If you need to add employee to root write company\nChoose department to add(write name of department):");
                    client.getDepartments(company);
                    String name=in.nextLine();
                    name=in.nextLine();
                    if (client.getDepartment(company,name)!=null){
                        client.addEmployee(client.getDepartment(company,name),newEmployee);
                    }else if(name.equals("company")){
                        client.addEmployee(company,newEmployee);
                    }else{
                        System.out.println("Error NotFound(");
                    }
                        break;
                case 2:
                    Department newDep=null;
                    System.out.println("Input department name:");
                    String depName=in.nextLine();
                    depName=in.nextLine();
                    newDep=new Department(depName);
                    System.out.println("If you need to add employee to root write company\nChoose department to add(write name of department):");
                    client.getDepartments(company);

                    name=in.nextLine();
                    if (client.getDepartment(company,name)!=null){
                        client.addDepartment(client.getDepartment(company,name),newDep);
                    }else if(name.equals("company")){
                        client.addDepartment(company,newDep);
                    }else{
                        System.out.println("Error NotFound(");
                    }
                    break;
                case 3:
                    System.out.println("Choose department to remove employee\nIf employee in root write name as company:");
                    client.employeesForRemove(company);
                    depName=in.nextLine();
                    depName=in.nextLine();
                    if (client.getDepartment(company,depName)!=null && client.getDepartment(company,depName).list().contains(Employee))
                        client.removeEmployee(client.getDepartment(company,depName),Employee);
                    else
                        System.out.println("Department not found or there no employees");
                    break;
                case 4:
                    System.out.println("Choose department for remove(Write 2 name 1-parent,2-child)\nIf parent is root write parent as company:");
                    client.getDepartmentsForRemove(company);
                    System.out.println("Parent:");
                    String parent=in.nextLine();
                    parent=in.nextLine();
                    System.out.println("Child:");
                    String child=in.nextLine();
                    if (client.getDepartment(company,parent)!=null){
                        client.removeDepartment(client.getDepartment(company,parent),client.getDepartment(company,child));
                    }else if(parent.equals("company")){
                        client.removeDepartment(company,client.getDepartment(company,child));
                    }else{
                        System.out.println("Error NotFound(");
                    }
                    break;
                case 5:
                    client.employee(company);
                    client.Wage(company);
                    break;
                case 6:
                    client.getDepartments(company);
                    break;
                case 0:
                    System.out.println("GOOD BYE)");
                    break;
                default:
                    System.out.println("Incorrect chose!");
                    break;
            }
        }
    }
}
