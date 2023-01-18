package y_calismalarim.OPPOyunIleOgrenme;

import javax.xml.stream.Location;
import java.util.Scanner;

public class AdventureGames {
    Player player;
    Location location;
    Scanner scan=new Scanner(System.in);
public void login(){
    Scanner scan=new Scanner(System.in);
    System.out.println("oyuna hosgeldiniz");
    System.out.println("oyuna baslamadan once isminizi giriniz");
    String playerName=scan.nextLine();
    player=new Player("a");
    player.selectCha();
    start();
}
public void start(){
    System.out.println();
    System.out.println("===================");
    System.out.println();
    System.out.println("Eylem gerceklestirmek icin bir yer seciniz");
    System.out.println("1-) Guvenli Ev--> Size ait guvenli bir mekan,dusman yok");
    System.out.println("2-) Orman --> Karsiniza belki zombi cikabilir");
    System.out.println("3-) Magara --> Karsiniza belki vampir cikabilir");
    System.out.println("4-) Nehir --> Karsiniza belki ayi cikabilir");
    System.out.println("5-) Magaza -->Silah veya Zirh alabilirsiniz");
    System.out.println("gitmet istediginiz yer :");
    int selec= scan.nextInt();
    while (selec<0||selec>5){
        System.out.println("lutfen gecerli yer seciniz");
        selec=scan.nextInt();
    }
}


}
