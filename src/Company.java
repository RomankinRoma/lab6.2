import java.util.ArrayList;
import java.util.List;

public class Company implements Component{
    private List<Component> components=new ArrayList<>();

    public Company(List<Component> components) {
        this.components = components;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    @Override
    public String nameDep() {
        return null;
    }

    @Override
    public Integer sumWage() {
        int i = 0;
        for (Component component: components
        ) {
            i = i + component.sumWage();
        }
        return i;
    }

    @Override
    public Integer sumEmployee() {
        int i = 0;
        for (Component component: components
        ) {
            i = i + component.sumEmployee();
        }
        return i;
    }

    @Override
    public Integer sumDepartment() {
        int i = 0;
        for (Component component: components
        ) {
            i = i + component.sumDepartment();
        }
        return i;
    }

    @Override
    public Boolean isComposite() {
        return true;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }
}
