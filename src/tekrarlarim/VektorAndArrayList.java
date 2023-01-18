package tekrarlarim;

import java.util.Vector;

public class VektorAndArrayList {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        System.out.println("Size: " + vector.size()); // 0
        System.out.println("Capacity: " + vector.capacity()); // 10

        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
        vector.add("5");
        vector.add("6");
        vector.add("7");
        vector.add("8");
        vector.add("9");
        vector.add("10");
        vector.add("11");

        System.out.println("------------------");

        System.out.println("Size: " + vector.size()); // 11
        System.out.println("Capacity: " + vector.capacity()); // 20

        System.out.println("yeni vektor ");

        Vector<String> vector1 = new Vector<>();

        vector1.add("1");
        vector1.add("2");
        vector1.add("3");
        vector1.add("4");
        vector1.add("5");
        vector1.add("6");
        vector1.add("7");
        vector1.add("8");
        vector1.add("9");
        vector1.add("10");
        vector1.add("11");
        System.out.println(vector1.size());
      // vector1.forEach(System.out::println);

        System.out.println("------------------");

        vector1.add(5, "yeni kayıt");
        System.out.println(vector1.remove(5));
        vector1.forEach(System.out::println);

    }
}
