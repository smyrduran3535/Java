package y_calismalarim.Array;

import java.util.Arrays;

public class StringCarp {
    public static void main(String[] args) {

        /*
        String 2 D Array olustur
        {{ "$12","$22","0$" },{ "€9","€40","€1"},{ "€12","€2","€0"}}
        string de € varsa 3.2 ile carp
        string de $ varsa 4.2 ile carp
        elemanlarin toplamini doble olarak yazdir

         */

      String[][] str= {{ "$12","$22","0$" },{ "€9","€40","€1"},{ "€12","€2","€0"}};
      int toplam=0;
        for (int i = 0; i <str.length ; i++) {
            for (int j = 0; j <str[i].length ; j++) {
                if (str[i][j].contains("$")){
                   toplam+=Double.parseDouble(str[i][j].replace("$",""))*3.2;

                }else{
                    toplam+=Double.parseDouble(str[i][j].replace("€",""))*4.2;
                }
            }

        }
        System.out.println(Arrays.deepToString(str));//
        // [[$12, $22, 0$], [€9, €40, €1], [€12, €2, €0]]
        System.out.println("toplam ="+toplam);

    }
}
