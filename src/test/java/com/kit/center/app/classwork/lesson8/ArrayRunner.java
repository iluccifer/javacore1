package com.kit.center.app.classwork.lesson8;

import com.kit.center.app.classwork.lesson5.Car;
import com.kit.center.app.classwork.lesson8.ArrayUtil;

import java.util.Arrays;


public class ArrayRunner {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] intArray = arrayUtil.createAndFilled(2);
        System.out.println(Arrays.deepToString(new int[][]{intArray}));
        {
            for (int item: intArray) {
                System.out.println(item);
            }
        }
    }
}


//        int[][] myltiDimenEmpty = new int[2][];
//        myltiDimenEmpty[0] = new int[3];
//        myltiDimenEmpty[1] = new int[4];
//
//        int[][] myltiDimenFull = new int[2][];
//        myltiDimenFull[0] = new int[]{3, 4, 5};
//        myltiDimenFull[1] = new int[]{3, 4, 5, 5};
//
//        ArrayUtil arrayUtil = new ArrayUtil();
//        int[][] intArray = arrayUtil.createAndFill(2, 3);
//        System.out.println(Arrays.deepToString(intArray));
//        {
//            for (int [] item: intArray) {
//                System.out.println(item);
//            }
//        }
//    }
//}







        //        int[][] intArrInitial = new int[4][4];
//        intArrInitial[0][0] = 1;
//        intArrInitial[0][1] = 2;
//        intArrInitial[1][0] = 3;
//        intArrInitial[1][1] = 4;
//        for (int[] item : intArrInitial) {
//            System.out.println(item);
//        }
//    }
//}




//        long[] whideScreen = {3, 4, 5, 6};

//        for (int i = 0; i < whideScreen.length; i++) {
//            System.out.println(whideScreen[i] * i);
//
//        }
//        for (long item: whideScreen) {
//            System.out.println(item);
//
//        }
//        Flat[] adress = new Flat[2];
//        Flat flat1 = new Flat();
//        flat1.adress = "granit";
//        Flat flat2 = new Flat();
//        flat2.adress = "neGranit";
//        adress[0] = flat1;
//        adress[1] = flat2;
//        for (Flat flat : adress) {
//            System.out.println(flat.adress);
//        }
//    }
//}

//        int [] intArr = {3, 4, 5, 6};
//        int [] intArrInitial = new int [4];
//        intArrInitial [0] = 3;
//        intArrInitial [1] = 4;
//        intArrInitial [2] = 5;
//        intArrInitial [3] = 6;
//        intArrInitial [0] = 44;
//        System.out.println(intArrInitial [0]);
//
//        for (int item: intArr){
//            System.out.println(item);
//        }
//
//        for (int i = 0; i < intArr.length; i++){
//            System.out.println(intArr [i]);
//        }
//
//        Car[] carArr = new Car[2];
//        Car bmw = new Car();
//        bmw.name = "BMW";
//        Car audi = new Car();
//        audi.name = "audi";
//        carArr [0] = bmw;
//        carArr [1] = audi;
//        for (Car car : carArr){
//            System.out.println(car.name);
//
//        }
