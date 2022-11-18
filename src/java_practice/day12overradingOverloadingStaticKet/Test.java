package java_practice.day12overradingOverloadingStaticKet;

import java.util.Scanner;

public class Test {
    //Kullanici A Ayse ; kullanici B Burak ismini data olarak girerse cikti ne olur?
    String studentName;
    String year = "2020";
    static int counter = 1000;
    String studentId;

    public Test() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        studentName = scan.next();
        setStudentId();
    }

    public static void main(String[] args) {
        Test student1 = new Test();
        System.out.println(student1.studentName + student1.studentId); //A

        Test student2 = new Test();
        System.out.println(student2.studentName + student2.studentId); //B
    }

    public void setStudentId() {
        counter++;
        this.studentId = year + "" + counter;
    }
}