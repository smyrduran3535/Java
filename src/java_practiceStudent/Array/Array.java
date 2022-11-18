package java_practiceStudent.Array;

public class Array {
    public static void main(String[] args) {
         /*
        arr1={ {1,2}, {3,4,5}, {6} };
      arr2={ {7,8,9}, {10,11}, {12} };

      Yukaridaki multidimensional arraylerin ic arraylerinde ayni indekse sahip elemanlarin toplamini
    ekrana yazdiran kod.
     */

        /*int toplam=0;
        int minArrUzunluk = Math.min(arr1.length, arr2.length);

        for(int i=0;i<minArrUzunluk;i++){
            for(int k=0;k<arr1[i].length;k++){
                if(k<arr2[i].length){
                    toplam=arr1[i][k]+arr2[i][k];
                    System.out.println("Dis arraylerin "+i+". indeksi ile ic arraylerin "+ k+". indeksi toplami:" + toplam);
                }

            }
        }
*/
        int arr1 [][] = { {1,2}, {3,4,5}, {6}  }; //3 //3,0
        int arr2 [][] = { {7,8,9}, {10,11}, {12} }; //3 //
        //0      1       2
        //2. yol
        int toplam=0;
        for (int i=0; i<arr1.length;i++){
            for (int k=0;k<arr1[i].length;k++){
                for(int j=0;j< arr2.length;j++){
                    for (int m=0;m<arr2[j].length;m++){

                        if(i==j&&k==m){
                            toplam=arr1[i][k]+arr2[j][m];
                            System.out.println("Dis arraylerin "+ i+ ". indeksi ile ic arraylerin "+ k +". indeksinin toplami:"+toplam);
                        }



                    }
                }
            }
        }
    }
}
