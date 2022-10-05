package Sorts.Comparabel;

import Entities.Comparable.ComparableEntityFirstName;

public class ComparabelBubbleSortFirstName {
    public ComparabelBubbleSortFirstName(ComparableEntityFirstName[] persons) {

        for(int i = 0; i < persons.length -1; i++) {
            for(int index = 0; index < persons.length -1; index++) {
                if(persons[index].compareTo(persons[index + 1]) > 0) {

                    ComparableEntityFirstName swap = persons[index + 1];
                    persons[index + 1] = persons[index];
                    persons[index] = swap;
                }
            }
        }
    }
}
