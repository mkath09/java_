package practicing_homework;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Programme15_SwapTheValue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first variable value: ");
        int first = scanner.nextInt();
        System.out.println("Enter the second variable value: ");
        int second = scanner.nextInt();
        Programme15_SwapTheValue t = new Programme15_SwapTheValue();
        t.swapTheValue(first ,second);
        scanner.close();

    }
    //Swapping the value of variables
    public void swapTheValue(int a,int b){
        int c;
        System.out.println("Before the swapping,The value of first variable is: " +a +"and second variable is :"+b);

        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The values variable is: "+a+ "and second variable is: "+b);
    }
}
