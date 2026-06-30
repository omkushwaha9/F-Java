package Conditions_Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Syntax of For Loops

        /*
        *- for ( initialization; condition; increment/Decrement){
        *- // body
        *- }
        * */
        // Q= print from 1 to 5
        /*
        for (int num= 1; num <= 9; num+= 1){
            System.out.println(num);
        } */
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        // num += 2 means 1+2=3 3+2=5 5+2=7   number = number + 2 = (num+= 2)
//        for (int num = 1; num <= n; num++) {
            // System.out.print(num + " ");
//            System.out.println("Hello World"); // to print Hello World (n numbers of time)
//        }

        // While Loop

        /*
           Syntax :
             while (Condition){
                   // body
             }
        */
        //  for (int num= 1; num <= 9; num+= 1){
        //      System.out.println(num);
//        int num = 1;
//        while (num <= 10 ){
//            System.out.println(num);
//            num += 1;
//            }

        // do While
        /*
        Syntax:
        do{
        // body
        } while (condition);
         */
        int num = 1;
        do {
            System.out.println("Hello World!");
        } while(num != 1);
    }
}
