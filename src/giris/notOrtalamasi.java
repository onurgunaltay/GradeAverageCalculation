package giris;

import java.util.Scanner;


public class notOrtalamasi {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        // scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan degerleri al
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz :");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();

        System.out.print("Muzık Notunuz :");
        muzik = inp.nextInt();

        int toplam= (mat + fizik + kimya + turkce + tarih + muzik );
        double sonuc = toplam / 6;
        boolean ortamala = (sonuc>=60);
        boolean ortamala2 = (sonuc<60);
        System.out.println("kaldın dersten kamil : ");
        System.out.println("Ortamalamanız dersi gecmek için yeterli : " + sonuc);






    }
}
