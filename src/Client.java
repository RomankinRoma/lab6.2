public class Client {
    public void employee(Component component)
    {
        System.out.println("Sum of Employee: "+ component.sumEmployee()+"\n");
    }
    public void Wage(Component component)
    {
        System.out.println("Wage of Employees: "+ component.sumWage()+"\n");
    }

    public void addEmployee(Component component1, Component component2)
    {
        if (component1.isComposite())
        {
            component1.add(component2);
        }
        System.out.println("Employee added to "+component1.nameDep()+":"+component1.sumEmployee()+"\n");

    }
    public void addDepartment(Component component1, Component component2)
    {
        if (component1.isComposite())
        {
            component1.add(component2);
        }
        System.out.println("Department added: "+component1.sumDepartment()+"\n");

    }
}
