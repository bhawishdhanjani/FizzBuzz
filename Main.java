package FizzBuzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number :");
        int number = scanner.nextInt();
        boolean isDivByFive = number%5==0;
        boolean isDivByThree = number%3==0;

        if(isDivByFive && isDivByThree)
            System.out.println("FizzBuzz");
        else if(isDivByThree)
             System.out.println("Buzz");
         else if(isDivByFive)
             System.out.println("Fizz");
         else
             System.out.println(number);

    }
}
