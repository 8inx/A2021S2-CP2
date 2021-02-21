/*#############################################################################|
|  Make a java program that will determine if the input positive number from   |
|  the user are two, three, four or five digits.                               |
|#############################################################################*/

import java.util.Scanner;

public class JustAnotherJava 
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num = 0;

        // request a number
        System.out.print(" Input digits: ");
        num = input.nextInt();

        // div
        System.out.println("\n-----------------------\n");

        // check num
        if (num>=10 && num <= 99){
            // print if num is 2 digit
            System.out.println(" It’s a two-digit number.");
        }else if (num>=100 && num<=999){
            // print if num is 3 digit
            System.out.println(" It’s a three-digit number.");
        }else if (num>=1000 && num<=9999){
            // print if num is 4 digit
            System.out.println(" It’s a four-digit number.");
        }else{
            // print if num is not between 1 and 5 digit
            System.out.println(" Number is not between one- and five-digit number.");
        }

        input.close();
    }
}
