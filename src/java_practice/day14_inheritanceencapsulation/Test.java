package java_practice.day14_inheritanceencapsulation;

public class Test {
private  double genislik;
private  double yukseklik;
private  double ekranBuyuklugu;
private  int maxSes=30;
private int ses=12;
private boolean guc;

public Test(double genislik,double yukseklik,double ekranBuyuklugu){
    this.ekranBuyuklugu=ekranBuyuklugu;
    this.yukseklik=yukseklik;
    this.genislik=genislik;

}
public double kanakDegidtirme(int kanal){
    switch (kanal){
        case 1:
        return 34.75;
        case 2:
            return 45.23;
        case 3:
            return 50.9;
    }
    return 0;
}
public void gucDugmesi(){
    this.guc=!guc;//kapalıysa acar acıksa kapatır
}
public int sesAzaltma(){
    if (0<ses){
        ses--;
    }
    return ses;
}
public int sesArttırma(){//maxsesden kucukse arttırılır
    if (maxSes<ses){
        ses++;
    }return ses;
}
}
