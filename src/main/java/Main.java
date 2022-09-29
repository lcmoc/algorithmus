import Model.Person;
import NumberSorts.BubbleSort;
import NumberSorts.SelectionSort;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Wörter sortieren

        String word = "abendessen";
        char[] chars = word.toCharArray();

        System.out.println(chars);
        int last = chars.length-1;

        for(int i =0; i<chars.length / 2; i++) {
           char temp = chars[i];

           chars[i] = chars[last -i];
           chars[last-i] = temp;
        }

        // Bubble Sort
        int bubbleNumbers[] = {5, 3, 7, 8, 10};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < bubbleNumbers.length; i++){
            System.out.print(bubbleNumbers[i] + " ");
        }
        System.out.println();

        new BubbleSort(bubbleNumbers);

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < bubbleNumbers.length; i++){
            System.out.print(bubbleNumbers[i] + " ");
        }

        System.out.println();

        //selection sort
        int selectionNumbers[] = {5, 3, 7, 8, 10};

        System.out.println("Array Before Selectioon Sort");
        for(int i=0; i < selectionNumbers.length; i++){
            System.out.print(selectionNumbers[i] + " ");
        }
        System.out.println();

        new SelectionSort(selectionNumbers);

        System.out.println("Array After Selection Sort");
        for(int i=0; i < selectionNumbers.length; i++){
            System.out.print(selectionNumbers[i] + " ");
        }

        // Person Sort

        PersonData personDaata = new PersonData();
        Person[] persons = personDaata.creatPersons();

        for(int i =0; i<persons.length -1; i++) {
            for(int index=1; index<persons.length -1; index++) {
                if(persons[index].compareTo(persons[index + 1]) > 0) {

                    Person swap = persons[index + 1];
                    persons[index + 1] = persons[index];
                    persons[index] = swap;
                }
            }
        }

        Stream.of(persons).forEach(p -> System.out.println(p.getAge()));
    }
}
