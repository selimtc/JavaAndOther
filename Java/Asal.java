import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter Number : ");
        int number = input.nextInt();
        isAsal(number, 2);
    }

    static boolean isAsal(int number, int i) {


        if (i == number) {
            System.out.println(number + "  asal sayıdır");
            return true;

        } else if (number % i == 0) {
            System.out.println(number + "  asal sayı degildir.");
            return false;

        }

        return isAsal(number, i + 1);

    }
}