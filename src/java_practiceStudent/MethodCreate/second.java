package java_practiceStudent.MethodCreate;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pozitif sayı");
        int sayi= input.nextInt();
        System.out.println("Girdi:"+sayi+"\n"+"Cıktı:"+powerOFthree(sayi));
    }
    public static boolean powerOFthree(int sayi){//sayı=2 olunca 3 e esit olmayıca dongu calısmayacak false verecek*******2222222222222222222q1q3,9,27,81
        boolean b=false;
        int carpma=1;
        for (int i = 1; i <sayi ; i++) {
            carpma*=3;
            if (carpma==sayi){
                b=true;
                break;
        }
        }return b;
    }
}
