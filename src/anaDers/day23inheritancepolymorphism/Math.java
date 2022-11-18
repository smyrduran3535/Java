package anaDers.day23inheritancepolymorphism;

public class Math extends Courses{
  public void practice() {
      System.out.println("Solve questions");
  }
//constractur olusturalım
        public Math(){
     super("X");
          System.out.println("Constructor 1");
      }
      //constractur olusturalım
        public Math(int a ){
    this();
          System.out.println("Constructor 2");
      }
    //aynı classın ıcınde bır contructur ı kullandıktan sonta baska bir constractur kullanmak ıstıyorsak: this(); kullan

}
