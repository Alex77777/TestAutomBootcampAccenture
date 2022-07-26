package com.bootcampexercse.module3.activity;

public class MultiplicationTable {


    public static void main(String []args) {
        /*
            1 cycle => from 11 till 20
            2 cycle => from 0  till 9
        */

        for(int i = 11; i <=20; i++)
        {
            System.out.println("*** Table of " + i + " ***");

            for (int j = 0; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }






}
