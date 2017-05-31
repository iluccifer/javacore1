package com.kit.center.app.classwork.lesson11;


public class StringEncode {
    public static String stringEncode(String stringEncode) {
        String plainText = "01234";
        String cypherText = "qwert";
        StringBuilder stringBuilder = new StringBuilder(stringEncode);
        String encodedString = "";

        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < plainText.length(); j++) {
                if (stringBuilder.charAt(i) == plainText.charAt(j)) {
                    stringBuilder.setCharAt(i, cypherText.charAt(j));
                    break;
                }
            }
        }return stringBuilder.toString();
    }
}
