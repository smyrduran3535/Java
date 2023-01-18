package y_calismalarim.ClassPekistirme;

public class Employee {

    private String name = "Sumeyra";
    public double salary = 2000.0;
    public int workHours = 45;
    public int hireYear = 1985;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {

        if (this.salary < 1000) {
            System.out.println("no tax salary");
        } else if (this.salary >= 1000) {
           return salary*0.03;
        } else {
        }
        return 0.0;
    }

    public  double bonus() {
        int extraHours=this.workHours-40;
        if (extraHours>0){
            return extraHours*30;
        }
      return 0.0;
        }
        public double increase(){
        int year=2022-this.hireYear;
        if (year<10){
            return this.salary*0.5;
        } else if (year>=10&&year<20) {
            return this.salary*0.10;
        }else{
            return this.salary*0.15;
        }
        }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
