package com.bootcampexercse.module3.activity;

public class PrintNumWithWhile {

    public static void main(String[] args) {

        // Print all even numbers less than 100
        int i = 0;
        while (i < 100) {

            // 10 / 5 = 2
            // 10 % 5 = 0

            // 10 / 3 = 3
            // 10 % 3 = 1

            // i = i + 2;  // i += 2;

            i++;

            if(i % 2 != 0){
                System.out.println(i);
            }


        }

        //TODO: write code to Print all odd numbers less than 100
    }




}
