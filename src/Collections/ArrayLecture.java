package Collections;

import java.util.Arrays;

public class ArrayLecture {
    public static void main(String[] args) {
//        int[] intArray = new int[] {1, 2, 3};
//
//        System.out.println(Arrays.toString(intArray));
//        int[] intArray = new int[3];
//
//        System.out.println(Arrays.toString(intArray));
        int[] intArray = getIntArray();

        intArray = Arrays.stream(intArray).map(i -> i * 2).toArray();
        System.out.println(Arrays.toString(intArray));
    }

    public static int[] getIntArray() {
        return new int[]{1, 2, 3};
    }

    public static int[] getIntArray(int length) {
int[] intArray = new int[length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2;
        }
        return intArray;
    }
}
