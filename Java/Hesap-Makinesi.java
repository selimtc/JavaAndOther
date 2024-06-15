
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int Number1, Number2, select;
		
		Scanner inp= new Scanner(System.in);
		
		System.out.print("İlk sayıyı giriniz:");
		Number1=inp.nextInt();
		
		System.out.print("İkinci sayıyı giriniz:");
		Number2=inp.nextInt();
	
	
	/* Kodumuzu asagıdaki ile kontrol edebiliriz dogru mu diye
	System.out.println(Number1 + " - " + Number2);*/
	
	/* asagıdaki \n bir alt satırı gecmesi için yazıldı*/
	    
        System.out.println( "1-Toplam\n2-Cıkarma\n3-Carpma\n4-Bolme" );
        System.out.println("Seciminiz: ");
        select=inp.nextInt();
       
       /* Kodumuzu asagıdaki ile kontrol edebiliriz dogru mu diye
	System.out.println(select);*/
	
         switch (select) {
            case 1:
                System.out.println("Toplam Islemı Sonucu: " + (Number1 + Number2));
            case 2:
                System.out.println("Cıkarma Islemı Sonucu: " + (Number1 - Number2));
                break;
            case 3:
                System.out.println("Carpma Islemı Sonucu: " + (Number1 * Number2));
                break;
            case 4:
                if (Number2 != 0) {
                    System.out.println("Bolme Islemı Sonucu: " + (Number1 / Number2));
                } else {
                    System.out.println("Verilen değer  0'a bölünemez ");
                }
                break;
            default:
                System.out.println("Yanlış  seçim yapıldı, lutfen kontrol ediniz.");
        }
	}
}
