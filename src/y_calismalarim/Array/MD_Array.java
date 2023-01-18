package y_calismalarim.Array;

public class MD_Array {




        public static void main(String[] args) {

/*
Girilen Multidimensional Arraydeki cift sayilari toplayan bir method yaz
INPUT: {{1,3,6},{2,8},{5,7,9,14}}
OUTPUT : Arraydeki cift sayilarin tpolami : 30
 */
            //1.yol:
            int[][] arr={{1,3,6},{2,8},{5,7,9,14}};
            int sum=0;

            for (int i = 0; i <arr.length ; i++) {
                for (int j = 0; j <arr[i].length ; j++) {
                    if (arr[i][j]%2==0){
                        sum+=arr[i][j];
                    }
                }

            }
            System.out.println("sum = " + sum);//31

            //2.yol:
            ciftleriTopla(arr);
            System.out.println(" ciftleriTopla(arr) = " +  ciftleriTopla(arr));//30

        }

        private static int ciftleriTopla(int[][] arr) {
            int toplam = 0;
            for (int[] w:arr){
                for (int k:w){//icerdeyiz artik boyutlar yok
                    if (k%2==0){
                        toplam+=k;
                    }
                }
            }

            return toplam;

        }
    }



































