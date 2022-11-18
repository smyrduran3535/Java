package java_practice.day12overradingOverloadingStaticKet;

public class Runner {
    public static void main(String[] args) {
        surekliIsciler ahmet=new surekliIsciler();
        ahmet.mesai();
        //surekli isciler ne zaman cagrilsa calisirlar
        isci sum=new isci();
        sum.mesai();

    }
}
