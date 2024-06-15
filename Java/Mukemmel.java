import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Girin: ");
        int sayi = inp.nextInt();
        int a = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                a += i;
            }
        }
        if (a == sayi) {
            System.out.println( sayi + " bir mükemmel sayı.");
        } else {
            System.out.println( sayi + " bir mükemmel sayı.");
        }
    }
}