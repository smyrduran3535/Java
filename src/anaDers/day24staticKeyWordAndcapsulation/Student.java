package anaDers.day24staticKeyWordAndcapsulation;

//encapsulation:"Data Hiding(Gizlemek)" demektir
//data yi nicin gizlersiniz? datayı dıs etkenlerden koprumak icin
//Data yi nasıl gizlersiniz? Access Modifier ini "private" yaparak gizlerim
//Data yı gizledikten sonra baska classlardan okumak istersen ne yaparsın?
// "get" metodlar olusturarak gizledigimiz dataları okunur hale getirebiliriz.get metodlara "getter" da denir
//Data yı gizledikten sonra baska classlardan degistirmek istersen ne yaparsın?
// "set" metodlar olusturarak gizledigimiz dataları degistirebiliriz
public class Student {

    public String stdName = " Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;

    //get metodlar puplic olur
    //variablenın data type ne ise; get metodun return type ı aynı olmalıdır
    //get metodları isimlendirirken "get +Variable name" ancak variablenın data tipi boolean ise "is+Variable name "
    public double getGpa() {
        return gpa;
    }

    public String getStdName() {
        return stdName;
    }

    public boolean isRetired() {
        return retired;
    }

    public String getStdId() {
        return stdId;

    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
//setlerde variablenın onune set yazılır;boolean ın onunde de is degirl set yazar
    public void setRetired(boolean retired) {//setterlar data vermez degisimi yapar bırakır
        this.retired = retired;
    }
}
