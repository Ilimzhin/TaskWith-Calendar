package org.example.first;

import java.io.*;

public class TaskOne {

    public static void main(String[] args) {

        int money = 120;

            int a = (int) (Math.random() * (30) + 1);
            int b = (int) (Math.random() * (30) + 1);

        System.out.println("we begin with " + money + " money");
        System.out.println("A company dividend " + a);
        System.out.println("B company dividend " + b);

        if (a <= b) {
            int amountOperationA = (money / a);
            System.out.println("amount of purchased item " + amountOperationA); // purchased = купленных, приобретенных
            double restOfTheA = (money % a);
            System.out.println("rest of the after money operation = " + restOfTheA);
        } else {
            int amountOperationB = (money / b);
            System.out.println("amount of purchased item " + amountOperationB);
            double restOfTheB = (money % b);
            System.out.println("rest of the after money operation = " + restOfTheB);
        }

//        for (int j = 0; j < 2; j++) {
//
//            int a = (int) (Math.random() * (30) + 1);
//            System.out.println(a);
//
//        }

//        int a = (int) (Math.random() * (200 + 1)) - 100; // 200 = это количество чисел а -100 от какого числа идет отсчет
//        System.out.println(a);

    }

}
