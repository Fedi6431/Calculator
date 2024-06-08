import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double First_Number;
        double Second_Number;
        String Operator;
        //String plus = "+";
        //String minus = "-";
        //String molt = "*";
        //String div = "/";
        String User_input;
        String Exit_input;

        User_input = "Start Calculator";

        //made by Fedi6431
        while (User_input != null) {

            //Input
            System.out.println("Want exit? Y/Any key");

            Exit_input = scanner.nextLine();
            if (Exit_input.equals("Y"))  {
                System.exit(0);
            }
            else if (Exit_input.equals("y"))  {
                System.exit(0);
            }

            for (int i = 0; i < 150; ++i) System.out.println();

            System.out.print("Enter a number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please type a integer number");
                scanner.next();
                System.out.print("Enter a number: ");
            }
            First_Number = scanner.nextInt();

            System.out.print("Enter an operator: ");
            Operator = scanner.next();

            System.out.print("Enter a number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please type a integer number");
                scanner.next();
                System.out.print("Enter a number: ");

            }
            Second_Number = scanner.nextInt();

            if (Operator.equals("+")) {
                double result = First_Number + Second_Number;
                System.out.println("The addition of " + First_Number + " and " + Second_Number + " is " + result);
            } else if (Operator.equals("-")) {
                double result = First_Number - Second_Number;
                System.out.println("The subtraction of " + First_Number + " and " + Second_Number + " is " + result);

            } else if (Operator.equals("*")) {
                double result = First_Number * Second_Number;
                System.out.println("The multiplication of " + First_Number + " and " + Second_Number + " is " + result);
            } else if (Operator.equals("/")) {
                if (Second_Number != 0) {
                    double result = First_Number / Second_Number;
                    System.out.println("The division of " + First_Number + " and " + Second_Number + " is " + result);
                } else {
                    System.out.println("Integer Error Type: Can't divide by zero");
                }
            }

            //made by Fedi6431
            Exit_input = scanner.nextLine();
            if (Exit_input.equals("Y")) {
                System.exit(0);
            }

        }


    }
}