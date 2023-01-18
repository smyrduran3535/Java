package ssg.Mr.CihanArrays.loop;

public class Nested03 {
    public static void main(String[] args) {

        // soru 6 Asagidaki sekil cizen kodu yaziniz
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */
        ustYildiz();
        altYildiz();
//icice loop hali ile

    }

        public static void ustYildiz () {

            for (int i = 1; i <= 5; i++) {

                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");

                }
                System.out.println("");

            }


        }

        public static void altYildiz () {
            int input = 5;
            for (int i = 1; i <= input - 1; i++) {

                for (int j = 1; j <= input - i; j++) {
                    System.out.print("* ");

                }
                System.out.println("");

            }

        }
    }

