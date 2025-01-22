import java.util.*;
public class conditionalStatement {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Question 1 : Write a java program to get a number from the user and print whether it is positive or negative
            // int x = sc.nextInt();
            // if(x>0){
            //     System.out.println(x +" Is a positive number");
            // } else {
            //     System.out.println(x + " Is a negative number");
            // }

        // Question 2: Finish the following code so that it prints. You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
            double temp = 103.5;
            if (temp > 100) {
                System.out.println("You have a fever");
            } else {
                System.out.println("You don't have a fever");
            }

        // Question 3: Write a java program to input week number (1-7) and print day of week name using switch case
            // System.out.println("Enter a weak number (1-7) : ");
            // Byte day = sc.nextByte();
            // switch (day) {
            //     case 1 : System.out.println("Monday");
            //         break;
            //     case 2 : System.out.println("Tuesday");
            //         break;
            //     case 3 : System.out.println("Wednesday");
            //         break;
            //     case 4 : System.out.println("Thursday");
            //         break;
            //     case 5 : System.out.println("Friday");
            //         break;
            //     case 6 : System.out.println("Saturday");
            //         break;
            //     case 7 : System.out.println("Sunday");
            //         break;
            //     default: System.out.println("Invalid input ! Please enter week number between (1 - 7)");
            //         break;
            // }

        // Question 4: Write a java program that takes a year from the user and print whether that year is a leap or not.
            System.out.println("Input the year : ");
            int year = sc.nextInt();

            boolean x = (year % 4 ) == 0;
            boolean y = (year % 100) != 0;
            boolean z = ((year % 100 == 0) && (year % 400 == 0));

            if(x && (y || z)){
                System.out.println(year + " Is a leap year ");
            } else {
                System.out.println(year + " Is not a leap year");
            }

        sc.close();
    }
}