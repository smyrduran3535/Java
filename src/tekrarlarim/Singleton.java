package tekrarlarim;

public class Singleton {
    private static Singleton instance =null;

    private String str;
    private Singleton(){
        str="Singleton ile  sadece bir nesneye ulasabiliriz";
    }
    public static Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();

        }
        return instance;
    }


    public String getStr(){
        return str;
    }
}
