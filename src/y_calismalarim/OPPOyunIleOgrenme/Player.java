package y_calismalarim.OPPOyunIleOgrenme;

import java.util.Scanner;

public class Player {

    private int damage, healthy, money;
    private String name, character;
    Inventory inv;  //canta
    Scanner scan = new Scanner(System.in);
public void initPlayer(String name,int damage,int healthy,int money){
    setName(name);
    setDamage(damage);
    setHealthy(healthy);
    setMoney(money);
}
    public void selectCha() {
        switch (chaMenu()){
            case 1:
               initPlayer("Samuray", 7,18,20);
                break;
            case 2:
                initPlayer("Okcu",5,21,5);
                break;
            case 3:
                initPlayer("Sovalye",8,24,5);
                break;
            default://hata olunca bunu versin
                initPlayer("samuray",7,18,20);
                break;

        }
        System.out.println("karakter :"+"\n"+getName()+" ;Hasar "+getDamage()+" ,Saglık :"+getHealthy()+" ,para :"+getMoney());
    }

    public int chaMenu() {
        System.out.println("lutfen bir karacter seciniz");
        System.out.println("1-) -Samuray ->\tHasar :5\tSaglık :21\tPara :15");
        System.out.println("2-) -Okcu    ->\tHasar :7\tSaglık :18\tPara :20");
        System.out.println("3-) -Sovalye ->\tHasar :8\tSaglık :24\tPara :5");

        int secimCha = scan.nextInt();

     while (secimCha<1||secimCha>3){
         System.out.println("lutfen gecerli bir karakter giriniz");
         secimCha=scan.nextInt();
     }
        return secimCha;
    }

    public Player(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

}
