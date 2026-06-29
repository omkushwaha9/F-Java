package Conditions_Loops;

public class Conditionals {
    public static void main(String[] args) {
        int salary = 24000;

        if (salary > 50000) {
            salary = salary + 3000;
        } else {
            salary =  salary + 1000;
        }

     // Multiple if else conditions
     /*   if (salary > 10000) {
            salary += 2000; // salary = salary + 2000
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }*/
        System.out.println(salary);
    }
}
