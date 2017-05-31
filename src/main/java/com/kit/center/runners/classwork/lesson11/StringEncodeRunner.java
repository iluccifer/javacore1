package com.kit.center.runners.classwork.lesson11;
import static com.kit.center.app.classwork.lesson11.StringEncode.stringEncode;

public class StringEncodeRunner {
    public static void main(String[] args) {
        String word = "2235";
        String encoded = stringEncode(word);
        System.out.println(encoded);
    }
}
