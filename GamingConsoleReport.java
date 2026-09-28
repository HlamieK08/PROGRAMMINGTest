import java.util.Scanner;
class GamingConsoleReport{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Single dimensional array with gaming city names
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        //Single dimensional array holding console type
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        //TWO dimensional array: rows=cities,  coloums= consoles
        //numberofsales[city][0] = PS5, numberofsales[citi][1]= XBOX, numberofsales[city][2]=SWITCH
        int[][] sales = new int[cities.length][consoles.length];

        //Single dimensional array holding toatl number of sales
        int[] totals = new int[cities.length];
        
        for (int row = 0; row < cities.length; row++){
            for (int col = 0; col <  consoles.length; col++){
                sales[row][col] = input.nextInt();
            }
        }
        
        //----------------------- CALCULATING TOTALS -----------------------
        for (int row = 0; row < cities.length; row++){
            int sum = 0;
            for (int col = 0; col < consoles.length; col++){
                sum = sum + sales[row][col];
            }
            totals[row] = sum;
        }
        int highestIndex = 0;
        for (int i= 1;  i < totals.length; i++){
        if (totals[i] > totals[highestIndex]) {
            highestIndex = i;
        }
        }
        //Displaying Report
        System.out.println("------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-20s%-20s %-20s %-20s%n","", "PS5", "XBOX", "SWITCH");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s%-20s %-20s %-20s%n", cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("CONSOLE SALES FOR EACH CITY");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-16s%d%n", cities[i], totals[i]);
        }
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cities[highestIndex]);
        System.out.println("-----------------------------------------------------------------");
    }
}
