package java_practice.day16collectionsMap;

public abstract class Tse {
    //absract class da main sart degil metod yoksa
    public static void main(String[] args) {

    }
    abstract void gramaj500();//cocuklar bu kuralı saglamak zorunda
    abstract  void hijyenic();
     void odunAtesindePismeli(){
         System.out.println("odun atesinde piser");//buna butun cocuklar uymak zorunda degil override edebilirler
     }
     void undanTapilir(){
         System.out.println("undan yapılir");//buna butun cocuklar uymak zorunda degil override edebilirler
     }

}
