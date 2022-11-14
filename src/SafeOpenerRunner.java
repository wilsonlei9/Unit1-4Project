import java.util.Scanner;
public class SafeOpenerRunner {
    public static void main(String[] args) {
        SafeOpener safe = new SafeOpener();
        String combination = safe.combination();
        int digit1 = Integer.parseInt(combination.substring(0,1));
        int digit2 = Integer.parseInt(combination.substring(1,2));
        int digit3 = Integer.parseInt(combination.substring(2,3));
        int digit4 = Integer.parseInt(combination.substring(3,4));
        Scanner s = new Scanner(System.in);
        System.out.println("Try to break into the safe. A digit can not repeat itself in the combination.\nYou have 3 tries to guess each digit");
        System.out.println("Guess the first digit to the combination");
        int guessDigit1 = s.nextInt();
        int count = 0;
        safe.guessDigit1(guessDigit1, digit1);


        System.out.println("Guess the second digit to the combination");
        int guessDigit2 = s.nextInt();
        while (guessDigit2 != digit2)
        {
            count = 0;
            if (guessDigit2 > digit2)
            {
                System.out.println("Too high\nTry again");
                guessDigit2 = s.nextInt();
            }
            if (guessDigit2 < digit2)
            {
                System.out.println("Too low\nTry again");
                guessDigit2 = s.nextInt();
            }
            if (guessDigit2 == digit2)
            {
                System.out.println("Correct");
            }
            count++;
            if (count == 2 && guessDigit1 != digit2)
            {
                System.out.println("Failed\nThe digit was " + digit2);
                return;
            }
        }
    }
}

