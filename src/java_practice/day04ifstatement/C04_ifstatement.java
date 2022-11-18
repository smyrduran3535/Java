package java_practice.day04ifstatement;

import java.util.Scanner;

public class C04_ifstatement {
    public static void main(String[] args) {
          /*
    Print "Lutfen is unvaninizi girin
    jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
    Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin.
    Example :
    Eger jobTitle  qa ise print is unvaniniz Quality Analyst
    test data: qa ise print Quality Analyst
    dev ise print Developer
    ba ise print Business Analyst
    pm ise print Project Manager
   */
        Scanner input= new Scanner(System.in);
        System.out.println("ünvanınzı giriniz");
        String jobTitle=input.nextLine().toLowerCase();
        if(jobTitle.equalsIgnoreCase("qa")){
            System.out.println("Quality Analyst");
        }else if(jobTitle.equalsIgnoreCase("dev")){
            System.out.println(" Developer");
        }else if(jobTitle.equalsIgnoreCase("ba")){
            System.out.println("Business Analyst");
        }else if (jobTitle.equalsIgnoreCase("pm")) {
            System.out.println("Project Manager");
        }else System.out.println("doğru giriş yapınız");
    }
}
