package problemsolving.basic;

public class CircularArrayRotation {
    // O(n^2)
    // Function to right-rotate an array by one position
    public static void rightRotateByOne(int[] array) {
        int last = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        //System.arraycopy(array, 0, array, 1, array.length - 2 + 1);

        array[0] = last;
    }

    // Function to right-rotate an array by `k` positions
    public static void rightRotateByK(int[] array, int k) {
        for (int i = 0; i < k; i++) {
            rightRotateByOne(array);
        }
    }

    //===============================================================
    // Function to right-rotate an array by `k` positions
    //O(n)
    public static void rightRotate(int[] array, int k) {
        int n = array.length;

        // construct an auxiliary array of size `k` and
        // fill it with the last `k` elements of the input array
        int[] aux = new int[k];
        for (int i = 0; i < k; i++) {
            aux[i] = array[n - k + i];
        }

        // shift the first `n-k` elements of the input array at the end
        for (int i = n - k - 1; i >= 0; i--) {
            array[i + k] = array[i];
        }

        // put the elements of the auxiliary array at their
        // correct positions in the input array
        for (int i = 0; i < k; i++) {
            array[i] = aux[i];
        }
    }

    //================================================================
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        int[] arr = new int[a.length];

        for (int i = 0; i < a.length; i++)
            arr[(i + k) % a.length] = a[i];

        for (int i = 0; i < queries.length; i++)
            queries[i] = arr[queries[i]];

        return queries;

    }

    //==========================================================
    public static void swap(int[] array, int i, int j) {
        int data = array[i];
        array[i] = array[j];
        array[j] = data;
    }

    // Function to reverse a given subarray
    public static void reverse(int[] array, int low, int high) {
        for (int i = low, j = high; i < j; i++, j--) {
            swap(array, i, j);
        }
    }

    // Function to right-rotate an array by `k` positions
    public static void rightRotate(int[] array, int k, int n) {
        // Reverse the last `k` elements
        reverse(array, n - k, n - 1);

        // Reverse the first `n-k` elements
        reverse(array, 0, n - k - 1);

        // Reverse the whole array
        reverse(array, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        rightRotate(array, 3, array.length);

    }
}
