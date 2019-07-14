public class Person {

    private String name;

    public Person withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

}
