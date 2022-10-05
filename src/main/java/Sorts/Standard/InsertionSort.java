package Sorts.Standard;

public class InsertionSort {
    public InsertionSort(int elements[]) {
        for (int i = 1; i < elements.length; i++) {
            int currentElement = elements[i];
            int k;
            for (k = i - 1; k >= 0 && elements[k] > currentElement; k--) {
                elements[k + 1] = elements[k];
            }
            elements[k + 1] = currentElement;
        }
    }
}
