package java_homework_week9_virenpatel;

import java.util.Arrays;

/* 3. Write a Java program to reverse an array of integer values.
 */
public class Programme3 {
    public static void main(String[] args) {
    Programme3 obj = new Programme3();
    obj.reverseArray();
    }
    public void reverseArray(){
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        System.out.println("Original array : "+ Arrays.toString(my_array1));
        for(int i = 0; i < my_array1.length / 2; i++)
        {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(my_array1));
    }
    }

