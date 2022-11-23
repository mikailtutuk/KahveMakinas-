package kahveMakinesi01;

import java.util.Scanner;

public class KahveMakinesi {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("****** JAVA CAFE'YE HOSGELDİNİZ ******");
        System.out.println("Lutfen yapmak istediginiz islemi seciniz:\n1.Turk Kahvesi\n2.Espresso\n3.Americano\n4.Latte\n5.Cappicino\n6.Filtre Kahve\n7.Cikis");
        String islemler= scan.next();
        String hangiKahve="";
        switch (islemler){
            case "1":
                hangiKahve="Turk kahvesi";break;
            case "2":
                hangiKahve="Espresso";break;
            case "3":
                hangiKahve="Americano";break;
            case "4":
                hangiKahve="Latte";break;
            case "5":
                hangiKahve="Cappicino";break;
            case "6":
                hangiKahve="Filtre kahve";break;
            case "7":
                System.out.print("Cikis yapiliyor");break;
            default:
                System.out.println("Hatali tuslama yaptiniz lütfen tekrar deneyin");break;
        }
        System.out.println(hangiKahve);


        System.out.println(" ");


        System.out.println("Sut eklemek ister misiniz?\n1.Evet\n2.Hayir");
        String sut=scan.next();

        if (sut.equals("1")){
            System.out.println("Sutunuz ekleniyor....");
        }else{
            System.out.println("Sut eklenmiyor....");
        }

        System.out.println("Seker eklemek ister misiniz?\nEvet\nHayir");
        String seker=scan.next().toLowerCase();

        if (seker.equals("evet")){
            System.out.println("Kac seker eklemek istersiniz? (En fazla 5 adet seker eklenebilir)");
            int sekeradedi=scan.nextInt();
            if (sekeradedi==1){
                System.out.println(sekeradedi+" seker ekleniyor");
            }else if (sekeradedi==2){
                System.out.println(sekeradedi+" seker ekleniyor");
            }else if(sekeradedi==3){
                System.out.println(sekeradedi+" seker ekleniyor");
            }else if (sekeradedi==4){
                System.out.println(sekeradedi+" seker ekleniyor");
            }else if (sekeradedi==5){
                System.out.println(sekeradedi+" seker ekleniyor");
            }else {
                System.out.println("Hatali tuslama yaptiniz Lütfen tekrar deneyin");
            }
        }else if (seker.equals("hayir")){
            System.out.println("Seker eklenmiyor...");
        }else{
            System.out.println("Hatali giris yaptiniz lutfen tekrar deneyin");
        }

        System.out.println("Kahveniz hangi boy olsun?\n1-Buyuk\n2-Orta\n3-Kucuk");
        String boy=scan.next();

        switch (boy){
            case "buyuk":
                System.out.println(boy+" boy kahveniz hazirlaniyor...");break;
            case "orta":
                System.out.println(boy+" boy kahveniz hazirlaniyor...");break;
            case "kucuk":
                System.out.println(boy+" boy kahveniz hazirlaniyor...");break;
            default:
                System.out.println("hatali giris yaptiniz lutfen tekrar deneyin");
        }

        System.out.println("***ISLEMİNİZ TAMAMLANİYOR......***");
        System.out.println();

    }
}

