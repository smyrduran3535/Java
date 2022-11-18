package anaDers.day24staticKeyWordAndcapsulation;

public class StudentRunenr {
    public static void main(String[] args) {
        Student std1 = new Student();
        System.out.println(std1.getStdId());

        System.out.println(std1.getGpa());
        System.out.println(std1.isRetired());

        std1.setStdId("AB");
        System.out.println(std1.getStdId());

        std1.setGpa(4.0);
        System.out.println(std1.getGpa());

        std1.setRetired(true);
        System.out.println(std1.isRetired());

        Student std2 = new Student();//yeni obje olusturunca eski degerlerinden baslar.
        // ıstersen bin kere degisim yapabirsin bir oble ile yeni class yapmana gerek yok
        System.out.println(std2.getGpa());
    }
}
