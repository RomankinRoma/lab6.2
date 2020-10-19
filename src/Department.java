import java.util.ArrayList;
import java.util.List;

public class Department implements  Component {
    private List<Component> list = new ArrayList<>();
    private String name;
    public List<Component> getList() {
        return list;
    }

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String nameDep() {
        return name;
    }


    @Override
    public List<Component> list() {
        return list;
    }

    @Override
    public Integer sumWage() {
        int i = 0;
        for (Component component: list
        ) {
            i = i + component.sumWage();
        }
        return i;
    }

    @Override
    public Integer sumEmployee() {
        int i = 0;
        for (Component component: list
        ) {
            i = i + component.sumEmployee();
        }
        return i;
    }

    @Override
    public Integer sumDepartment() {
        return 1;
    }

    @Override
    public Boolean isComposite() {
        return true;
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }
}
