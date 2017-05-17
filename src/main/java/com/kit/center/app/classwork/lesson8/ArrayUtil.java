package com.kit.center.app.classwork.lesson8;


public class ArrayUtil {
//    public int[][] createAndFill(int dimension, int length) {
//        int[][] intArray = new int[dimension][length];
//        for (int j = 0; j < intArray.length; j++) {
//            for (int k = 0; k < intArray[j].length; k++) {
//                intArray[j][k] = j * k;
//            }
//        }
//        return intArray;
//    }
//}

    public int[] createAndFilled(int length) {
        int[] intArray = new int[length];
        for (int j = 0; j < intArray.length; j++) {
            intArray[j] = j;
        }
        return intArray;
    }
}
