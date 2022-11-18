package java_questionBank.KeyAnswer;

import anaDers.day19datetime.DateTime01;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateClass {
    public static void main(String[] args) {
        /*
        1) Ali'nin kaç gün yaşadığını bulan kodu yazınız.
           Ali'nin doğum tarihi 12 Mayıs 2002'dir
         */
        LocalDate ali = LocalDate.of(2002, 5, 12);
        LocalDate bugun = LocalDate.now();
        Long bugunAli = ChronoUnit.DAYS.between(ali, bugun);
        System.out.println(bugunAli);//7477

        /*
        2) Ali'nin kaç ay yaşadığını bulan kodu yazınız.
           Ali'nin doğum tarihi 4 Haziran 1997'di
         */
        LocalDate ali1 = LocalDate.of(2002, 05, 12);
        LocalDate bugun1 = LocalDate.now();
        Long bugunAli1 = ChronoUnit.MONTHS.between(ali, bugun);
        System.out.println(bugunAli1);//245

        /*
        3) Ali'nin doğum tarihi 4 Haziran 1997'dir. Ali'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün
        sonraki tam tarihi bulmak için kodu yazınız.
         */
        LocalDate alinindt = LocalDate.of(1997, 6, 4);
        LocalDate yeni = alinindt.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println(yeni);//1999-09-16

        /*
        4) Ali, 29 Ekim 1923'ten 45 yıl 8 ay 5 gün sonra doğmuştur.
        Veli, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce doğmuştur.
        Ali ve Veli'nin kesin doğum tarihini hesaplamak için kodu yazınız.
        Ali ve Veli'nin doğum tarihinin aynı olup olmadığını kontrol etmek için kodu yazınız
         */
        LocalDate cumhuriyet = LocalDate.of(1923, 10, 29);
        LocalDate alii = cumhuriyet.plusYears(45).plusMonths(8).plusDays(5);
        System.out.println(alii);
        LocalDate eylul = LocalDate.of(1923, 9, 15);
        LocalDate veli = eylul.minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(veli);
        if (alii == veli) {
            System.out.println("aynı gun dogmuslar");
        } else System.out.println("aynı gun degil");//aynı degil

     /*
        5) Veli, Ali'den 3 yıl 11 gün sonra doğmuştur.
        Ali size doğum tarihi bilgisini 24 Kasım 2012 olarak vermiştir.
        Veli'nin doğum tarihini hesaplamak için gerekli kodu yazınız
    */
        LocalDate aliDog = LocalDate.of(2012, 11, 24);
        LocalDate veliDog = aliDog.plusYears(3).plusDays(11);
        System.out.println(veliDog);

     /*
     6) Kendinizin ve çocuğunuzun doğum tarihi için Tarih Değerleri oluşturup, ardından farkı gün
     olarak hesaplayınız.
      */
        LocalDate myDate = LocalDate.of(1990, 12, 24);
        LocalDate mychild = LocalDate.of(2022, 1, 1);
        long fark = ChronoUnit.DAYS.between(myDate, mychild);
        System.out.println(fark);

/*
7) Belirli bir tarihte yılın son 2 hanesini alınız
 */
        LocalDate yılSonİkiHane = LocalDate.of(2022, 9, 28);
        DateTimeFormatter sonİki = DateTimeFormatter.ofPattern("yy");
        String sonİki2 = sonİki.format(yılSonİkiHane);
        System.out.println(sonİki2);//22


/*
8) Belirli bir yılın "Artık yıl" olup olmadığını kontrol etmek için kodu yazınız.
Artık Yıl:
 */
        LocalDate artık = LocalDate.of(2020, 4, 30);
        boolean artikMi = artık.isLeapYear();
        System.out.println(artikMi);

        /*9) İki farklı tarihin ay numaralarının toplamını bulunuz*/

        LocalDate ayNo1 = LocalDate.of(2021, 9, 16);
        LocalDate ayNo2 = LocalDate.of(2011, 12, 19);
        System.out.println("toplam  ay " + ayNo1.getMonth() + ayNo2.getMonth());

        /*10) İki farklı tarih için saat farkını bulunuz*/

        LocalTime bir = LocalTime.of(12, 45, 58);
        LocalTime iki = LocalTime.of(23, 15, 28);
        Long betwen = ChronoUnit.HOURS.between(bir, iki);
        System.out.println(betwen);

/*
1) Eğer saat
i) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız
 */
        LocalTime eger = LocalTime.now();
        int hour = eger.getHour();
        if (hour > 0 && hour < 5) {
            System.out.println("uyku zamanı");
        } else if (hour > 8 && hour < 16) {
            System.out.println("calısma zamanı");

        } else if (hour > 19 && hour < 22) {
            System.out.println("aile zamanı");
        } else System.out.println("kisisel zaman");


        /*
        Ali 5 Şubat 2015 TRT 10:00'da İstanbul' da, Mark 5 Şubat 2015 12:00 EST' de ABD' de
doğmuştur. Ali'nin doğum saati ile Mark'ın doğum saati arasındaki saat cinsinden fark
nedir
         */
      LocalDateTime aliIst= LocalDateTime.of(2015,2,5,10,0);
        ZonedDateTime yerelDogumTrhAli = aliIst.atZone(ZoneId.of("Europe/Istanbul"));
      LocalDateTime markIst= LocalDateTime.of(2015,2,5,12,0);
        ZonedDateTime yerelDogumTrhMark = markIst.atZone(ZoneId.of("America/New_York"));
Long farkSaat=ChronoUnit.HOURS.between(aliIst,markIst);
        System.out.println(farkSaat);

/*
5) Mark 23.02.2018 tarihinde saat 15:25'te GMT ' de doğmuştur, Mark'ın Japonya'daki tam
doğum tarihi ve saati nedir
 */

       LocalDateTime japonya=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
       LocalDateTime gmt=LocalDateTime.now(ZoneId.of("GMT"));
Long saatfarki= ChronoUnit.HOURS.between(japonya,gmt);
LocalDateTime dogumGunuFark=LocalDateTime.of(2018,2,23,15,25).minusHours(saatfarki);
        System.out.println(dogumGunuFark);

        /*
        4) Ali 5 Şubat 2015 saat 10:15 EST'de doğmuştur, Veli 6 Mart 2015 saat 12:25 EST'de
doğmuştur. Ali ve Veli'nin doğum süreleri arasındaki fark nedir?
         */
        LocalDateTime alidogt=LocalDateTime.of(2015,2,5,10,15);
        LocalDateTime velidogt=LocalDateTime.of(2015,3,6,12,25);
        Long sureFark=ChronoUnit.MINUTES.between(velidogt,alidogt);
        System.out.println(saatfarki);
    }
}
