package anaDers.day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //example 1:javadan aldıgınız date 'ı ay/ gun/ yıl olarak yazınız
        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");//"MM 10 dan kucuk ayları 01,02,03 seklinde yazar
        String formattedDate=dtf.format(currentDate);
        System.out.println(formattedDate);

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MMM/dd/yyyy");//ayın ilk uc hatfını verdı
        String formattedDate2=dtf2.format(currentDate);
        System.out.println(formattedDate2);


        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("MMMM/dd/yyyy");//ayın hepsını yazdırır verdı
        String formattedDate3=dtf3.format(currentDate);
        System.out.println(formattedDate3);


        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("M/dd/yyyy");//ayın hepsını yazdırır verdı
        String formattedDate4=dtf4.format(currentDate);//"M" 10 dan kucuk ayları 1,2,3 seklinde yazar
        System.out.println(formattedDate4);


        DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("MMMM/dd/yy");//yılın son ıkısını yazdırır
        String formattedDate5=dtf5.format(currentDate);
        System.out.println(formattedDate5);


        DateTimeFormatter dtf6=DateTimeFormatter.ofPattern("MMMM/d/yyyy");//"d "10 dan kucuk gunlerı 1,2,3 seklinde yazar. 01,02,03 yazmaz
        String formattedDate6=dtf6.format(currentDate);
        System.out.println(formattedDate6);

        //example 2 : javadadn aldıgınız time ın formatını degıstırınız

      LocalTime myTime= LocalTime.of(16, 23, 54, 2345);
        System.out.println(myTime);

        DateTimeFormatter dtf7=DateTimeFormatter.ofPattern("HH:mm");
        String formattedMyTime1=dtf7.format(myTime);
        System.out.println(formattedMyTime1);

        DateTimeFormatter dtf8=DateTimeFormatter.ofPattern("HH:mm a");
        String formattedMyTime2=dtf8.format(myTime);
        System.out.println(formattedMyTime2);


    }
}
