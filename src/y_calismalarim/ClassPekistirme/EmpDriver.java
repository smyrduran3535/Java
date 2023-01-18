package y_calismalarim.ClassPekistirme;

public class EmpDriver {
    public static void main(String[] args) {
Employee e=new Employee("mehmet",2000.0,45,1985);
        System.out.println(e.tax());
        System.out.println(e.increase());
        System.out.println(e.bonus());
        double totalSalary=e.salary-e.tax()+ e.bonus();
        System.out.println(totalSalary);
        System.out.println("total salary with the raise of salary :"+(e.salary+ e.increase()));
        System.out.println(e.toString());

    }
}
