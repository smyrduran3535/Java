package java_practice.day12LocalDateTimeOverLoadingVarargs;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class C02LocalDateTime {
    public static void main(String[] args) {
        /* Tom 29 Ekim 1923 tarihinden 45 yil 8 ay 5 gun sonra dogdu.
   Veli 15 Eylul 1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
   Tom ve Veli'nin dogum tarihini hesaplayan kodu yazıniz.
   Tom ve Veli'nin dogum tarihlerinin aynı olup olmadığını kontrol eden kodu yazıniz.
 */
        LocalDate dogTom= LocalDate.of(1923, Month.OCTOBER,29).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println(dogTom);
        LocalDate dogVeli= LocalDate.of(1993,Month.SEPTEMBER,15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(dogVeli);
        boolean ayniMi=dogTom.equals(dogVeli);
        System.out.println(ayniMi);//true

        //Iki saat dilimi arasindaki farki hesaplama

//Japonya ile Almanya arasindaki saat farkini saat cinsinden hesaplatan kodu yaziniz
        LocalDateTime farkjaponya=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime farkalmanya=LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        long fark= ChronoUnit.HOURS.between(farkjaponya,farkalmanya);
        System.out.println(fark);
//tarih 2022-10-31 ve saat 03,26,00pm oldugunda asagıdakı kodu yaz calıstır
        LocalTime time=LocalTime.now();
        DateTimeFormatter dft=DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dft.format(time.plusHours(2)));

        DateTimeFormatter dft2=DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dft2.format(time.minusHours(1)));

        DateTimeFormatter dft3=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dft3.format(time.minusHours(1)));

        //gun ay yıl
        LocalDate date=LocalDate.now();
        DateTimeFormatter dft4=DateTimeFormatter.ofPattern("dd-MMM-yy");
        System.out.println(dft4.format(date));

        DateTimeFormatter dft5=DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(dft5.format(date));

        LocalTime date1=LocalTime.now();
        DateTimeFormatter dft6=DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(dft.format(date1.plusHours(2)));









    }
}
