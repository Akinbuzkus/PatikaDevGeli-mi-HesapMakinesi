
import java.util.Scanner;


public class PatikaDevGelişmişHesapMakinesi {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int select ;
        
        String menu="1 - Toplama İşlemi\n"
                + "2 - Cıkarma İşlemi\n"
                + "3 - Carpma İslemi\n"
                + "4 - Bolme İslemi\n"
                + "5 - Üs Alma İslemi\n"
                + "6 - Mod Alma İslemi\n"
                + "7 - Dikdortgen Alan ve Cevre Hesaplama\n"
                + "0 Cıkıs";
        
        
        do { 
               System.out.println(menu);
            System.out.print("Bir işlem seçiniz :");
            select=scan.nextInt();
            System.out.println(menu);
            switch(select){
            
                case 1: {
                    System.out.println("Toplamak İstediğiniz Sayıları Giriniz :");
                    int sayi1=scan.nextInt();
                    int sayi2=scan.nextInt();
                    toplama(sayi1, sayi2);
                    break;
                }
                case 2:{
                System.out.println("Cıkarmak İstediğiniz Sayıları Giriniz :");
                    int sayi1=scan.nextInt();
                    int sayi2=scan.nextInt();
                    cıkarma(sayi1, sayi2);
                    break;
                }
                case 3:{
                System.out.println("Carpmak İstediğiniz Sayıları Giriniz :");
                    int sayi1=scan.nextInt();
                    int sayi2=scan.nextInt();
                    carpma(sayi1, sayi2);
                    break;
                }
                case 4:{
                    System.out.println("Bolmek İstediğiniz Sayıları Giriniz :");
                    int sayi1=scan.nextInt();
                    int sayi2=scan.nextInt();
                    bolme(sayi1, sayi2);
                    break;
                }
                case 5:{
                    System.out.println("Ussunu almak İstediğiniz Sayıyı Giriniz :");
                    int sayi1=scan.nextInt();
                    int sayi2=scan.nextInt();
                    usAlma(sayi1, sayi2);
                    break;
                
                }
                case 6:{
                    System.out.println("Mod almak İstediğiniz Sayıları Giriniz :");
                    int sayi1=scan.nextInt();
                    int sayi2=scan.nextInt();
                    modAlma(sayi1, sayi2);
                    break;
                }
                case 7:{
                System.out.println("Dikdortgenin alanı ve cevresini hesaplamak için sayıları giriniz :");
                    int sayi1=scan.nextInt();
                    int sayi2=scan.nextInt();
                    cevreVeAlan(sayi1, sayi2);
                    break;
                
                }
                case 0:{
                    System.out.println("İyi Günler:");
                    break;
                }
                
                default:
                    System.out.println("Hatalı Seçim Tekrar Deneyiniz.");
                
            }
            
            
        } while (select!=0);
        
        
    }
    
    static int toplama(int a,int b){
        int sum=a+b;
        System.out.println("Sum :"+sum);
        return sum;
    }
    static int cıkarma(int a,int b){
        int minus=a-b;
        System.out.println("Minus :"+minus);
        return minus;
    }
    static int carpma(int a,int b){
        int carp=a*b;
        System.out.println("Carpım :"+carp);
        return carp;
    }
    static int bolme(int a,int b){
        int bolme=a/b;
        System.out.println("Bölüm :"+bolme);
        return bolme;
    }
    static int usAlma(int a,int b){
        int us=(int)Math.pow(a, b);
        System.out.println(a+" Usu "+b+" :"+us);
        return us;
    }
    static int modAlma(int a,int b){
        int mod=a%b;
        System.out.println("Mod sonucu :"+mod);
        return mod;
    }
    static int cevreVeAlan(int a,int b){
        int alan=a*b;
        int cevre=2*a+b;
        System.out.println("Dikdortgenin alanı :"+alan);
        System.out.println("Dikdorgenin cevresi :"+cevre);
        return alan;
    }
    
}
