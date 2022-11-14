import java.util.Scanner;
public class SafeOpenerRunner {
    public static void main(String[] args) {
        SafeOpener safe = new SafeOpener();
        String combination = safe.combination();
        String digit1 = combination.substring(0,1);
        String digit2 = combination.substring(1,2);
        String digit3 = combination.substring(2,3);
        String digit4 = combination.substring(3,4);
        Scanner s = new Scanner(System.in);
        System.out.print(digit1);
        System.out.println("Guess the first digit to the combination");
        int guessDigit1 = s.nextInt();


    }
}

