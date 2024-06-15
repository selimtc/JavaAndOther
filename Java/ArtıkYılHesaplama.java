import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Yıl Giriniz:");
        int year= input.nextInt();

        if(year%100==0){
            if(year%400==0){
                System.out.print("Hesaplamalar sonucu "+year+ "  artık yıldır.");
            }
            else{
                System.out.print("Hesaplamalar sonucu "+year+ "  artık yıl değildir.");
            }
        }
        else if(year%4==0){
            System.out.print("Hesaplamalar sonucu "+year+ "  artık yıldır.");
        }
        else{
            System.out.print("Hesaplamalar sonucu "+year+ "  artık yıl değildir.");
        }

    }
}