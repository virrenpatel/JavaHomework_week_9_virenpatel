package java_homework_week9_virenpatel;

import java.util.ArrayList;
import java.util.List;

/* 5. Write a Java program to iterate through all elements in an array list using
Iterator.
 */
public class Programme5 {
    //Main method
    public static void main(String[] args) {
        // object creation to call instance in to static method
        Programme5 obj = new Programme5();
        obj.iterateElements();
    }

    public void iterateElements() {
        // Create a list and add some name to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("London");
        list_Strings.add("Manchester");
        list_Strings.add("Leeds");
        list_Strings.add("Scotland");
        list_Strings.add("Blackpool");
        // Print the list
        for (String element : list_Strings) {
            System.out.println(element);
        }
    }

}
