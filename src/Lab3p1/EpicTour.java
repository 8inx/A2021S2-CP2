import java.util.Scanner;

public class EpicTour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String touristName="";
        int hotelCode, guideCode, numTourDays;
        double totalFee;

        // index 0 is not used, it is to make array indexing simple
        String[] hotelNames = { "",
                "Insugar Hotel",
                "Butong Hotel",
                "Apo New Hotel"
        };
        String[] guideNames = { "",
                "Jane Bond",
                "Sylvie Rambo",
                "Diega Silang",
                "Sabel Lopes"
        };
        Double[] ratesPerDay = { 0.0,
            1106.00,
            930.90,
            920.30,
            1107.00
        };
        
        // get tourist name, hotel code, guide code and number of tour days
        System.out.print("Tourist Name    : ");
        touristName = input.nextLine();
        System.out.print("Hotel Code(1-3) : ");
        hotelCode = input.nextInt();
        System.out.print("Guide Code(1-4) : ");
        guideCode = input.nextInt();
        System.out.print("Tour Days(3-9)  : ");
        numTourDays = input.nextInt();

        // divider
        System.out.println("\n-------------------------------\n");

        // display tourist name
        System.out.println("Tourist Name  : " + touristName);
        // display hotel name using hotel code; ex hotelCode=1, hotelNames[1] = "Insugar Hotel"
        System.out.println("Hotel         : " + hotelNames[hotelCode]);
        // display guide name using guide code; ex guideCode=1, guideNames[1] = "Jane Bond"
        System.out.println("Guide Name    : " + guideNames[guideCode] + "\n");
        
        // display number of tour days
        System.out.println("Tour Days     : " + numTourDays);
        // display rates/day using guide code; ex guideCode=1, ratesperDay[1] = 1106
        // use String.format to display double having two(2) decimal places
        System.out.println("Rate per Day  : "+ String.format("%.2f", ratesPerDay[guideCode]) + "\n");

        // compute for total fee and print
        totalFee = ratesPerDay[guideCode] * numTourDays;
        System.out.println("Total Fee     : " + String.format("%.2f", totalFee));

        input.close();
    }
}