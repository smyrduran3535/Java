package y_calismalarim.Array;

public class ForEach01 {
    public static void main(String[] args) {
         /*
       String[] str={"fruits","vegatables","meat","milk"};
       print array with for each
       print length of each element
       Part 2:
       print all the elements from array using for eachloop
       ıf an element starts with 'v' then quit the loop
        */
        String[] str={"fruits","vegatables","meat","milk"};
        for (String w:str){
            System.out.println(w+" : uzunluk "+w.length()+" " );
        }
        System.out.println();
        for (String k:str){
            if(k.startsWith("v")){
                break;

            }
            System.out.println(k);
        }
    }
}
