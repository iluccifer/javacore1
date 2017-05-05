package com.kit.center.app.utils.convertors;

/**
 * Created by Лена on 05.05.2017.
 */
public class PrimitiveConvertor {
    float float1 = 5.4f;
    char char1 = 43;
    int int1 = 30;

    public void convertor() {
        float1 = (float) char1;
        System.out.println(float1);
        System.out.println(float1 = (float) char1);
        System.out.println(int1 = (int) char1);
        System.out.println(char1 = (char) int1);
        /*System.out.println(10 + char1 + 30 + int1);
         */
    }
}
