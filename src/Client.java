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
        if (component1.nameDep()!=null) {
            System.out.println("Employee added to " + component1.nameDep() + ":" + component1.sumEmployee() + "\n");
        }else{
            System.out.println("Employee added");
        }
    }
    public void removeEmployee(Component component1,Component component2){
        if (component1.isComposite())
            component1.remove(component2);
        System.out.println("Employee removed");
    }

    public void employeesForRemove(Component component){
        if (component.isComposite()){
            for (Component c: component.list())
            {
                if (c.nameDep()!=null)
                    System.out.println(c.nameDep()+":"+c.sumEmployee());
                getDepartments(c);
            }
        }
    }
    public void addDepartment(Component component1, Component component2)
    {
        if (component1.isComposite())
        {
            component1.add(component2);
        }
        System.out.println("Department added: "+component1.sumDepartment()+"\n");

    }
    public void removeDepartment(Component component1,Component component2){
        if (component1.isComposite())
            component1.remove(component2);
        System.out.println("Department removed");
    }
    public void getDepartments(Component component) {
        if (component.isComposite()){
            for (Component c: component.list())
                 {
                if (c.nameDep()!=null)
                    System.out.println(c.nameDep());
                    getDepartments(c);
                }
            }
    }
    public void getDepartmentsForRemove(Component component) {
        if (component.isComposite()){
            for (Component c: component.list())
            {
                if (c.nameDep()!=null)
                    System.out.println(c.nameDep()+":");
                getDepartments(c);
            }
        }
    }
    public Component getDepartment(Component component,String name) {
        if (component.isComposite()) {
            for (Component c: component.list()){
                if (c.isComposite() && c.nameDep().equals(name)){
                    return c;
                }
                getDepartment(c,name);
            }
            }
        return null;
    }
}
