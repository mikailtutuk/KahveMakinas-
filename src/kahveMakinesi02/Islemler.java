package kahveMakinesi02;

import java.util.Scanner;

public class Islemler {
static Scanner scan= new Scanner(System.in);
        String islemler = scan.next();
        String hangiKahve = "";
        String sekerliMi = "";
        String kahveboy = "";
        String sutluMu="";
        public void ıslemler () {
            switch (islemler) {
                case "1":
                    hangiKahve = "Turk kahvesi";
                    break;
                case "2":
                    hangiKahve = "Espresso";
                    break;
                case "3":
                    hangiKahve = "Americano";
                    break;
                case "4":
                    hangiKahve = "Latte";
                    break;
                case "5":
                    hangiKahve = "Cappicino";
                    break;
                case "6":
                    hangiKahve = "Filtre kahve";
                    break;
                case "7":
                    System.out.print("Cikis yapiliyor");
                    break;
                default:
                    System.out.println("Hatali tuslama yaptiniz lütfen tekrar deneyin");
                   ıslemler();
                    break;

            }
            System.out.println(hangiKahve);
            System.out.println(" ");
        }

        public void sut(){
            String sut=scan.next();
            if (sut.equals("1")){
                sutluMu="Sutlu";
                System.out.println("Sutunuz ekleniyor....");
            }else if(sut.equals("2")){
                sutluMu="Sutsuz";
                System.out.println("Sut eklenmiyor....");
            }else{
                System.out.println("Hatali tuslama yaptiniz lütfen tekrar deneyin");
                System.out.println("Sut eklemek ister misiniz?\nEvet-->1\nHayir-->2");
                sut();
            }
            System.out.println(" ");
        }

        public void sekersec () {
            String seker = scan.next().toLowerCase();
            if (seker.equals("1")) {
                sekerliMi = "Sekerli";
                System.out.println(sekerliMi + " kahveniz hazirlaniyor");
                System.out.println("Kac seker eklemek istersiniz? (En fazla 5 adet seker eklenebilir)");
                int sekeradedi = scan.nextInt();
                if (sekeradedi == 1) {
                    System.out.println(sekeradedi + " seker ekleniyor");
                } else if (sekeradedi == 2) {
                    System.out.println(sekeradedi + " seker ekleniyor");
                } else if (sekeradedi == 3) {
                    System.out.println(sekeradedi + " seker ekleniyor");
                } else if (sekeradedi == 4) {
                    System.out.println(sekeradedi + " seker ekleniyor");
                } else if (sekeradedi == 5) {
                    System.out.println(sekeradedi + " seker ekleniyor");
                } else {
                    System.out.println("Hatali tuslama yaptiniz Lütfen tekrar deneyin");
                    System.out.println("Seker eklemek ister misiniz?\nEvet-->1\nHayir-->2");
                    sekersec();
                }
            } else if (seker.equals("2")) {
                System.out.println("Seker eklenmiyor...");
                sekerliMi = "sekersiz";
                System.out.println(sekerliMi + " kahveniz hazirlaniyor");
            } else {
                System.out.println("Hatali giris yaptiniz lutfen tekrar deneyin");
                System.out.println("Seker eklemek ister misiniz?\nEvet-->1\nHayir-->2");
                sekersec();
            }
            System.out.println(" ");
        }

        public void boysec () {
            String boy = scan.next().toLowerCase();
            switch (boy) {
                case "buyuk":
                    kahveboy = "Buyuk";
                    System.out.println(boy + " boy kahveniz hazirlaniyor...");
                    break;
                case "orta":
                    kahveboy = "Orta";
                    System.out.println(boy + " boy kahveniz hazirlaniyor...");
                    break;
                case "kucuk":
                    kahveboy = "Kucuk";
                    System.out.println(boy + " boy kahveniz hazirlaniyor...");
                    break;
                default:
                    System.out.println("hatali giris yaptiniz lutfen tekrar deneyin");
                    System.out.println("Kahveniz hangi boy olsun?\nBuyuk-->1\nOrta-->2\nKucuk-->3");
                    boysec();
            }
            System.out.println(" ");
        }
}
