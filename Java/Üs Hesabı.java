import java.util.Scanner;

public class Main {
    static void data() {
        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.print("Sayı giriniz: ");
            int base = inp.nextInt();
            System.out.print("Üs giriniz: ");
            int exponent = inp.nextInt();
            int result = 1;

            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        data();
    }
}