package kahveMakinesi02;

import java.util.Scanner;

public class Kahve {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("****** JAVA CAFE'YE HOSGELDİNİZ ******");
        System.out.println("Lutfen yapmak istediginiz islemi seciniz:\n1.Turk Kahvesi\n2.Espresso\n3.Americano\n" +
                "4.Latte\n5.Cappicino\n6.Filtre Kahve\n7.Cikis");
       Islemler kahve =new Islemler();
       kahve.ıslemler();
        System.out.println("Sut eklemek ister misiniz?\nEvet-->1\nHayir-->2");
        kahve.sut();
        System.out.println("Seker eklemek ister misiniz?\nEvet-->1\nHayir-->2");
        kahve.sekersec();
        System.out.println("Kahveniz hangi boy olsun?\nBUYUK BOY-->buyuk\nORTA BOY-->orta\nKUCUK BOY-->kucuk");
        kahve.boysec();

        System.out.println("ISLEMİNİZ TAMAMLANİYOR......");
        System.out.println(kahve.kahveboy+" boy "+ kahve.sekerliMi+" "+ kahve.sutluMu+" "+kahve.hangiKahve+" hazirlaniyor");

    }
}
