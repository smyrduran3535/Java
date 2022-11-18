package java_practiceStudent.forLoop;

public class C02ForLoop {
    public static void main(String[] args) {
        //bir sitringi tersine cevirmek icin kod yazınız
        String s="Mark";
        String r="";
        for (int i = s.length()-1; i>-1 ; i--) {
            r=r+s.substring(i,i+1);

        }
        System.out.println(r);

//2.yol:stringBuilder
        String t="Mark";
        StringBuilder sb=new StringBuilder(t);
        System.out.println(sb.reverse());//kraM








    }
}
