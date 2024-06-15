import java.util.Scanner;
public class Main {

    
    
    public static void main(String[] args) {
        
        /*www.patika.dev
          Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
          Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
          Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
          Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */
        
        int havaDurumu;
        
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Hava sıcaklığı: ");
        havaDurumu = inp.nextInt();
        
        if (havaDurumu < 5) {
            System.out.println(" hava bugun soguk. Kayak yap.");
            
        }else if (havaDurumu >= 5 && havaDurumu < 15) {
            System.out.println("Bu havada ancak sinemaya gidilir.");

        }else if (havaDurumu == 15) {
            System.out.println("Bu havada ya sinema ya piknik.");
        
        }else if (havaDurumu > 15 && havaDurumu <= 25) {
            System.out.println("Hava sıcak pikniğe git.");
        
        }else if (havaDurumu > 25) {
            System.out.println("Hava sıcak, yüzme iyi gelir.");
              
        }else {
            System.out.println("Verilerde hata var, tam sayı girilmelidir.");
        }  
        
    }
    
}