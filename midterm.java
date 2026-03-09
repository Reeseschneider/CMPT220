import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //Created a new scanner to input user sales entries
        System.out.print("How many sales entries? ");
        int numberOfSales = input.nextInt();

        //Creating an array to store user sales
        int[] sales = new int[numberOfSales];

        // For loop to collect the amount of sales they want entered
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sale: ");
            sales[i] = input.nextInt();
        }

        // Calculating total sales
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
        }

        //Calculating average sales
        int average = total / sales.length;

        // Finding highest and lowest sales
        int highest = sales[0];
        int lowest = sales[0];

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] > highest) {
                highest = sales[i];
            }
            if (sales[i] < lowest) {
                lowest = sales[i];
            }
        }

        // Calculating how many sales are above the average
        int aboveAverageCount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveAverageCount++;
            }
        }
        
        //Displays the output of the report
        System.out.println("Sales Report: ");
        System.out.println("Total Sales: " + total);
        System.out.println("Average Sale: " + average);
        System.out.println("Highest Sale: " + highest);
        System.out.println("Lowest Sale: " + lowest);
        System.out.println("Number of Sales Above Average: " + aboveAverageCount);
    }
}
