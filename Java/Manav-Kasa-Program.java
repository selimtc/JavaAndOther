
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
		double Armut,Elma,Domates,Muz,Patlıcan, toplam;
		double ArmutkgFiyat=2.14,ElmakgFiyat= 3.67,DomateskgFiyat =1.11,MuzkgFiyat= 0.95, PatlıcankgFiyat= 5.00;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Armut Kaç Kilo  : ");
		Armut = inp.nextInt();
		
		System.out.print("Elma Kaç Kilo : ");
		Elma= inp.nextInt();
		
		System.out.print("Domates Kaç Kilo : ");
		Domates= inp.nextInt();
		
		System.out.print("Muz Kaç Kilo : ");
		Muz= inp.nextInt();
		
		System.out.print("Patlıcan Kaç Kilo : ");
		Patlıcan= inp.nextInt();
	
		toplam =Armut*ArmutkgFiyat+Elma*ElmakgFiyat+Domates*DomateskgFiyat+Muz*MuzkgFiyat+Patlıcan*PatlıcankgFiyat;
		System.out.println("toplam tutar: " + toplam);
	
	}
}

