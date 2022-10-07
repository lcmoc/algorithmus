import Data.Comparable.ComparableDataAge;
import Data.Comparable.ComparableDataFirstName;
import Data.Comperator.ComperatorDataAge;
import Data.Comperator.ComperatorDataFirstName;
import Entities.Comparable.ComparableEntityAge;
import Entities.Comparable.ComparableEntityFirstName;
import Entities.Comperator.ComperatorEntityAge;
import Entities.Comperator.ComperatorEntityFirstName;
import Sorts.Comparabel.ComparabelBubbleSortAge;
import Sorts.Comparabel.ComparabelBubbleSortFirstName;
import Sorts.Comperator.ComperatorBubbleSortAge;
import Sorts.Comperator.ComperatorBubbleSortFirstName;
import Sorts.Standard.BubbleSort;
import Sorts.Standard.SelectionSort;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Bubble Sort
        int bubbleNumbers[] = {5, 3, 7, 8, 10};
        System.out.println("before Bubble Sort");
        System.out.println(Arrays.toString(bubbleNumbers));
        System.out.println();

        new BubbleSort(bubbleNumbers);

        System.out.println("after Bubble Sort");
        System.out.println(Arrays.toString(bubbleNumbers));
        System.out.println();

        //Selection Sort
        int selectionNumbers[] = {5, 3, 7, 8, 10};

        // create stream of selectionNumbers
        System.out.println("before Selection Sort");
        System.out.println(Arrays.toString(selectionNumbers));
        System.out.println();

        new SelectionSort(selectionNumbers);

        System.out.println("after Selection Sort");
        System.out.println(Arrays.toString(selectionNumbers));
        System.out.println();

        //Comparable
        // Person Sort by age
        ComparableEntityAge[] comparableEntityAges = new ComparableDataAge().creatPersons();
        new ComparabelBubbleSortAge(comparableEntityAges);

        System.out.println("Comparable sort by age");
        Stream.of(comparableEntityAges).limit(8).forEach(p -> System.out.println(p.toString()));
        System.out.println();

        // Person Sort by first name
        ComparableEntityFirstName[] comparableEntityFirstNames = new ComparableDataFirstName().creatPersons();
        new ComparabelBubbleSortFirstName(comparableEntityFirstNames);

        System.out.println("Comparable sort by first name");
        Stream.of(comparableEntityFirstNames).limit(8).forEach(p -> System.out.println(p.toString()));
        System.out.println();

        //Comperator
        // Person Sort by age
        ComperatorEntityAge[] comperatorEntityAge = new ComperatorDataAge().creatPersons();
        new ComperatorBubbleSortAge(comperatorEntityAge);

        System.out.println("Comperator sort by age");
        Stream.of(comperatorEntityAge).limit(8).forEach(p -> System.out.println(p.toString()));
        System.out.println();

        // Person Sort by first name
        ComperatorEntityFirstName[] comperatorEntityFirstName = new ComperatorDataFirstName().creatPersons();
        new ComperatorBubbleSortFirstName(comperatorEntityFirstName);

        System.out.println("Comperator sort by first name");
        Stream.of(comperatorEntityFirstName).limit(8).forEach(p -> System.out.println(p.toString()));

    }
}
