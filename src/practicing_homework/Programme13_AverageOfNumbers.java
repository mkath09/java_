package practicing_homework;

import java.util.Scanner;
/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */
public class Programme13_AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double y = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double z = scanner.nextDouble();
        averageOfThreeNumbers(x, y, z);
        scanner.close();
    }
    public static void averageOfThreeNumbers(double a,double b,double c){
        double average = (a + b + c )/3;
        System.out.println("The average of"+a+"and"+c+"is :"+ average);

    }
}
