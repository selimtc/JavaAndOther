public class Main
{
	public static void main(String[] args) {
	// Değişkenleri oluşturalım
		int a, b;
		double c, u, alan ;
		
		//Kullanıcıdan veri alalım
		
		Scanner girdi= new Scanner(System.in);
		
		System.out.print("1. kenarı giriniz : ");
		a=girdi.nextInt();
		
		System.out.print("2. kenarı giriniz : ");
		b=girdi.nextInt();
		
		System.out.print("3. kenarı giriniz : ");
		c=girdi.nextInt();
		
		u=(a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print(" Alan: " + alan);
	}
}
