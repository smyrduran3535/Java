package ssg.Mr.CihanArrays;

public class Arrays02 {
    public static void main(String[] args) {

        String arr1[]={"Ali", "Veli","Ayse"};

        //length
        System.out.println(arr1.length);//3

        // Ali Ayse
        System.out.println(arr1[0]+ " " + arr1[arr1.length-1]);//Ali Ayse


        int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};

        for(int w: array){
            System.out.print(w +" ");
        }
        System.out.println("=========");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] +" ");
        }






    }
}
