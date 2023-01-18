package y_calismalarim.Array;

public class IkiArrayTopl {
    public static void main(String[] args) {


        int[][] arr1 = {{0, 2, -1}, {3, 8, 9}, {7}};
        int[][] arr2 = {{-7, 6, -9}, {0, 12}, {19}};
        int sum1 = 0;

        for (int i = 0; i < arr1.length ; i++) {// arrayin uzunlugu icin
            for (int j = 0; j < arr1[i].length; j++) { // {} icerdekiler icin sırayla bakar
                sum1+=arr1[i][j];
            }
        }
        System.out.println("sum1 = " + sum1);
        int sum2=0;
        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j < arr2[i].length ; j++) {
                sum2+=arr2[i][j];
            }
        }
        System.out.println("sum2 = " + sum2);
        System.out.println("arr1 ile arr2 elemanlari toplami :" +(sum1+ sum2));
        }
    }
