package Number;

import java.util.Scanner;

public class Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number:");

        int num1 = scanner.nextInt();
        System.out.println("enter the second number:");
        int num2 = scanner.nextInt();
         int larger =(num1>num2) ? num1:num2;
       /* if(num1>num2){
            System.out.println("number one is bigger");
        }
        else if(num1==num2){
            System.out.println("Both number is equal");
        }
        else {
            System.out.println("Number second is bigger");
        }
        */
        System.out.println("Between two numbers larger number is  "+larger);

    }
}
