package java_homework_week9_virenpatel;

import java.util.ArrayList;

/* 4. Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
 */
public class Programme4 {
    //Main method
    public static void main(String [] args){
    //object creation to call instance method in to static method
        Programme4 obj = new Programme4();
        obj.newArrayList();
    }
    //Instance method
    public void newArrayList(){
    // Creating an array list
    ArrayList<String> colours = new ArrayList<>();
    colours.add("Pink");
    colours.add("Red");
    colours.add("Green");
    colours.add("Yellow");
    colours.add("Blue");
    colours.add("Purple");
    System.out.println("ArrayList: " + colours);
    // Using forEach loop
    System.out.println("Iterating over ArrayList using for-each loop:");
    for(String language : colours) {
        System.out.print(language);
        System.out.print(", ");
    }
}

}
