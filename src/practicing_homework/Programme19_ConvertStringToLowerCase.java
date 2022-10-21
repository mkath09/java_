package practicing_homework;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence: ");
        String uppercase =scanner.nextLine();
        Programme19_ConvertStringToLowerCase t =new Programme19_ConvertStringToLowerCase();
        t.convertToLowerCase(uppercase);
        //closing the scanner object
        scanner.close();
    }
    //convert string to the lower case
    public void convertToLowerCase(String str){
        System.out.println("The Lowercase of the string is = " +str.toLowerCase());
    }
}
