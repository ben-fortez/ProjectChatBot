import java.util.Scanner;

public class ProjectChatBot {
    public static void main(String[] args) {
        // Bot Introduction
        System.out.println("Hello! My name is Johnny.");
        System.out.println("I was created in 2025.");
        System.out.println("Please, remind me your name.");

        // User Introduction
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("What a great name you have, " + name + "!");

        // Bot Introduces the Age Guessing Game
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5, and 7.");

        // User Inputs Remainders of Age by 3, 5, and 7
        int remainder3 = sc.nextInt();
        int remainder5 = sc.nextInt();
        int remainder7 = sc.nextInt();

        // Age Guessing Calculation
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        // Bot Guesses User's Age
        System.out.println("Your age is " + age + "; that's a good time to start programming!");

        // Bot Proves They Can Count
        System.out.println("Now I will prove to you that I can count to any number you want.");

        // User Inputs Number They Want Counted To
        int countLimit = sc.nextInt();

        // Bot Counts to countLimit
        for (int i = 0; i <= countLimit; i++){
            System.out.println(i + "!");
        }

        // Bot Introduces a Simple Quiz
        System.out.println("Let's test your programming knowledge.");

        // Bot Asks Quiz Question and Presents Possible Answers
        System.out.println("Which method can be used to return a string in upper case letters?");
        System.out.println("1. toUpperCase");
        System.out.println("2. touppercase()");
        System.out.println("3. upperCase()");
        System.out.println("4. tuc()");

        // User Inputs Answer
        int choice = sc.nextInt();

        // Bot Checks Answer
        for (; choice != 1; choice = sc.nextInt()) {
            System.out.println("Please, try again.");
        }

        System.out.println("Congratulations, have a nice day!");

    }
}
