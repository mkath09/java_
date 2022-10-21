package practicing_homework;
/* Write a Java Program to print as below.
"+------------------------+"
"| |"
"| CORNER STORE |"
"| |"
"| 2015-03-29 04:38PM |"
"| |"
"| Gallons: 10.870 |"
"| Price/gallon: $ 2.089 |"
"| |"
"| Fuel total: $ 22.71 |"
"| |"
"+------------------------+"
 */
public class Programme20_PrintReceipt {
    public static void main(String[] args) {
    printReceipt();
    }
    //Method print receipt
    public static void printReceipt(){
        System.out.println("\"+-------------------------+\"");
        System.out.println("\"+                         +\"");
        System.out.println("\"+     CORNER  STORE       +\"");
        System.out.println("\"+                         +\"");
        System.out.println("\"+    2015-0329  04:38     +\"");
        System.out.println("\"+                         +\"");
        System.out.println("\"+ Gallon :      10.870    +\"");
        System.out.println("\"+ Price/gallon: $ 2.089   +\"");
        System.out.println("\"+                         +\"");
        System.out.println("\"+ Fuel total:   $ 22.71   +\"");
        System.out.println("\"+                         +\"");
        System.out.println("\"+-------------------------+\"");
    }
}
