import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some input : ");
        int rollno = input.nextInt();
        System.out.println("Your rollno is : "+ rollno);
        System.out.print("Enter your Marks : ");
        float marks = input.nextFloat();
        System.out.println("Your Marks is : "+ marks);
    }
}
