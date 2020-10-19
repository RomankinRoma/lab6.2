import java.util.List;

public interface Component {
    String nameDep();
    List<Component> list();
    Integer sumWage();
    Integer sumEmployee();
    Integer sumDepartment();
    Boolean isComposite();
    void add(Component component);
    void remove(Component component);
}
