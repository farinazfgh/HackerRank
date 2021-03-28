package problemsolving.basic;

public class QuickPartition {
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static int[] quickSort(int[] array) {
        int pivot = array[0];
        int i = 1;
        int j = array.length - 1;
        //4 5 3 7 2
        //4 2 3 7 5
        //3 2 4 7 5
        while (true) {
            while (array[i] < pivot) {
                i++;
                if (i == array.length - 1) break;
            }
            while (array[j] > pivot) {
                j--;
                if (j == 0) break;
            }
            if (i >= j) break;
            swap(array, i, j);

        }
        swap(array, 0, j);
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 7, 2};
        quickSort(arr);
    }
}
