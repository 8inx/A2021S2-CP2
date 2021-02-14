import java.util.Scanner;

public class PeachMangoPie
{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num1, num2, old_num;

        System.out.print(" Input first  number: ");
        num1 = scan.nextInt();
        System.out.print(" Input second number: ");
        num2 = scan.nextInt();

        // divider
        System.out.println("\n ------------------------\n");

        System.out.println(" --Before exchange--");
        System.out.println(" First  number: " + num1);
        System.out.println(" Second number: " + num2);

        old_num = num1;
        num1 = num2;
        num2 = old_num;

        System.out.println(" --After exchange--");
        System.out.println(" First  number: " + num1);
        System.out.println(" Second number: " + num2);

        scan.close();
    }
}
