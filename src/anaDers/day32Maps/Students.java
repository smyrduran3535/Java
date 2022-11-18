package anaDers.day32Maps;

public class Students {
    public String name;//deger ataması yapmazsak
    public String email;
    public int age;
    public boolean success;
    public Students(String name, String email, int age, boolean success) {//bu constructur ogrenci olust dınamıc yapar
        this.name = name;
        this.email = email;
        this.age = age;
        this.success = success;

    }
    @Override
    public String toString() {///obje hakkındakı tum methodları tostring yazdırır
        return "Students[" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", success=" + success +
                ']';
    }


}
