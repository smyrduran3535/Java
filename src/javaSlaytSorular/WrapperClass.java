package javaSlaytSorular;

public class WrapperClass {
    public static void main(String[] args) {

        //Kullanıcının girdiği 4 basamaklı sayının ilk ve son rakamının toplamını ekrana yazdıran bir program yazınız.


    /*   Scanner scan= new Scanner(System.in);
        System.out.println("4 basamaklı bir sayı giriniz :");
       int sayı=scan.nextInt();
       int birlerb=sayı%10;
       int onlarb=(sayı/10)%10;
       int yuzlerb= (sayı/100)%10;
       int binlerb=(sayı/1000)%10;
       int ilkBsmsk=sayı%10;
       int sonBsmk=(sayı/1000)%10;
       int toplam= ilkBsmsk+sonBsmk;
        System.out.println("toplam = " + toplam);


//Kullanıcının girdiği 3 basamaklı sayının tüm rakamlarının toplamını
//ekrana yazdıran bir program yazınız.

        System.out.println("3 basamaklı bir sayı giriniz :");//456
int sayı1=scan.nextInt();
int brlerb=sayı%10;
        System.out.println("brlerb = " + brlerb);//4
int onlrb=(sayı/10)%10;
        System.out.println("onlrb = " + onlrb);//3
int yzlerb=(sayı/100)%10;
        System.out.println("yzlerb = " + yzlerb);//2
int toplam1= brlerb+onlrb+yzlerb;
        System.out.println("toplam1 = " + toplam1);*/

//***************************increment/decrement**************************
//9) Bir int variable oluşturunuz ve bu variable’ın değerini 3 farklı yoldan
//1 artırınız

        int num = 9;
        num += 9;
        System.out.println("num = " + num);//18

        double sd = 15;
        sd = sd + 15;
        System.out.println("sd = " + sd);//30.0

        int A = 3;
        A += 3;
        System.out.println("A = " + A);//6

        int C = 99;
        C -= 25;
        System.out.println("C = " + C);//74

        float D = 1245F;
        D -= 125.00;
        System.out.println("D = " + D);//1120.0

        long s = 456L;
        s /= 36;
        System.out.println("s = " + s);//12

        int y = 9;
        y *= 9;
        System.out.println("y = " + y);//81

        int p = 8;
        p++;
        System.out.println("p = " + p);//9

        //int r=8;
        //r+; hata veriyor calışmaz

        int u = 9;
        u--;
        System.out.println("u = " + u);//8


        int numA = 2;
        int numB = 3;
        String str1 = "Çok";
        String str2 = "Çalış";
/*Aşağıdaki çıktıları ekrana yazdırmak icin program yazınız.
A) Çok Çalış B) 5 Çok C) Çalış23 D) Çok1
*/
        System.out.println(str1+" "+str2);
        System.out.println(numA+numB+" "+str1);
        System.out.println(str2+numA+numB);
        System.out.println(str1+(numB-numA));

        int n1 = 2;
        int n2= 3;
        String s1 = "Study";
        String s2 = "Hard";
        // Yukarıdaki variable’lari kullanarak ekrana “61 Study-1” yazdıran bir program yazınız.
        System.out.println((n1*n2)+""+(n2-n1)+" "+s1+(n1-n2));







    }
}
