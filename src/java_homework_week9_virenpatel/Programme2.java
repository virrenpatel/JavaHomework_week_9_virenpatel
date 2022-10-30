package java_homework_week9_virenpatel;

import java.util.Scanner;

public class Programme2 {
    public static void main(String []args){
        Programme2 obj = new Programme2();
        obj.markSheet();
    }
    public void markSheet(){
        Scanner scanner = new Scanner(System.in);
        int maths,science,english,total;
        double percentage;
        String result = null;
        String grade = null;

        System.out.println("Enter Name        :");
        String name = scanner.nextLine();

        System.out.println("Enter Roll no        :");
        String rollnum = scanner.nextLine();

        System.out.println("Maths        :");
        maths = scanner.nextInt();

        System.out.println("Science        :");
        science = scanner.nextInt();

        System.out.println("English        :");
        english = scanner.nextInt();

        total = maths+science+english;
        int avg = total/3;
        System.out.println("Your marks are :" + total);
        System.out.println("Your Percentage is :" +avg);
        if (avg>=80){
            grade = "A+";
            System.out.println("Grade is:" +grade);
        }else if (avg>=60){
            grade = "A";
            System.out.println("Grade is:" +grade);
        }else if (avg>=50) {
            grade = "B";

            System.out.println("Grade is:" + grade);
        }else if (avg>=35) {
            grade = "C";
            System.out.println("Grade is:" + grade);
        }else if (avg>=35) {
            result = "Pass";
        }else {
            result = "Fail";
        }
        System.out.println("Result is  :  "+result);
        System.out.println("------------------------------------------------");
        System.out.println("|                                              |");
        System.out.println("|                   Mark Sheet                 |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|    Name           :      "+name+        "    |");
        System.out.println("|    Roll no        :      "+rollnum+"         |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|    Subjects       :                          |");
        System.out.println("|    Maths          :      "+maths+"           |");
        System.out.println("|    Science        :      "+science+"         |");
        System.out.println("|    English        :      "+english+"         |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|    Total          :      "+total+"           |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|    Percentage     :      "+avg+"             |");
        System.out.println("|    Result         :      "+result+"          |");
        System.out.println("|    Grade          :      "+grade+"           |");
        System.out.println("|----------------------------------------------|");
        scanner.close();
    }
}
