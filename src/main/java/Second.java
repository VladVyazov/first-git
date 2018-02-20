public class Second {
    private String name;
    private int age;

    public Second() {
    }

    public Second(int age) {

        this.age = age;
    }

    public Second(String name) {

        this.name = name;
    }

    public Second(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
