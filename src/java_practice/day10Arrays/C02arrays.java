package java_practice.day10Arrays;

public class C02arrays {
    public static void main(String[] args) {
        //Aşağıdaki mutli dimensional array'lerin iç array'lerinde
// aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
// int arr1[][] = {{1, 2}, { 3, 4, 5},{6}};
// int arr2[][] = {{7, 8,9},{10,11 }, {12}};


        int sinir = 0;
        int toplam = 0;
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        if (arr1.length <= arr2.length) {


            for (int i = 0; i < arr1.length; i++) {//icerdekini lengtşnş aldık
                sinir = arr1[i].length;//ic arrayların uzunluguna kadar aldık
                if (arr1[i].length > arr2[i].length) {//icerde oldugumuz icin, i. ci indexine bakıyoruz
                    sinir = arr2[i].length;
                }

                for (int j = 0; j < sinir; j++) {
                    toplam = arr1[i][j] + arr2[i][j]; // katlarin esitlendikten sonra toplamlari icin
                    System.out.println(i + "," + j + "indexindeki elemanlarin toplami" + toplam);
                }
            }
        }else {
            for (int i = 0; i < arr2.length; i++) {  // arr1 kopyasi 2 ye cevir
                sinir = arr1[i].length;
                if (arr1[i].length > arr2[i].length) {
                    sinir = arr2[i].length;
                }
                for (int j = 0; j < sinir; j++) {
                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println(i + "," + j + "indexindeki elemanlarin toplami" + toplam);
                }


            }
        }
    }
}