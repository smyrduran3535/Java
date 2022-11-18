package anaDers.day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {
        //example1: "anlık tarihi" ekrana yazdıran kodu yazınız

        LocalDate currentDate = LocalDate.now();//new keywordu kullanmadan donusturme
        //bulundugun mekandaki anlık tarihi bana ver demek
        System.out.println(currentDate);//2022-10-21

        //example 2: anlaık zaman :
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);//20:41:30.950440500

        //"anlık tarihi" ve "anlaık zaman" ekrana yazdıran kodu yazınız
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-10-21T20:45:28.597294500

        //example 4:japonyadaki anlık tarıhı ve anlık zamani ekrana getiren kodu yazınız
        LocalDateTime currentDateTimeInJaponya = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJaponya);

        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);

        //example:6 : bugunden 789 gun sonra emeklı olacagınıza gore emklilik tarihini hesaplayan kodu yazınız
        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate currentDate2 = LocalDate.now();
        LocalDate retireDte = countDate.plusDays(789);//her zaman da calısır
        System.out.println(retireDte);


        //2 cocugunuzun dogum tarihleri arasındakı farkı gun olarak hesaplatan kodu yazınız
        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);

        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);//long verir: ıkı zamanın farkı milyarı gecebilir
        System.out.println(diff);//2824: betwen metodunda sıra onemli yoksa eksi verir.en eski tarih once yazılmalıdır
        //betwen kronometrenın ıcınde

        //ex 8 : tom ali den 3 yıl 8 ay 13 gun sonra doggu. ali ise veliden 1 yıl 15 gun once dogdu.
        // tomun dogum tarıhı 18 Kasım 2011 ise veli ve Alinin dogum tarşhlerını bulunuz

        //Example 8:Istanbul'un fethi ile cumhuriyetin kurulması arasında kac ay oldugunu gosteren kodu yazınız
        LocalDate ist = LocalDate.of(1453, 5, 29);
        LocalDate cum = LocalDate.of(1923, 10, 29);
        Long fark = ChronoUnit.MONTHS.between(ist, cum);
        System.out.println(fark);


        //Example 9: verilen tarihin hangi burcta oldugunu gosteren kodu yaz
    }

}
