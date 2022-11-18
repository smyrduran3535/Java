package java_practiceStudent.MethodCreate;

public class dongu {
    public static void main(String[] args) {
        yazdır(1);
    }
    public static void yazdır(int sayi){
        if (sayi<100){
            System.out.print(sayi+" ,");
            yazdır(sayi+1);
        }
    }
}
