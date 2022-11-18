package anaDers.day06nestedIfStatementSwitch;

public class NestedIf01 {
    public static void main(String[] args) {
        // Java; nested code ları calıştırırken cok zaman harcar. buna time complexing denir.
        // mümkünse nested if code yazmamaya calışırız. ama gerekiyorsa da kull.

      /*
      Password'un ilk harfi buyuk harf ise
     'A' olursa gecerli password aksi halde gecersiz password
     Password'un ilk harfi kucuk harf ise
     'z' olursa gecerli password aksi halde gecersiz password
       */
        //Nested (kırmızı if ici mavi if) : Ic ice gecmis demektir (zigon sehpa misali)

        String pwd1 = "Axy12!";
        if (pwd1.charAt(0) >= 'A' && pwd1.charAt(0) <= 'Z') {

            if (pwd1.charAt(0) == 'A') {
                System.out.println("Gecerli password");
            } else {
                System.out.println("Gecersiz password");
            }

        } else if (pwd1.charAt(0) >= 'a' && pwd1.charAt(0) <= 'z') {

            if (pwd1.charAt(0) == 'z') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz password");
            }

        } else {
            System.out.printf("ilk karakter harf olmalıdır");// bunu vermemişti yazdık
        }


        //2.yol

        String pwd = "5xy12!";

        char ilkHarf = pwd.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {


            if (ilkHarf == 'A') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }


        } else if (ilkHarf >= 'a' && ilkHarf <= 'z') {


            if (ilkHarf == 'z') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }


        } else {

            System.out.println("Ilk karakter harf olmalidir");

        }
    }
}


