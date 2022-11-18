package javaSlaytSorular;
import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
                   /*        //VARIABLE WORK QUESTIONS
//task: 1====> 3 farklı data türünde variable oluşturun ve bunlasrı yazdırın
        int age =25;
        System.out.println("age :"+ age);
        double say=98.45;
        System.out.println("say :" + say);
        char harf ='S';
        System.out.println("harf :" + harf);

/*task: 2====> isim ve soyisim için iki variable olusturun,bunları
                     ismiiniz: Mehmet
                    soyisminiz : Bulutluoz
                                             seklinde yazdırın*/

/*
 String isminiz= "Mehmet";
 String soyisminiz =" Bulutluoz";
        System.out.println("isminiz :"+isminiz+ "\nsoyisminiz:" +soyisminiz);
        /*task===>3 iki farklı tamsayı data turunde 2 variable olusturun bunların toplamını yazdırın
            */
        /*
        double a1= 45.89;
        int a2=98;
        System.out.println("toplam(a1+a2) :"+(a1+a2) );
     /*task===>4 bir tamsayı ve bir ondalıklı sayı oluşturun ve bunların toplamını yazdırın
     */
         /*
        float num1= 123.45f;
        byte num2=48;
        System.out.println("toplam num1+num2 :"+(num1+num2));//171.45
        //task===>5 char data türünde bir variable oluşturunn ve yazdırın
        char caracter='$';
        System.out.println("caracter :"+caracter);
        //task===>5 bir char birde tamsayı data türü oluşturun ve bunların toplamını yazd.
        int x=500;
        char sembol='$';
        System.out.println("toplam : "+ (x+sembol));//536 ascii değeri ile
        System.out.println("toplam : "+ x+sembol);//500$ */


        /*TASK==>1 Kulllanıcıdan iki tam sayı alıp bu sayıların toplam,fark ve çarpımlarını yazdırın*/
      /* Scanner scan =new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz :");//45
        int sayı1=scan.nextInt();
        System.out.println("ikinci sayıyı giriniz :");//15
        int sayı2= scan.nextInt();
        System.out.println("toplam :" +(sayı1+sayı2));//60
        System.out.println("fark :" +(sayı1-sayı2));//30
        System.out.println("çarpım :" +(sayı1*sayı2));//675

/*TASK==>2 Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını, çevresini hesaplayın */
       /* Scanner input =new Scanner(System.in);
        System.out.println("karenin bir kenar uzunluğunu giriniz :");//8
        int kenaruzunlugu = input.nextInt();
        System.out.println("karenin alanı :"+ 4*kenaruzunlugu);//32
        System.out.println("karenin cevresi :"+ 4*kenaruzunlugu);//32

 /*TASK==>3 Kullanıcıdan yarıçap isteyip çemberin cevresini ve dairenin alanını hesaplayınız*/
        Scanner sc= new Scanner(System.in);
        System.out.println("yarıçapı giriniz :");//6
        double yarıcap= sc.nextDouble();
        System.out.println("çemberin çevresi :" +2*3.14*yarıcap);//37.68
        System.out.println("dairenin alanı :" +3.14*yarıcap*yarıcap);//113.03999999999999



// *TASK==>4 kullanıcıdan dikdörtgenler prizmasının uzun,kısa kenarları ve yüksekliğini isteyip prizmanın hacmini hesl.
        /*Scanner scan =new Scanner(System.in);
        System.out.println("prizmanın uzun kenarını giriniz :");//8
        int przmaUzunKenar= scan.nextInt();
        System.out.println("prizmanın kısa kenarını giriniz :");//6
        int przmaKısaKenar =scan.nextInt();
        System.out.println("prizmanın yüksekliğini giriniz :");//10
        int przmaYükseklik= scan.nextInt();
        System.out.println("prizmanın hacmi(V) :"+przmaUzunKenar*przmaKısaKenar*przmaYükseklik);//480

        /*TASK==>5 Kullanıcıdan isim ve soyisim isteyip olusturun,bunları yazdırın
        isminiz: Mehmet
        soyisminiz : Bulut
        Kursa katılımınız alınmıştır teşekkür ederiz.
        */
     /*   Scanner scan =new Scanner(System.in);
        System.out.println("isminizni giriniz :");
        String isim =scan.nextLine();
        System.out.println("soyisminizi giriniz :");
        String soyisim= scan.nextLine();
        System.out.println("isminiz : "+isim+"\n"+"soyisim :" +soyisim);
        System.out.println("Kursa kaydınız alınmıştır teşekkür ederiz");

/*TASK==>6 Kullanıcıdan isim ve soy isim alı boşlul olşturarak yazınız
            isim - soyisim : Mehmet Bulutluoz
             */
