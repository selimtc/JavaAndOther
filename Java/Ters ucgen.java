import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Numara girin: ");
        int sayi = input.nextInt();
        System.out.println("");
        for (int a = sayi; a >0 ; a--) {
            for (int i = 0; i < (sayi - a); i++) {
                System.out.print(" ");
            }

            for (int charIndex = 0; charIndex < (2*a-1); charIndex++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}