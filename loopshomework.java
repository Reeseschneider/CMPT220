import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        /*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
!!!!!!
Look into things like charAt- DO NOT NAME YOUR VARIABLE "REVERSED". If you do, automatic 0 points!!!!!!
!!!!!!!
if you're confused reach out!
 */
         //P5: Take a string from the user and print them the reverse!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
        System.out.println(letter);
        }
    }
    //used a new scanner to store user input
    //found a way to print each character individually
    //found out that charAt gives the character at a specific spot in the string
    //length tells the program how many characters are in the string
}

