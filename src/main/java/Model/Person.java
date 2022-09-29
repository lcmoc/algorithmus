package Model;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private double height;
    private int shoeSize;
    private int age;

    public Person(String firstName, String lastName, double height, int shoeSize, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.shoeSize = shoeSize;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (age > o.age) return 1;
        if (age < o.age) return -1;
        return 0;
    }
}
