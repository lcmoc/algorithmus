package Sorts.Comperator;

import Entities.Comperator.ComperatorEntityFirstName;

public class ComperatorBubbleSortFirstName {
    public ComperatorBubbleSortFirstName(ComperatorEntityFirstName[] persons) {

        for(int i = 0; i < persons.length -1; i++) {
            for(int index = 0; index < persons.length -1; index++) {
                if(persons[index].compare(persons[index], persons[index + 1]) > 0) {

                    ComperatorEntityFirstName swap = persons[index + 1];
                    persons[index + 1] = persons[index];
                    persons[index] = swap;
                }
            }
        }
    }

}
