import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        
        Scanner inp = new Scanner(System.in);
        int n,k;
        
        System.out.print("Üssü Alınacak Sayı : ");
        n  = inp.nextInt();
        System.out.print("Üs Olacak Sayı : ");
        k = inp.nextInt();
        

        int total = 1;
        for(int i = 1; i <=k; i++){
            total *= n;
            
        } System.out.print("Sonuç : " + total);


    }
}