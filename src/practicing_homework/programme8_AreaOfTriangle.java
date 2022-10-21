package practicing_homework;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class programme8_AreaOfTriangle {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of triangle: ");
        int length = scanner.nextInt();
        System.out.println("please enter the height of triangle: ");
        int height = scanner.nextInt();
        areaOfTriangle(height,length);
        scanner.close();
    }
    //Calculating the area of triangle with no retun type with parameter method
    public static void areaOfTriangle(int length,int height){
        int area = (length*height)/2;
        System.out.println("The Area of a triangle is: "+ area);
    }
}
