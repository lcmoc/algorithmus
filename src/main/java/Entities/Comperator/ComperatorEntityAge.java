package Entities.Comperator;

import java.util.Comparator;

public class ComperatorEntityAge implements Comparator<ComperatorEntityAge> {

    private String firstName;
    private String lastName;
    private double height;
    private int shoeSize;
    private int age;

    public ComperatorEntityAge(String firstName, String lastName, double height, int shoeSize, int age) {
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
    public String toString() {
        return "Person2{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", shoeSize=" + shoeSize +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(ComperatorEntityAge o1, ComperatorEntityAge o2) {
        if (o1.getAge() > o2.getAge()) return 1;
        if (o1.getAge() < o2.getAge()) return -1;
        return 0;
    }
}
