package ycalısmalarım.Static;

public class C04 {
    public static void main(String[] args) {
        for (int i = 0; i <=4 ; i++) {
            for (int j = 0; j <=11 ; j++) {
                if ((i==0&&j==11)||(i==1&&(j==0||j==10))||(i==2&&(j==0||j==10))||(i==3&&(j==0||j==10))){
                    System.out.print("a");
                }else System.out.print("");
            }
        }
        System.out.println();
    }
}
/*
aaaaaaaaaaaaa
a           a
a           a              cozum olmadı
aaaaaaaaaaaaa
 */









