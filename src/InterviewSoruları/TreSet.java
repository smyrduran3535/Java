package InterviewSoruları;

import java.time.LocalTime;
import java.util.*;

public class TreSet {
    public static void main(String[] args) {
        /*
        tekrarsız derse ;set
        alfabetik derse;treset aklına gelsin
         */
        //example 1: 8 tane unique String eleamni alfabetik sirada depolayınız :MULAKAT MESHUR SORU
        //1.yol treeset ile
        Long start1= LocalTime.now().toNanoOfDay();
        TreeSet<String> emails= new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails);//[a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]
        Long end1=LocalTime.now().toNanoOfDay();
        System.out.println(end1-start1);//3002400 :sıralama yaptıgı icin yavas.
        //2.yol hashset ile
        HashSet<String> myEmails=new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");
        System.out.println(myEmails);//
        Long end2=LocalTime.now().toNanoOfDay();
        System.out.println(end2-start1);//3002400
//cevap; yavaslıgı cozmek icin:elemanları eklemede hashset kullanırım;tresete cevirip elemanları alfabetik yaparım
        TreeSet myEmailsSoted=new TreeSet(myEmails);//hashsette sıralama yapmadıgı icin treeset yapıyoruz
        System.out.println(myEmailsSoted);//[a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]
        Long end3=LocalTime.now().toNanoOfDay();
        System.out.println(end3-start1);

    }
    }

