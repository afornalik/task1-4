import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        int[] array = new int[]{4, -1, 11, 4, 22, -6, -2, -17, 4, 5, 12, 4, 22, -6, -2, -17, -5 - 6, -2, -17, 4, 22, -6, -1, 11, 4, 22, -6, -2, -17, 4, 5, 12, 4, 22, -6, -2, -17, -5 - 6, -2, -17, -2, -17, 4, 5, 4, 5, 12, -5 - 6, 4, 22, -6, -2, -17, 4, 5, -2, -17, 4, 5, 12, -5 - 6, -2, -17, 4, 5, 12, -5};

        //My algorithm has a computational complexity equal to O(n^2) because there are two loops
        //17:24	Compilation completed successfully in 967 ms

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (k < array.length - 1) {
                    if (array[k] > array[k + 1]) {
                        int temp = array[k];
                        array[k] = array[k + 1];
                        array[k + 1] = temp;
                    }
                }
            }
        }
        // Arrays.stream(array).forEach(System.out::println);

        //Arrays sort algorithm
        //17:25	Compilation completed successfully in 921 ms
        Arrays.sort(array);
    }
}