/*Scanner input = new Scanner(System.in);
        System.out.println("isminizi giriniz :");//Mehmet
        String isim1= input.nextLine();
        System.out.println("soyisminizi giriniz :");//Bulutluoz
        String soyisim2= input.nextLine();
        System.out.println("isim - soyisim :"+ isim1 +" "+ soyisim2);//Mehmet Bulutluoz

/*TASK==>7 Kullanıcan ismini alıp isminin baş harfini yazdırın.*/
     /*   Scanner scan= new Scanner(System.in);
        System.out.println("name giriniz :");//Mehmet
        char name= scan.next().charAt(0);
        System.out.println("lastname giriniz :");//Bulutluoz
        char lastname=scan.next().charAt(0);
        System.out.println( "baş harfini yazardırın : " +name +" "+ lastname );// M B
                        //******DATA CASTING********
        /* TASK-1==> Byte veri tipinde bir deger oluşturun short,int,float ve double
        data tiplerinde birer değişken oluşt. adım adım widening yapın-yazdırır
         */
        byte a=32;
        short b=a;

        byte c=8;
        int d=c;

        byte m=12;
        long n=m;

        byte x1=45;
        double y=x1;

        /* TASK-2==>int veri türünde bir değişken oluşturun ve onu adım adım narrowing yaptırın.*/
        /*int sayı=500;
        byte sayı1=(byte)sayı;
        System.out.println(sayı);//500
        System.out.println(sayı1);//-12

        int sayı2=450;
        short sayı3=(short)sayı2;
        System.out.println(sayı2);//450
        System.out.println(sayı3);//450

        //* TASK-3===> float data turunde bir variable oluşturun ve yazdırın

        /*float nmr=989F;
        int nmr2=(int)nmr;
        System.out.println(nmr);//989.0
        System.out.println(nmr2);//989

         */
        float numeric = 15.500F;
        byte nmrc2=(byte)numeric;
        System.out.println(numeric);//15.5

        //* TASK-4===> double 255.36 sayisini int'a ve sonra da oluşturdugunuz int sayıyı byte a cevirip yazdırın
        double nmber=255.36;
        int nmber2=(int)nmber;
        System.out.println(nmber2);//255
        byte nmber3=(byte)nmber2;
        System.out.println(nmber3);//-1

        //* TASK-5===>int 2 sayıyı birbirine böldürün sonucu yazdırın
        int say10=50;
        int say11=5;
        System.out.println("sa10/sayı11 :"+say10/say11);//10

        //* TASK-6===>int bir sayıyyı double bir sayıya bölün ve sonucu yazdırın
        int p=55;
        double r=11.00;
        System.out.println("p/r :" + p/r);//5.0

        //* TASK-7===>farklı data tipleri ile işlem yapıp,sonuçlarını yazdırın
      /*  double sy1= 45.00;
        int sy2=65;
        System.out.println("toplam :"+(sy1+sy2));//110.0
        System.out.println("fark :"+(sy1-sy2));//-20.0
        System.out.println("toplam :"+(sy1*sy2));//2925.0
        System.out.println("toplam :"+(sy1/sy2));//0.6923076923076923


       */
        int s1= 456;
        byte s2=(byte)s1;
        double s3=25.2;
        System.out.println("toplam :"+(s2+s3));//-30.8
        System.out.println("fark :"+(s2-s3));//-81.2
        System.out.println("çarpım :"+(s2*s3));//-1411.2
        System.out.println("bölüm :"+(s2/s3));//-2.2222222222222223












    }
}


