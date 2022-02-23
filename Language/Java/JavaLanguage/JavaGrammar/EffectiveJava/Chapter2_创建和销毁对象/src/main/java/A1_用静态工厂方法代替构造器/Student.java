package A1_用静态工厂方法代替构造器;

public class Student {
    private String name;
    private int id;
    static Student fragment = new Student();
    public Student(){

    }

    public static Student newInstance() {
        return fragment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
