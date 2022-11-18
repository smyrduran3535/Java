package java_practice.day16collectionsMap;

public class EnamRunner {
    public static void main(String[] args) {
        Level oyun=Level.HIGH;
        switch (oyun){
            case HIGH:
                System.out.println("zor seviyede bir oyun,");
                break;
            case LOW:
                System.out.println("Dusuk seviyede bir oyun");
                break;
            case MEDIUM:
                System.out.println("Orta seviyed bir oyun");
                break;
        }
    }
}
