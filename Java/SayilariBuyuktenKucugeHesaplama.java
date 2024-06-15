import java.util.Scanner;

public class Main {
    
    public static void main(String [] args){
        
        Scanner input= new Scanner(System.in);
        
        int a,b,c;
        
        System.out.print(" İlk Sayı :");
        a=input.nextInt();
        
        System.out.print("İkinci Sayı:");
        b=input.nextInt();
        
        System.out.print("Üçüncü Sayı:");
        c=input.nextInt();
        
        if(a>b && a>c && b>c){
            System.out.print("Sıralama:"+"a>b>c");
        }
        else if(a>b && a>c && c>b){
            System.out.print("Sıralama:"+"a>c>b");
        }
        else if(b>a && b>c && a>c){
            System.out.print("Sıralama:"+"b>a>c");
        }
        else if(b>a && b>c && c>a){
            System.out.print("Sıralama:"+"b>c>a");
        }
        else if(c>a && c>b && a>b){
            System.out.print("Sıralama:"+"c>a>b");
        }
        else if(c>a && c>b && b>a){
            System.out.print("Sıralama:"+"c>b>a");
        }
        else if(a==b && a>c){
            System.out.print("Sıralama:"+"a=b>c");
        }
        else if(a==b && c>a){
            System.out.print("Sıralama:"+"c>a=b");
        }
        else if(a==c && a>b){
            System.out.print("Sıralama:"+"a=c>b");
        }
        else if(a==c && b>a){
            System.out.print("Sıralama:"+"b>a=c");
        }
        else if(b==c && b>a){
            System.out.print("Sıralama:"+"b=c>a");
        }
        else if(b==c && a>b){
            System.out.print("Sıralama:"+"a>b=c");
        }
        else{
            System.out.println("Sıralama:"+"a=b=c");
        }




    }
}