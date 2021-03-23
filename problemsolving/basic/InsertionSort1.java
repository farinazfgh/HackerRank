package problemsolving.basic;

public class InsertionSort1 {
    static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    static void insertionSortfromLeft(int[] array) {
        if (array.length == 0) return;
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    static void insertionSortfromRight(int[] array) {
        //  {1, 4, 3, 5, 6, 2}; 5 4 3 2 1
        // j =4 j=3
        if (array.length == 0) return;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = i - 1; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }

    // Complete the insertionSort1 function below.
    static void insertionSort(int n, int[] array) {
        int i = array.length - 2;
        int j = i + 1;

        while (j >= 0) {
            if (array[i] > array[j]) swap(array, i, j);
            printArray(array);
            j--;
        }
    }

    static void insertionSort1(int n, int[] array) {
        int inserted = array[array.length - 1];
        int j = array.length - 1;
        while (j > 0 && array[j - 1] > inserted) {
            array[j] = array[j - 1];
            printArray(array);
            j--;
        }
        array[j] = inserted;
        printArray(array);
    }


    static void insertionSort3(int n, int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = i - 1; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    printArray(array);

                }
            }
        }
    }

    static void printArray(int[] array) {
        for (int value : array) System.out.print(value + " ");
        System.out.println();
    }

    public static void insertionSort2(int n, int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int value = array[i];
            while (j >= 1 && array[j - 1] > value) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = value;
            printArray(array);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 5, 6, 2};
        insertionSortfromLeft(array);
        printArray(array);
        insertionSortfromRight(array);
        printArray(array);
    }
}
