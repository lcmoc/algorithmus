package Entities.Comperator;

import java.util.Comparator;

public class ComperatorEntityFirstName implements Comparator<ComperatorEntityFirstName> {

    private String firstName;
    private String lastName;
    private double height;
    private int shoeSize;
    private int age;

    public ComperatorEntityFirstName(String firstName, String lastName, double height, int shoeSize, int age) {
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
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", shoeSize=" + shoeSize +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(ComperatorEntityFirstName o1, ComperatorEntityFirstName o2) {
        int result = o1.getFirstName().compareTo(o2.getFirstName());
        if(result == 0 ){

            return o1.getFirstName().compareTo(o2.getFirstName());
        }
        return result;
    }
}
