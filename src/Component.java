public interface Component {
    String nameDep();
    Integer sumWage();
    Integer sumEmployee();
    Integer sumDepartment();
    Boolean isComposite();
    void add(Component component);
    void remove(Component component);
}
