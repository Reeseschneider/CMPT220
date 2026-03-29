import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        /*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
grade average calculator:
*/

Scanner sc = new Scanner(System.in);
       System.out.print("Enter grade 1: ");
        int grade1 = sc.nextInt();
        getGrade(grade1);

        System.out.print("Enter grade 2: ");
        int grade2 = sc.nextInt();
        getGrade(grade2);

        System.out.print("Enter grade 3: ");
        int grade3 = sc.nextInt();
        getGrade(grade3);
         System.out.print("Enter grade 4: ");
        int grade4 = sc.nextInt();
        getGrade(grade4);

        System.out.print("Enter grade 5: ");
        int grade5 = sc.nextInt();
        getGrade(grade5);

        // Calculate average
        double avg = calculateAverage(grade1, grade2, grade3, grade4, grade5);
        printAverage(avg);
    }

    // parameter-less function
    public static void getGrade(int grade) {

    }

    // Calculate average: parameter function
    public static double calculateAverage(int a, int b, int c, int d, int e) {
        return (a + b + c + d + e) / 5.0;
    }

    // Print the average: parameter function
    public static void printAverage(double avg) {
        System.out.println("Average: " + avg);
    }
}
