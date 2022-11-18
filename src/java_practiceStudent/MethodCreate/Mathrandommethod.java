package java_practiceStudent.MethodCreate;

import java.util.Scanner;

public class Mathrandommethod {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen 2 sayıyı gırınız");
        int x=scan.nextInt();
                int y=scan.nextInt();
                rastgele(x,y);
    }
    public static void rastgele(int a,int b){
        int counterA=0;
        int counterB=0;

        for(int i=0;i<1000;i++){
           int sayi= (int) (Math.random()*1000);
           if (sayi==a){
               counterA++;
           } else if (sayi==b) {
               counterB++;
           }

        }
        System.out.println(a+"sayısı"+ counterA+"defa girdi");
        System.out.println(b+"sayısı"+ counterB+"defa girdi");
    }
}
