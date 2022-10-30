package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String again;
        Boolean yorn = true;
        Scanner scanner = new Scanner(System.in);
        while (yorn) {

            System.out.println("Please Enter First Number: ");
            int a = scanner.nextInt();
            System.out.println("Please Enter Second Number: ");
            int b = scanner.nextInt();
            System.out.println("Please Enter one of the Symbol +,-,*,/ ");
            char symbol = scanner.next().charAt(0);
            Calculator obj = new Calculator();
            obj.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation please enter 'Y' or 'N'");
            again = scanner.nextLine();
            again = scanner.nextLine();
            if (again.equalsIgnoreCase("Y")) {
                yorn = true;
            }
            if (again.equalsIgnoreCase("N")) {
                //yorn = false;
                System.out.println("Thank you for using My Calculator");
                System.exit(0);
            }
        }
    }
}








