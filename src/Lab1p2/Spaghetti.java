import java.util.Scanner;
import java.text.DecimalFormat;

public class Spaghetti
{
    private static DecimalFormat df2 = new DecimalFormat("#.00");
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName, lastName;
        String deliveryType = "Special";
        String letterType = "Metrowide";

        int code;
        float deliveryFee = 30.50f;
        float letterFee = 0f;
        float totalFee = 0f;

        // Display Input
        System.out.print(" Last Name of Sender \t: ");
        lastName = scan.nextLine();
        System.out.print(" First Name of Sender \t: ");
        firstName = scan.nextLine();
        System.out.print(" Delivery Code \t\t: ");
        code = scan.nextInt();
        System.out.print(" Letter Fee \t\t: ");
        letterFee = scan.nextFloat();

        // divider
        System.out.println("\n -------------------------------------\n");

        // display Output
        System.out.println(" Sender Name \t: " + lastName + ", " + firstName);
        System.out.println(" Delivery Code \t: " + code);
        System.out.println(" Delivery Type \t: " + deliveryType);
        System.out.println(" Letter Type \t: " + letterType);
        System.out.println(" Letter Fee \t: " + df2.format(letterFee));
        System.out.println(" Delivery Fee \t: " + df2.format(deliveryFee));

        System.out.println(); //div
        
        totalFee = letterFee + deliveryFee;
        System.out.println(" Total Fee \t: " + df2.format(totalFee));

        scan.close();
    }
}
