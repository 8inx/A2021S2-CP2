/*###################################################################################|
|  Create a program that ask the user how many times the word “I LOVE JAVA           |
|  PROGRAMMING” should be printed/display on the screen. Number each line in         |
|  the output and add a message at the end of the loop that says how many times the  |
|  message was printed.                                                              |
|###################################################################################*/

import java.util.Scanner;

public class ILoveJavaProgramming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num =0;

        // get how many times to display
        System.out.print("Enter how many times would you like to display: ");
        num = input.nextInt();

        // div
        System.out.println("\n--------------------------------------------\n");

        // display the word 'I LOVE JAVA PROGRAMMING' with number each line
        for (int i = 1; i <= num; ++i) {
            System.out.println(i + " I LOVE JAVA PROGRAMMING");
        }
        // display how many times the message was printed
        System.out.println("Printed this message " + num + " times.");

        input.close();
    }
}
