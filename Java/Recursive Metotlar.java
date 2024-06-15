import java.util.Scanner;

public class Main {


    public static int fibo(int number){

        if (number==1||number==2){
            return 1;
        }


        return fibo(number-1)+fibo(number-2);
    }

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int num=scanner.nextInt();

        System.out.print(fibo(num));

    }

}