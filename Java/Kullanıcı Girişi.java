
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		String KullaniciAdi, Sifre;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Kullanici Adını giriniz");
		KullaniciAdi=inp.nextLine();
		
		System.out.println("Sifre giriniz");
		Sifre=inp.nextLine();
		
		/* Normalde KullaniciAdi="Patika" diyerek tamamlardık 
		ancak string'te boyle calısmıyor equal kullanmak lazım KullaniciAdi.equals("Patika")*/
		
		if (KullaniciAdi.equals("Patika") && Sifre.equals("Patika123") ) {
		    System.out.println("kullanıcı adı ve sifre dogru");
		    
		}else{
		    System.out.println("hata");
		}
	}
}
