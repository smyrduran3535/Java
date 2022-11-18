package java_practiceStudent.Array;

public class C02Array {
    /*
        Bir derslerin oldugu array olusturun ve elemanlarını ters çevirip ekrana yazdırınız.
             ex:
                arr = {java, python, c#}

            output:
               avaJ
               nohtyp
               #c
   */
    public static void main(String[] args) {

        String[] arr = {"java", "python", "c#"};

        for (int i = 0; i < arr.length; i++) {
            String reverse = "";
            for (int j = (arr[i].length()-1); j >= 0 ; j--){
                reverse += arr[i].charAt(j);
            }
            System.out.println(reverse);
        }

        // avaj
        //nohtyp
        //#c


    }

}
