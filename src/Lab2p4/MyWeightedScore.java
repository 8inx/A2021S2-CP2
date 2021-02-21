/*##########################################|
| Write a program that computes the         |
| appropriate weighted score for one test.  |
|##########################################*/

import java.util.Scanner;

public class MyWeightedScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testNum = 0;
        float score = 0f;
        float weightedScore = 0f;

        // input test number
        System.out.print(" Test number: ");
        testNum = input.nextInt();
        // input score
        System.out.print(" Score: ");
        score = input.nextFloat();

        // div
        System.out.println("\n----------------------------\n");

        // get weighted score based on test number
        switch (testNum) {
            case 1: 
                // test 1 is weighted 10%
                weightedScore = score * 0.1f;
                break;
            case 2:
                // test 2 is weighted 20%
                weightedScore = score * 0.2f;
                break;
            case 3:
                // test 3 is weighted 30%
                weightedScore = score * 0.2f;
                break;
            case 4:
                // test 4 is weighted 15%
                weightedScore = score * 0.15f;
                break;
            case 5:
                // test 5 is weighted 15%
                weightedScore = score * 0.15f;
                break;
            case 6:
                // test 6 is weighted 20%
                weightedScore = score * 0.2f;
                break;
            default:
                // print error
                System.out.println(" ERROR: The possible test number is an integer from 1 to 6.");
                // terminate
                System.exit(0);
                break;
        }
        // display score, test number and the computed weighted score
        System.out.printf(
            " A score of " + score +" on test " + testNum + 
            " gives a weighted score of %.1f"
            , weightedScore );

        input.close();
    }
}
