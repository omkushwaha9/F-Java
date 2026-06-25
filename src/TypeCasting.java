import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Type Casting
//        int num = (int) (67.89f);
//        System.out.println(num);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;

//        System.out.println(d);

//        byte b = 50;
//      b = b * 2;

//        int number = 'A' ;
//        System.out.print(number);

        // compiler always gives you the output in higher value as the decimal(float) is bigger then integer
//        System.out.println( 3 * 4.7);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) -  (d * s);
        // float + int - double = double
        System.out.println((f * b) +" "+ (i / c) + " " +  (d * s));
        System.out.println(result);
    }
}
