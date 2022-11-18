package InterviewSoruları;

public class LinkedList {
    public static void main(String[] args) {

//%99 collctionslardan soru gelir

        //Example 1: "A" ile baslayan tum isimleri "*****" e ceviriniz
        java.util.LinkedList<String> students = new java.util.LinkedList<>();
        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");
        System.out.println(students);

        for (String w : students) {
            if (w.startsWith("A")) {
                students.set(students.indexOf(w), "*****");

            }
        }
        System.out.println(students);//[Chris, *****, Mark, Tom, Jeremy, Hans]

        //example 2:Listteki 4 harften cok harf iceren isimleri siliniz: ====>>>>>intw.sorusu
        //eleman sayısını azalttıgımız icin i'ye ihtiyac duyarız.o yuzden for each loop degil for loop kullanıyoruz.
        for (int i=0;i<students.size();i++){//eleman sayısına ihtiyacımız oldugu icin for loop kullanıyoruz
            if (students.get(i).length()>4){
                students.remove(students.get(i));
                i--;
            }
        }
        System.out.println(students);//[Mark, Tom, Hans]
    }
}
