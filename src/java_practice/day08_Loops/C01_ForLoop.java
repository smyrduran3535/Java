package java_practice.day08_Loops;

public class C01_ForLoop {
    public static void main(String[] args) {
        ////Kullanicidan baslangic , bitis ve artis miktarini alarak
        //// aradaki tum sayilari aralarina virgul koyarak yazdirin
       /* int baslangıc=1;
        int bitis=40;
        for (int i = baslangıc; i <=bitis ; i++) {
            System.out.print(i+","+" ");
        }


        */
        int baslangıc=10;
        int bitis=50;
        int artısMiktari=5;
        for (int i = baslangıc; i <=bitis ; i+=artısMiktari) {
if (i<bitis){
    System.out.print(i+",");
}else System.out.print(i);//10,15,20,25,30,35,40,45,50

        }







    }
}
