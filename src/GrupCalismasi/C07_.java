package GrupCalismasi;

import java.util.Scanner;

public class C07_ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kullanici adinizi giriniz");
        System.out.println("Lutfen sifrenizi giriniz");

        String kullaniciAdi = scan.nextLine();
        String sifre = scan.nextLine();

        int yanlisGirisSayaci = 0;

        while (yanlisGirisSayaci < 3) {
            break;


        }
        if (kullaniciAdi.equals("ceyda.armin") && sifre.equals("160521armin")) {

        } else {
           yanlisGirisSayaci++;
           System.out.println("Kullanici adi veya sifre yanlıs. Lütfen tekrar deneyiniz");
       }
       if (yanlisGirisSayaci==3);
        System.out.println("üzgünüm yanlış giriş yaptınız.Uygulamadan çıkınız");





    }
}
