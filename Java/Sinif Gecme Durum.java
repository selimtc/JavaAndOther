
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		int mat,fizik,kimya,turkce,tarih,muzik;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Matematik Notunuz : ");
		mat = inp.nextInt();
		
		if(mat<0 || mat>100){
		    mat=0;
		}
		
		System.out.print("Fizik Notunuz : ");
		fizik= inp.nextInt();
		
		if(fizik<0 || fizik>100){
		    fizik=0;
		}
		
		System.out.print("Kimya Notunuz : ");
		kimya= inp.nextInt();
		
		if(kimya<0 || kimya>100){
		    kimya=0;
		}
		
		System.out.print("turkce Notunuz : ");
		turkce= inp.nextInt();
		
		if(turkce<0 || turkce>100){
		    turkce=0;
		}
		
		System.out.print("tarih Notunuz : ");
		tarih= inp.nextInt();
		
		if(tarih<0 || tarih>100){
		    tarih=0;
		}
		
		System.out.print("muzik Notunuz : ");
		muzik= inp.nextInt();
		
		if(muzik<0 || muzik>100){
		    muzik=0;
		}
		
		int toplam =(mat+fizik+kimya+turkce+tarih+muzik);
		double sonuc = toplam/6.0;
		System.out.println("ortalamanız: " + sonuc);
		
	if (sonuc>=55){
	    System.out.println("Tebrikler Geçtiniz ortalamanız: ");
	    
	    }else{
	        System.out.println("Maalesef Sınıfta Kaldınız: ");
	    }
	} 
	}

