import java.util.Scanner;
public class SafeOpener {
    private int digit1 = (int) (Math.random() * 10);
    private int digit2 = (int) (Math.random() * 10);
    private int digit3 = (int) (Math.random() * 10);
    private int digit4 = (int) (Math.random() * 10);
    private boolean safeOpened;
    Scanner s = new Scanner(System.in);

    public SafeOpener() {

    }

    public String combination() {
        String combination = "" + digit1 + digit2 + digit3 + digit4;
        return combination;
    }

    public void guessDigit1(int guess, int digit1) {
        this.digit1 = digit1;
        int count = 0;
        while (guess != digit1) {
            if (guess > digit1) {
                System.out.println("Too high\nTry again");
                guess = s.nextInt();
            }
            if (guess < digit1) {
                System.out.println("Too low\nTry again");
                guess = s.nextInt();
            }
            if (guess == digit1) {
                System.out.println("Correct");
            }
            count++;
            if (count == 2 && guess != digit1)
            {
                System.out.println("Failed\nThe digit was " + digit1);

            }

        }
    }


}
