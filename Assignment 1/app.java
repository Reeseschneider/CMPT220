//always start with importing our scanner so we can use it!
import java.util.Scanner;
public class Debug {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 //finish this one for me by receiving and printing the user's age back to them
 System.out.println("How old are you? ");
 Integer age = sc.nextInt();
 System.out.println("I am " + age + " years old.");
 //can you do some math for me? take these variables and print out the sum of them!
 int num1 = 10;
 int num2 = 37;
 System.out.println("The sum of the variables is " + (num1 + num2));
 }
}
