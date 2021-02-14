
import java.text.DecimalFormat;

public class Employee
{
    private static DecimalFormat df2 = new DecimalFormat("#.00");
    public static void main(String[] args) {

        int id = 14344;

        String name = "Jaevier Villanueva";
        String department = "CEAT-IT";
        String status = "Regular";
        
        int days = 22;
        double dailyRate = 200.59;
        double grossPay = 0;
        
        double tax = 270.0;
        double sss = 120.0;
        double cashAdv = 500.0;
        double netPay = 0;

        // print employee
        System.out.println(" Employee Name \t\t: " + name);
        System.out.println(" Employee Number \t: " + id);
        System.out.println(" Employment Status\t: " + status);
        System.out.println(" Department \t\t: " + department);

        System.out.println(); // div
        
        // print and compute for grosspay
        System.out.println(" Days Worked \t: " + days + " days");
        System.out.println(" Daily Rate \t: " + dailyRate);
        grossPay = days * dailyRate;
        System.out.println(" Gross Pay \t: " + df2.format(grossPay));

        System.out.println(); // div

        // print and compute for net pay
        System.out.println(" Less Tax  : " + df2.format(tax));
        System.out.println(" SSS       : " + df2.format(sss));
        System.out.println(" CA        : " + df2.format(cashAdv));
        netPay = grossPay - (tax + sss + cashAdv);
        System.out.println(" Net Pay   : " + df2.format(netPay));



    }
}
