package Days;
import java.util.Scanner;
public class Days {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day:");
        int day =scanner.nextInt();
        if (day < 1 || day > 7) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else {
            // Call the getDayOfWeek method to get the corresponding day
            String dayOfWeek = getDayOfWeek(day);

            // Print the result
            System.out.println("The corresponding day of the week is: " + dayOfWeek);
        }
        scanner.close();


    }

    private static String getDayOfWeek(int day){
        String dayWeek;
        switch (day){
            case 1 :
                dayWeek = "sunday";
                break;
            case  2 :
                dayWeek = "monday";
                break;
            case  3 :
                dayWeek = "tuesday";
                break;
            case  4 :
                dayWeek = "wednesday";
                break;
            case 5 :
                dayWeek = "thursday";
                break;
            case 6 :
                dayWeek = "friday";
                break;
            case 7 :
                dayWeek = "saturday";
            default:
                dayWeek =  "Invalid Day";

        }
        return dayWeek;
    }
}
