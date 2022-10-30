package java_homework_week9_virenpatel;

import java.util.Scanner;

/* 10. Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.
 */
public class Programme10 {
    public static void main(String[] args) {
        Programme10 obj = new Programme10();
        obj.oxfordCircus();
    }
    public  void oxfordCircus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Line Name ");
        String input = scanner.next();
        switch (input) {
            case "Bakerloo":
            case "bakerloo":
            case "Victoria":
            case "victoria":
            case "Central":
            case "central":
                System.out.println(" Line Pass Through Oxford Circus");
                break;

            default:
                System.out.println("Line not passing from Oxford Circus");
                scanner.close();
        }
    }
}



