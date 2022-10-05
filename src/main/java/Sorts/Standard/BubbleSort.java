package Sorts.Standard;

public class BubbleSort {

    public BubbleSort(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            for(int index = 1; index < numbers.length; index++) {
                if(numbers[index - 1]  > numbers[index] ) {
                    int swap = numbers[index - 1];
                    
                    numbers[index - 1] = numbers[index];
                    numbers[index] = swap;
                }
            }
        }
    }
}
