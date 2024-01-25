import java.util.*;

/**
 * AvgTemp
 */
public class AvgTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many day's temperatures? ");
        int numDays = sc.nextInt();
        int[] temps = new int[numDays];
        // record temp and find avg
        int sum = 0;
        for (int i = 0; i < numDays; i++) {
            System.out.println("Day " + (i + 1) + "'s high temp: ");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }
        double average = sum / numDays;
        // count day's abv avg
        int above = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average) {
                above++;
            }
        }
        System.out.println();
        System.out.println("Average Temp = " + average);
        System.out.println(above + " Day's above average");

    }
}