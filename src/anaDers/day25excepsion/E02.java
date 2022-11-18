package anaDers.day25excepsion;

public class E02 {
    public static void main(String[] args) {
        String[] arr = {"Ali", "Can", "Veli", "Han"};
        getElementFromAray(arr, 2);//veli
        getElementFromAray(arr, 0);//Ali
        getElementFromAray(arr, 4);//hata verir
    }

    //Bir String array den index girerek eleman elde edilmek icin bir metod olusturun
    public static void getElementFromAray(String[] arr, int idx) {

        try {
            System.out.println(arr[idx]);

        } catch (ArrayIndexOutOfBoundsException e) {
            //bu benim teknık olmayan acıklamam
            System.out.println("Array indexte bir problem meydana geldi");
            //detaylı tecnic mesaj
            e.printStackTrace();
            System.err.println("Array indexte bir problem meydana geldi");//renkli mesaj
            System.out.println(e.getMessage());// Index 4 out of bounds for length 4
        }
    }
}