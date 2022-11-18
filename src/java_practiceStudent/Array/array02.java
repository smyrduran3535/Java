package java_practiceStudent.Array;

public class array02 {
    public static void main(String[] args) {
        /*
 {{"$12" , "$22" , "0$"},   {"£9" , "£40" , "$1" },  {"£12", "$2","$0"}}
     *  Array de $ varsa 3.2 ile carp
     *  Array de £ varsa 4.2 ile carp
     *  elemanlarin toplamini  consola yazdir. sonuc = 374.6

 */
String str[][]={{"$12" , "$22" , "0$"},   {"£9" , "£40" , "$1" },  {"£12", "$2","$0"}};
double toplam=0;

        for (String[] w:str){
           for (String k:w){
             if (k.contains("$")){
                 toplam = Double.parseDouble(k.replace("$",""))*3.2;

             }else{
                 toplam = Double.parseDouble(k.replace("€",""))*4.2;
             }
          }
        }
        System.out.println(toplam);
    }
}
