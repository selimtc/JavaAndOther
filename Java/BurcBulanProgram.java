import java.util.Scanner;
public class Main {
    public static void main(String[] args ){
        Scanner input=new Scanner(System.in);
        int gun;
        String ay;
        System.out.print("Doğduğunuz ay:");
        ay= input.nextLine();
        System.out.print("Doğduğunuz gün:");
        gun=input.nextInt();
        if(ay.equals("ocak")){
            if(gun>=1 && gun<=21){
                System.out.print("BURCUNUZ:"+"Oğlak");
            }
            else if(gun>=22 && gun<=31){
                System.out.print("BURCUNUZ:"+"Kova");
            }
            else{
                System.out.print("Hatalı giris! Lütfen kontrol ediniz");
            }
        }
        else if(ay.equals("şubat")){
            if(gun>=1 && gun<=19){
                System.out.println("BURCUNUZ:"+"Kova");
            }
            else if(gun>=20 && gun<=29){
                System.out.print("BURCUNUZ:"+"Balık");
            }
            else{
                System.out.print("Hatalı giris! Lütfen kontrol ediniz");
            }
        }
        else if(ay.equals("mart")){
            if(gun>=1 && gun<=20){
                System.out.print("BURCUNUZ:"+"Balık");
            }
            else if(gun>=21 && gun<=31){
                System.out.print("BURCUNUZ:"+"Koç");
            }
            else{
                System.out.print("Hatalı giris! Lütfen kontrol ediniz");
            }
        }
        else if(ay.equals("nisan")){
            if(gun>=1 && gun<=20){
                System.out.print("BURCUNUZ:"+"Koç");
            }
            else if(gun>=21 && gun<=30){
                System.out.print("BURCUNUZ:"+"Boğa");
            }
            else{
                System.out.print("Hatalı giris! Lütfen kontrol ediniz");
            }
        }
        else if(ay.equals("mayıs")){
            if(gun>=1 && gun<=21){
                System.out.print("BURCUNUZ:"+"Boğa");
            }
            else if(gun>=22 && gun<=31){
                System.out.print("BURCUNUZ:"+"İkizler");
            }
            else{
                System.out.print("Hatalı giris! Lütfen kontrol ediniz");
            }
        }
        else if(ay.equals("haziran")){
            if(gun>=1 && gun<=22){
                System.out.print("BURCUNUZ:"+"İkizler");
            }
            else if(gun>=23 && gun<=30){
                System.out.print("BURCUNUZ:"+"Yengeç");
            }
            else{
                System.out.print("Hatalı giris! Lütfen kontrol ediniz");
            }
        }
        else if(ay.equals("temmuz")){
            if(gun>=1 && gun<=22){
                System.out.println("BURCUNUZ:"+"Yengeç");
            }
            else if(gun>=23 && gun<=31){
                System.out.print("BURCUNUZ:"+"Aslan");
            }
            else{
                System.out.print("Hatalı giris! Lütfen kontrol ediniz");
            }
        }
        else if(ay.equals("ağustos")){
            if(gun>=1 && gun<=22){
                System.out.print("BURCUNUZ:"+"Aslan");
            }
            else if(gun>=23 && gun<=31){
                System.out.print("BURCUNUZ:"+"Başak");
            }
            else{
                System.out.print("Hatalı giris! Lütfen kontrol ediniz");
            }
        }
        else if(ay.equals("eylül")){
            if(gun>=1 && gun<=22){
                System.out.print("BURCUNUZ:"+"Başak");
            }
            else if(gun>=23 && gun<=30){
                System.out.print("BURCUNUZ:"+"Terazi");
            }
            else{
                System.out.print("Hatalı giris! Lütfen kontrol ediniz");
            }
        }
        else if(ay.equals("ekim")){
            if(gun>=1 && gun<=22){
                System.out.print("BURCUNUZ:"+"Terazi");
            }
            else if(gun>=23 && gun<=31){
                System.out.print("BURCUNUZ:"+"Akrep");
            }
            else{
                System.out.print("Hatalı giris! Lütfen kontrol ediniz");
            }
        }
        else if(ay.equals("kasım")){
            if(gun>=1 && gun<=21){
                System.out.print("BURCUNUZ:"+"Akrep");
            }
            else if(gun>=22 && gun<=30){
                System.out.print("BURCUNUZ:"+"Yay");
            }
            else{
                System.out.print("Hatalı giris! Lütfen kontrol ediniz");
            }
        }
        else if(ay.equals("aralık")){
            if(gun>=1 && gun<=21){
                System.out.print("BURCUNUZ:"+"Yay");
            }
            else if(gun>=22 && gun<=31){
                System.out.print("BURCUNUZ:"+"Oğlak");
            }
            else{
                System.out.print("Hatalı giris! Lütfen kontrol ediniz");
            }
        }


    }
}