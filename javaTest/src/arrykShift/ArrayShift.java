package arrykShift;

import java.util.Arrays;

public class ArrayShift {

    public void arrayShift(int[] array, int k) {

        if (array == null || array.length == 0) {
            return;
        }

        k = k % array.length;

        if (0 > k) {
            return;
        }

        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }

        for (int i = 0; i < k / 2; i++) {
            array[i] = array[k - 1 -i] + array[i];
            array[k - 1 - i] = array[i] - array[k - 1 - i];
            array[i] = array[i] - array[k - 1- i];
        }

        for (int i = 0; i < k / 2; i++) {
            int tmp = array[i];
            array[i] = array[k - 1 - i];
            array[k - 1- i] = tmp;
        }

        for (int i = k; i < k + (array.length - k) / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i + k];
            array[array.length - 1 - i + k] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        ArrayShift shift = new ArrayShift();
        shift.arrayShift(array, 1);
        Arrays.stream(array).forEach(o -> {
            System.out.println(o);
        });
    }
}