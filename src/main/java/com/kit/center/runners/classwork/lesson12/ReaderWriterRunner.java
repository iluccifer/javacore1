package com.kit.center.runners.classwork.lesson12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderWriterRunner {

    public static void main(String[] args) throws IOException {
//    string line;
//    BufferedReader bufferedReader =null;
//
//        try {
//            bufferedReader = new BufferedReader(new FileReader ("D:\\Auto_Testing_Project\\javacore\\src\\main\\resources\\input.txt");
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//        while ((line = bufferedReader.readLine()) != null){
//            System.out.println(line);
//        }
//    bufferedReader.close();
//    }
//}


        try {

            BufferedReader reader = new BufferedReader(
                    new FileReader("D:\\Auto_Testing_Project\\\\javacore\\\\src\\\\main\\\\resources\\\\input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you will see this text");
        }
    }
}
