package company;

public class SelectionSort {


    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIdx = findMinIndexFrom(array, i);
            swap(array, i, minIdx);
            if (array[i] < array[minIdx]) {
                swap(array, i, minIdx);
            }
        }
    }

    private static int findMinIndexFrom(int[] array, int from) {
        int minIdx = from;
        for (int i = from + 1; i < array.length; i++) {
            if (minIdx != i) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    private static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}




