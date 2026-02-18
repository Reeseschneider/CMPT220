import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 0; i < 11; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        Scanner sc = new Scanner(System.in);
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        Integer num = sc.nextInt();
        long factorial = 1;
        for (int l =1; l<= num; l++){
            factorial *=l;
        }
        System.out.println("the factorial is:" + factorial);


        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        Scanner input = new Scanner(System.in);
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i+=2) {
            sum = sum + i;
            System.out.println("sum is:" + sum);
            System.out.println("i is: " + i);
        }


        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false;
        }

        //P5: Take a string from the user and print them the reverse!
        Scanner inp = new Scanner(System.in);
        System.out.println("Problem 5");
        System.out.println("Enter a string to reverse:");
        String text = inp.nextLine();
        //hint
        String reverse = "";
        for (int i = text.length() - 1; i>= 0; i--) {
            reverse = reverse + text.charAt(i);
        }
        System.out.println("Reversed text:" + reverse);

    }
}
