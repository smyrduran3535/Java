package java_practice.day12overradingOverloadingStaticKet;

public class student {
    String name="";
    static String college="UNF";
    student(String n,String college) {
        this.name=n;
        this.college=college;
    }

    public static void main(String[] args) {
student s1=new student("Mark","UCF");
student s2=new student("Fahri","UCF");
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.college);
        System.out.println(s2.college);
    }
}
