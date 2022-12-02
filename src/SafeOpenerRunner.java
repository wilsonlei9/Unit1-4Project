import java.util.Scanner;
public class SafeOpenerRunner {
    public static void main(String[] args) {
        SafeOpener safe = new SafeOpener(10,10,10,10);
        safe.generateDigit1();
        safe.generateDigit2();
        safe.generateDigit3();
        safe.generateDigit4();
        String combination = safe.combination();
        int digit1 = Integer.parseInt(combination.substring(0,1));
        int digit2 = Integer.parseInt(combination.substring(1,2));
        int digit3 = Integer.parseInt(combination.substring(2,3));
        int digit4 = Integer.parseInt(combination.substring(3,4));
        Scanner s = new Scanner(System.in);
        System.out.println("Try to break into the safe.\nThere are 4 digits in the combination.");
        System.out.println("The four parameters in the constructor are the maximum values for each digit.");
        System.out.println("Put the amount of tries you want inside the parameter for the tries method.");
        System.out.println("Guess the first digit to the combination.");
        int guessDigit1 = s.nextInt();
        int count = 0;
        safe.tries(4);
        safe.guessDigit1(guessDigit1, digit1);
        if (safe.digit1Guessed)
        {
            System.out.println("\nGuess the second digit to the combination");
            int guessDigit2 = s.nextInt();
            safe.guessDigit2(guessDigit2, digit2);
        }

        if (safe.digit2Guessed)
        {
            System.out.println("\nGuess the third digit to the combination");
            int guessDigit3 = s.nextInt();
            safe.guessDigit3(guessDigit3, digit3);
        }
        if (safe.digit3Guessed)
        {
            System.out.println("\nGuess the fourth digit to the combination:");
            int guessDigit4 = s.nextInt();
            safe.guessDigit3(guessDigit4, digit4);
        }
        if (safe.digit4Guessed)
        {
            System.out.println(safe.toString());
        }
        else {
            System.out.print("Try again next time");
        }
        }

    }


