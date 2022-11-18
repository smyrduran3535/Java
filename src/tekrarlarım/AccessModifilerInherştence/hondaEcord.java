package tekrarlarım.AccessModifilerInherştence;

public class hondaEcord extends honda{
    public int price;
    public int years;
    public String make;
    public String model;

    public hondaEcord(){//constructur yazmasaydık gorunmez consturactor vardı yazınca gorunur oldu:gorunmez consturactur:defoult consturactur denir

    }
    public hondaEcord(int price){
this.price=price;

    }
    public hondaEcord(int price,int years){

        this.years=years;
        this.price=price;
        System.out.println("honda acord constractur");
    }
    public hondaEcord(int price,int years,String make,String model){
        this.price=price;
        this.years=years;
        this.model=model;
                this.make=make;
    }
}
