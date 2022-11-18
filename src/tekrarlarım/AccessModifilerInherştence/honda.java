package tekrarlarım.AccessModifilerInherştence;

public class honda extends car{

    public String color;

    public honda(){
        super("white",54000);
        System.out.println("honda consturactur");
    }
    public honda(String color){
        this.color=color;
    }
}
