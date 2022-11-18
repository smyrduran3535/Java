package anaDers.day05IfStatement;


import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //example : kullanıcı gün numarasını girsin code gün ismini yazsın
        // 2==>pazartesi          5===>perşembe
        Scanner input = new Scanner(System.in);
        System.out.println("gün numaranızı giriniz ");
        byte gunNo= input.nextByte();
        if(gunNo==1) {
            System.out.println("pazar");
        } else if(gunNo==2){
            System.out.println("pazartesi");
        } else if(gunNo==3) {
            System.out.println("salı");
        }   else if(gunNo==3) {
            System.out.println("carsamba");
        } else if(gunNo==4) {
            System.out.println("persembe");
        } else if(gunNo==5) {
            System.out.println("cuma");
        } else if(gunNo==6) {
            System.out.println("cumartesi");
        }else if (gunNo==7) {
            System.out.println("pazar");
        }else System.out.println("gecerli bir gün numarası gir");
    }
}
