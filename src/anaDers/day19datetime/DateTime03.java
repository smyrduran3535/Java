package anaDers.day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {
        //Example 1:japonya ile almanya arasındaki zamanfarkını saat hesaplayan kodu yaz
        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long fark = ChronoUnit.HOURS.between(germany, japan);
        System.out.println(fark);


        //sabit bir tarih olusturunuz
        LocalDate myDate = LocalDate.of(2011, Month.APRIL, 13);
        System.out.println(myDate);
        //bu tarz depolara inam diyooruz
        /*
        javada sabit dataları (gun ısımlerı ay ısımlerı abd eyalet isimleri gibi) depolamak ve gerektiginde kullanmak icin depolar olustururuz.
        bu depolara "Enum" denir
         */
        //Example 3: USA icin "Woow" ,UK icin "Big", "CANADA icim "Cold", TURKEY icin "Vatan,GERMANY icin "Araba, RWANDA icin "Cay" yazın

        Countiries country = Countiries.USA;
        switch (country) {
            case USA:
                System.out.println("Waaw");
                break;
            case UK:
                System.out.println("Big");
                break;
            case TURKEY:
                System.out.println("vatan");
                break;
            case GERMANY:
                System.out.println("ARABA");
                break;
            case RWANDA:
                System.out.println("CAY");
                break;
            default:
                System.out.println("tanımlanmamıs ulke");

        }
    }
}