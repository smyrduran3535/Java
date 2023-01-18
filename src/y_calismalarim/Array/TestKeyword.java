package y_calismalarim.Array;

public class TestKeyword {
    public static void main(String[] args) {
/*
ogrencilerin test sonuclarını degerlendiren Java kodunu method kullanarak yaziniz
ogrencilerin cevaplari:
char[][] answer={
{'A','B','A','C','C','D','E','E','A','D'}
{'D','B','A','B','C','A','E','E','A','D'}
{'E','D','D','A','C','B','E','E','A','D'}
{'C','B','A','E','D','C','E','E','A','D'}
{'A','B','D','C','C','D','E','E','A','D'}
{'B','B','E','C','C','D','E','E','A','D'}
{'B','B','A','C','C','D','E','E','A','D'}
{'E','B','E','C','C','D','E','E','A','D'}};

Cevap Anahtari:
char[] keys={'D','B','D','C','C','D','A','E','A','D'};

output:
1 nolu ogrencinin 7 dogru cevabi var.
2 nolu ogrencinin 6 dogru cevabi var.
   "      "         "        "
   "      "         "        "
   "      "         "        "
8 nolu ogrencinin 7 dogru cevabi var.

 */
        char[][] answer={
                {'A','B','A','C','C','D','E','E','A','D'},
                {'D','B','A','B','C','A','E','E','A','D'},
                {'E','D','D','A','C','B','E','E','A','D'},
                {'C','B','A','E','D','C','E','E','A','D'},
                {'A','B','D','C','C','D','E','E','A','D'},
                {'B','B','E','C','C','D','E','E','A','D'},
                {'B','B','A','C','C','D','E','E','A','D'},
                {'E','B','E','C','C','D','E','E','A','D'}};

        char[] keys={'D','B','D','C','C','D','A','E','A','D'};


        testSonucu(answer, keys);


    }

    private static void testSonucu(char[][] answer, char[] keys) {
        int count=0;
        for (char i = 0; i <answer.length ; i++) {//her bir ogrenciye bakar...
            count++;//her bir ogrencinin dogru cevabını sayacagı icin sayac burda
            for (char j = 0; j <answer[i].length; j++) {//her bir ogrencinin cevap anahtarına bakar...j: ogrenci cevapları
                if (answer[i][j]==keys[j]){//ogrenci cevaplari j oldugu icin keys de j ile
                }
            }
            System.out.println(i+1 + " nolu ogrencinin "+ count+ "dogru cevabi var.");
        }

    }


}
