package com.kit.center.runners.enumerations;


import com.kit.center.app.classwork.enumerations.Season;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonRunner {

    public static void main(String args[]) {

        Season season = Season.SPRING;

        if (season == Season.SPRING) {
            season = Season.SUMMER;
        }
        System.out.println(season.name());
        System.out.println(Season.AUTUMN.name());
        Season season1 = Season.valueOf("SPRING");
        System.out.println(
                Arrays.toString(Season.values()));


        System.out.print("Input one of the season: ");
        try {
            Scanner sc = new Scanner(System.in);
            Season seasonChoice = Season.valueOf(sc.nextLine().toUpperCase());
            switch (seasonChoice) {
                case SPRING:
                    System.out.println("Correct: " + Season.SPRING.name());
                    break;
                case SUMMER:
                    System.out.println("Correct: " + Season.SUMMER.name());
                    break;
                case AUTUMN:
                    System.out.println("Correct: " + Season.AUTUMN.name());
                    break;
                case WINTER:
                    System.out.println("Correct: " + Season.WINTER.name());
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("something what you inputting is wrong");
        }
    }
}

