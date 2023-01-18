package anaDers.day32Maps;

import java.util.Arrays;

public class EnamRunner {
    public static void main(String[] args) {
        String capital=UsStates.CALIFORNIA.getCapital();
        System.out.println(capital);

        String abb=UsStates.CALIFORNIA.getAbbreviation();
        System.out.println(abb);
        //Enum icine birden fazla data koyabiliriz
        //Enum icindeki datalara getter lar sayesinde ulasilabilir

        String state = UsStates.getStateNameFromAbbreviation("FL");
        System.out.println(state);

        String capitall=UsStates.getStateNameFromCapital("Denver");
        System.out.println(capitall);

        String capitallAbb=UsStates.getStateNameFromCapital("Atlanta");
        System.out.println(capitallAbb);
    }


}
