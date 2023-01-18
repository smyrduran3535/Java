package calısmalarım_kitap_youtobe.MethodOlusturma;

public class delta {


    static double delta;
    public static void main(String[] args) {
        kokBul(1,0,-9);
    }
    static void kokBul(int a,int b,int c){
        delta=b*b-4*a*c;
        if (delta>0){
            double x1=((-b-Math.sqrt(delta))/(2*a));
            double x2=((-b+Math.sqrt(delta))/(2*a));
            System.out.println("2 kok var"+x1+"ve"+x2);
        } else if (delta==0) {
            double x1=(-b)/(2*a);
            System.out.println("1 kok var :"+x1);
        } else if (delta<0) {
            System.out.println("joj yok");

        }

    }

}
