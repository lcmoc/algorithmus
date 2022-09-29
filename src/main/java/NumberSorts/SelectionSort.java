package NumberSorts;

public class SelectionSort {
    public SelectionSort(int[] elements) {
        int length = elements.length;

        for (int i = 0; i < length - 1; i++) {
            // Search the smallest element in the remaining array
            // beispiel mit 5 = index 0 und 3 = index 1

            int minPos = i; // 0
            int min = elements[minPos]; //  index 0 = 5

            for (int j = i + 1; j < length; j++) { // j = i + 1 = 3
                // j = 1
                if (elements[j] < min) { // 3 < 5
                    minPos = j; // 0 = 1
                    min = elements[minPos]; // 5 = 3
                }
            }

            // Swap min with element at pos i
            if (minPos != i) { // 3 != 0
                elements[minPos] = elements[i]; // 3 = index 0
                elements[i] = min; // index 0 = 3
            }
        }
    }
}
