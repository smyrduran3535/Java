package calısmalarım_kitap_youtobe.For;

public class kitaptan {
    public static void main(String[] args) {

        int k,m;
        System.out.println("dongu basladı");
        for ( k=0,m=10;k<m;k++,m--) {
            System.out.println(k+"degeri "+ m +" .den kucuktur");
       }

        int i=1;
        for (char j = 'a'; j <='e' ; j++) {
            System.out.println("Alfabenin "+ i+ ".harfi = "+ j);
            i++;
        }
        //for each
        int []dizi={1,2,3,4,5,};
        for (int w:dizi) {
            System.out.print(w);

        }

        int[] dizi1 =new  int[5];

        for (int q=0; q<5;q++) {
            dizi1[q]=3*q+q*q;
        }
        int y=1;
        for (int i1 : dizi1) {
            System.out.println("dizisinin"+y+". elemanı ="+i);
            y++;
        }

        }


        }


