import java.util.Scanner;
import java.text.DecimalFormat;

public class DaleCutie 
{
    private static DecimalFormat df2 = new DecimalFormat("#.00");
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String firstName, lastName;
        String department = "IT";
        
        int deptCode, studentNum;
        int units = 24;
        
        float rate, tuitionFee, total;
        float regFee = 350.00f;
        float miscFee = 1800.20f;

        // display input
        System.out.print(" Last name of Student \t: ");
        lastName = scan.nextLine();
        System.out.print(" First name of Student \t: ");
        firstName = scan.nextLine();
        System.out.print(" Department Code \t: ");
        deptCode = scan.nextInt();
        System.out.print(" Student Number \t: ");
        studentNum = scan.nextInt();
        System.out.print(" Rate per Unit \t\t: ");
        rate = scan.nextFloat();

        // divider
        System.out.println("\n -------------------------------------\n");

        // display output
        System.out.println(" Student Name     : " + lastName + ", " + firstName);
        System.out.println(" Department Code  : " + deptCode);
        System.out.println(" Department       : " + department);
        System.out.println(" Student Number   : " + studentNum);
        System.out.println(" Number of units  : " + units);
        System.out.println(" Rate per Units   : " + df2.format(rate));

        System.out.println();//div
        tuitionFee = rate * units;
        total = tuitionFee + regFee + miscFee;
        System.out.println(" Total Payable    : " + df2.format(total));

        scan.close();
    }
}