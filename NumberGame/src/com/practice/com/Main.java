package com.practice.com;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int randomNumber = (int)(Math.random()*100)+1;
        //System.out.println(randomNumber);
        boolean hasWon = false;

        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");
        Scanner scanner = new Scanner(System.in);

        for(int i = 10; i > 0; i--){
            System.out.println("You have " + i + " guesses left");
            int guessNo = scanner.nextInt();
            if(guessNo > randomNumber) {
                System.out.println("Your guess is greater than random number");
            }else if(guessNo < randomNumber){
                    System.out.println("Your guess is less than random number");
                }else{
                    hasWon = true;
                    break;
                }
            }

        if(hasWon){
            System.out.println("Correct...You Won!!");
        }else{
            System.out.println("Game Over..You lose!!");
            System.out.println("The number was " +randomNumber+".");
        }
    }
}

