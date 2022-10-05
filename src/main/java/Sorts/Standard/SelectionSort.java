package Sorts.Standard;

public class SelectionSort {
    public SelectionSort(int[] elements) {
        int length = elements.length;

        for (int i = 0; i < length - 1; i++) {
            int minPos = i;
            int min = elements[minPos];

            for (int j = i + 1; j < length; j++) {
                if (elements[j] < min) {
                    minPos = j;
                    min = elements[minPos];
                }
            }

            if (minPos != i) {
                elements[minPos] = elements[i];
                elements[i] = min;
            }
        }
    }
}
