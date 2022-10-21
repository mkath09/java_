package practicing_homework;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Programme6_AreaOfCircle {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);
        //closing the scanner object
        scanner.close();
        }
        public static void areaOfCircle(double radius){
        double pi = Math.PI;
        double area =(pi* radius * radius);
            System.out.println("The AreaOfCircle is :" + area);

        }

        }


