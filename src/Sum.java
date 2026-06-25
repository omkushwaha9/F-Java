import java.net.SocketOption;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        // Type Casting
        int num = (int) (67.89);
        System.out.println(num);
        // Sum
        System.out.print("Enter num1 Value : ");
        int num1 = input.nextInt();
        System.out.print("Enter num2 Value : ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is : "+ sum);



    }
}
