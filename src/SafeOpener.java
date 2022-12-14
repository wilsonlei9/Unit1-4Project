import java.util.Scanner;
/**
 * The SafeOpener class represents a safe with a 4 digit combination.
 */
public class SafeOpener {
    private int digit1;
    private int digit2;
    private int digit3;
    private int digit4;
    private int max1;
    private int max2;
    private int max3;
    private int max4;
    boolean digit1Guessed = true;
    boolean digit2Guessed = true;
    boolean digit3Guessed = true;
    boolean digit4Guessed = true;
    private int tries;
    Scanner s = new Scanner(System.in);

    /**
     * Constructor for the SafeOpener class. Creates a new instance of SafeOpener with parameters.
     * @param max1 represents the maximum value digit 1 can be.
     * @param max2 represents the maximum value digit 2 can be.
     * @param max3 represents the maximum value digit 3 can be.
     * @param max4 represents the maximum value digit 4 can be.
     */
    public SafeOpener(int max1, int max2, int max3, int max4) {
        this.max1 = max1;
        this.max2 = max2;
        this.max3 = max3;
        this.max4 = max4;
    }

    /**
     * Assigns digit 1 a random value from 0 to max1.
     */
    public void generateDigit1() {
        digit1 = (int) (Math.random() * max1);
    }

    /**
     * Assigns digit 2 a random value from 0 to max2.
     */
    public void generateDigit2() {
        digit2 = (int) (Math.random() * max2);
    }

    /**
     * Assigns digit 3 a random value from 0 to max3.
     */
    public void generateDigit3() {
        digit3 = (int) (Math.random() * max3);
    }

    /**
     * Assigns digit 4 a random value from 0 to max4.
     */
    public void generateDigit4() {
        digit4 = (int) (Math.random() * max4);
    }

    /**
     * Creates the full combination by putting all the variables in a string.
     * @return returns the combination.
     */
    public String combination() {
        String combination = "" + digit1 + digit2 + digit3 + digit4;
        return combination;
    }


    /**
     * Asks the user to guess digit1. Tells the user if the guess is too high or too low.
     * @param guess represents the number the user guesses.
     * @param digit1 represents the value of digit1.
     * @return ends the method.
     */

    public int guessDigit1(int guess, int digit1) {
        this.digit1 = digit1;
        int count = 0;
        for (int i = 0; i < tries; i++) {
            if (guess > digit1) {
                if (guess > max1) {
                    System.out.println("Over the maximum");
                }
                System.out.println("Too high\nTry again");
                guess = s.nextInt();

            }
            if (guess < digit1) {
                System.out.println("Too low\nTry again");
                guess = s.nextInt();
            }
            if (guess == digit1) {
                System.out.println("Correct");
                return 0;
            }

            count++;

            if (count == tries - 1 && guess != digit1) {
                System.out.println("Failed\nThe digit was " + digit1);
                digit1Guessed = false;
                digit2Guessed = false;
                digit3Guessed = false;
                digit4Guessed = false;
                return 0;
            }

        }
        return 0;
    }
    /**
     * Asks the user to guess digit2. Tells the user if the guess is too high or too low.
     * @param guess represents the number the user guesses.
     * @param digit2 represents the value of digit1.
     * @return ends the method.
     */
    public int guessDigit2(int guess, int digit2) {
        this.digit2 = digit2;
        int count = 0;
        for (int i = 0; i < tries; i++) {
            if (guess > digit2) {
                if (guess > max2) {
                    System.out.println("Over the maximum");
                }
                System.out.println("Too high\nTry again");
                guess = s.nextInt();
            }
            if (guess < digit2) {
                System.out.println("Too low\nTry again");
                guess = s.nextInt();
            }
            if (guess == digit2) {
                System.out.println("Correct");
                return 0;
            }
            count++;
            if (count == tries - 1 && guess != digit2) {
                System.out.println("Failed\nThe digit was " + digit2);
                digit2Guessed = false;
                digit3Guessed = false;
                digit4Guessed = false;
                return 0;
            }
        }
        return 0;
    }
    /**
     * Asks the user to guess digit1. Tells the user if the guess is too high or too low.
     * @param guess represents the number the user guesses.
     * @param digit3 represents the value of digit1.
     * @return ends the method.
     */
    public int guessDigit3 (int guess, int digit3)
    {
        this.digit3 = digit3;
        int count = 0;
        for (int i = 0; i < tries; i++) {
            if (guess > digit3) {
                if (guess > max3) {
                    System.out.println("Over the maximum");
                }
                System.out.println("Too high\nTry again");
                guess = s.nextInt();
            }
            if (guess < digit3) {
                System.out.println("Too low\nTry again");
                guess = s.nextInt();
            }
            if (guess == digit3) {
                System.out.println("Correct");
                return 0;
            }
            count++;
            if (count == tries - 1 && guess != digit3) {
                System.out.println("Failed\nThe digit was " + digit3);
                digit3Guessed = false;
                digit4Guessed = false;
                return 0;
            }
        }
        return 0;
    }
    /**
     * Asks the user to guess digit1. Tells the user if the guess is too high or too low.
     * @param guess represents the number the user guesses.
     * @param digit4 represents the value of digit1.
     * @return ends the method.
     */
    public int guessDigit4(int guess, int digit4)
    {
        this.digit4 = digit4;
        int count = 0;
        for (int i = 0; i < tries; i++) {
            if (guess > digit4) {
                if (guess > max4) {
                    System.out.println("Over the maximum");
                }
                System.out.println("Too high\nTry again");
                guess = s.nextInt();
            }
            if (guess < digit4) {
                System.out.println("Too low\nTry again");
                guess = s.nextInt();
            }
            if (guess == digit4) {
                System.out.println("Correct");
                return 0;
            }
            count++;
            if (count == tries - 1 && guess != digit4) {
                System.out.println("Failed\nThe digit was " + digit4);
                digit4Guessed = false;
                return 0;
            }
        }
        return 0;
    }


    /**
     * toString method for the SafeOpener class. Returns a string showing the full combination and congratulates the user.
     * @return returns the string in a sentence containing the full combination.
     */
    public String toString()
    {
        String str = "The combination is " + digit1 + digit2 + digit3 + digit4 + ".";
        str += " Congratulations on breaking into the safe. Get the money quick!";
        return str;
    }

    /**
     * Uses the instance variable tries to determine how many tries the user gets to guess each digit.
     * @param tries represents the amount of tries.
     * @return ends the method.
     */
    public int tries(int tries)
    {
        this.tries = tries;
        return 0;
    }
}