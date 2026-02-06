//always start with importing our scanner so we can use it!
//My name is Reese and I am majoring in Business and Computer Science
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Integer score = 0;
//ask a question for user to input 
//decide if answer is a string or integer 
//set if, else if, and else statements
//print response
    System.out.println("Question 1: Is marist a univeristy or college?");
     String school = input.nextLine();
        if (school.equals( "university") || school.equals("University")){
        System.out.println("correct!");
        score ++;
        } else {
        System.out.println("wrong");
        }
        
        System.out.println("Question 2: What town is Marist located in?");
        String town = input.nextLine();
        if (town.equals( "Poughkeepsie") || town.equals("poughkeepsie")){
            System.out.println("correct!");
            score ++;
        } else {
            System.out.println("that is wrong");
        }
        
        System.out.println("Question 3: What kind of animal is Marist's mascot");
        String mascot = input.nextLine();
        if (mascot.equals("red fox") || mascot.equals("Red Fox")) {
            System.out.println("correct!");
            score ++;
        } else if (mascot.equals("fox") || mascot.equals("Fox")) {
            System.out.println("close!");
        } else {
        System.out.println("that is wrong");
        }
        System.out.println("Your final score is : " + score); {

        }
    }

 }
 //What I learned:
 //using a scanner to get user inputs 
 //using else if to add another if option
 //using .equals to match the answer to the user input
