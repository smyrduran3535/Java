package anaDers.day10StringManupulation;

public class DoWhileLoop {

    public static void main(String[] args) {
        int i = 1;
        while (i < 1) {//false oldugu için calışmaz.
            System.out.println("While Loop");
            i++;
        }
/*
while loop bazı durumlarda hiç çalışmama ihtimali vardır.yani while loop için zero executıon mümkündür.
 */

        int k = 1;
        do {
            System.out.println("do while loop");//do while loop: dow.l. da ise aynı işlem calısır yazdırır. whileden farkı budur.zero execution mümkün değil.
            // içindeki kod her halükarda en az bir kere calışır.yani;
            // do w.l. için zero execution mümkün değildir.do w.l. önce hareket eder sonra şart doğru mu diye düşünür

            k++;
        } while (k < 1);


        //Ex 1: bir ondalık sayının ondalık kısmındakı rakamları topl.bul :split kullancaz ama stringe ceviricez önce
        double num=24.5673;
        String str =String.valueOf(num);//parantezin içine konulandatanın tipini string yapar.valueof sadece datayı cevirir
        System.out.println(str);// string date type oldu.artık spliti kullanabiliriz
        String decimalPart=str.split("\\.")[1];//5673===>>>regex için nokta kullandıgımızda önüne \\ koy. yani nokta su sekilde kull. "\\."

        int decimalInt=Integer.valueOf(decimalPart);//5673

        //do ile;
        int sum=0;
        do {
            sum = sum + decimalInt % 10;//son rakamı alır      3  +  7  + 6 +   5 =21

            decimalInt = decimalInt / 10;//                   567   56   5   0


        } while (decimalInt>0);
        System.out.println(sum);//21

    }
}
