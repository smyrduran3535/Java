package tekrarlarim;

public class TestSingleton {
    public static void main(String[] args) {
        //Singleton singleton=new Singleton();
       // System.out.println(singleton.getStr());
        System.out.println(Singleton.getInstance().getStr());
    }
}
