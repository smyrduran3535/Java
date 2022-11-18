package java_practiceStudent.Array;

public class C03Array {
    /*
              Verilen diziler ile:
           String [] names = {"Anna", "Nancy", "Sarah"};
            int [] scores = {90, 75, 80};
            char [] grades = new char[names.length];
        1. öğrencilerin notlarını notlar adlı dizide saklayabilecek bir program yazınız.
        2. Her öğrencinin not raporunu ayrı satırlarda yazdırın
            Ex:
               Anna'nın puanı 90 ve notu A
   */
    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length]; // char[] grades = {'A', 'B', 'C'};

        for(int i = 0; i < scores.length; i++){
            if(scores[i]<=100 &&  scores[i]>=90){
                grades[i] = 'A';
            } else  if(scores[i]<90 &&  scores[i]>=80){
                grades[i] = 'B';
            } else  if(scores[i]<80 &&  scores[i]>=70){
                grades[i] = 'C';
            }
        }

        for(int j=0; j<scores.length; j++){
            System.out.println(names[j] + " " + scores[j] + " " + grades[j]);
        }

        // Anna 90 A
        //Nancy 75 C
        //Sarah 80 B

    }
}
