/*######################################################################################|
|  The input to the program includes the current monthly salary for the employee and    |
|  Create a program that will determine the raise and new salary of an employee.        |
|  a number indicating the performance rating (1 = excellent, 2 = good, 3 = poor). An   |
|  employee with a rating of 1 will receive a 6% raise, an employee with a rating of 2  |
|  will receive a 4% raise, and one with a rating of 3 will receive a 1.5% raise.       |
|######################################################################################*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class EmployeeSalary {
    private static DecimalFormat df2 = new DecimalFormat("#,###.00");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fullName;
        int number, rating;
        double curSalary, newSalary, amtRaise = 0;

        // get full name
        System.out.print(" Employee Full Name: ");
        fullName = input.nextLine();
        // get number
        System.out.print(" Employee Number: ");
        number = input.nextInt();
        // get monthly salary
        System.out.print(" Enter the current monthly Salary: ");
        curSalary = input.nextFloat();
        // get performance rating
        System.out.print(" Enter the performance rating: ");
        rating = input.nextInt();

        // div
        System.out.println("\n--------------------------------------------\n");

        // compute for amount raise based on performace rating
        if (rating == 1) {
            // 6% raise if pr is equal to 1(excellent)
            amtRaise = curSalary * 0.06;
        }else if( rating == 2){
            // 4% raise if pr is equal to 2(good)
            amtRaise = curSalary * 0.04;
        }else if( rating == 3){
            // 1.5% raise if pr is equal to 3(poor)
            amtRaise = curSalary * 0.015;
        }else{
            // error: pr is int from 1 to 3
            System.out.println("\n Error: Performance rating should be integers from 1 to 3");
            System.exit(0);
        }

        // display number
        System.out.println(" Employee Number: " + number);
        // display full name
        System.out.println(" Employee Full Name: " + fullName);
        // display amount raise
        System.out.println(" Amount of your raise: " + df2.format(amtRaise));
        // compute new salary
        newSalary = curSalary + amtRaise;
        // display new salary
        System.out.println(" Your new monthly salary: " + df2.format(newSalary));

        input.close();
    }
}
