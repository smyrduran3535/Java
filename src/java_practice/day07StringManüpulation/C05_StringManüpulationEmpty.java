package java_practice.day07StringManüpulation;

public class C05_StringManüpulationEmpty {
    public static void main(String[] args) {

        String str1="Hi";
        System.out.println(str1.isEmpty());

        String str2="";
        System.out.println(str2.isEmpty());
        String str3=" ";
        System.out.println(str3.isEmpty());//dolu

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        String str4="java ";
        if(str4.isEmpty()){
            System.out.println("boşluk var");
        }else System.out.println("değil var");

        if(str4.contains(" ")){
            System.out.println("boşluk var");
        }else System.out.println("değil ");

    }
}
