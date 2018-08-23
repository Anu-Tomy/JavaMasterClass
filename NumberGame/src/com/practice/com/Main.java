package com.practice.com;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");

        int randomNumber = (int)(Math.random()*100);
        System.out.println(randomNumber);

    }
}
