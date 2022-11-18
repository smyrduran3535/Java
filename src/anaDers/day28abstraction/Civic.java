package anaDers.day28abstraction;

public class Civic implements Engine,Ac,Hood { //bir classı bir interface'in Child'ı yapmak istiyorsanız "implements" kull.

    @Override
    public void eco() {
        System.out.println("Uses eco engeine");
    }

    @Override
    public void gas() {
        System.out.println("Uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("Uses tsi engine");
    }

    @Override
    public void digital() {

    }

    @Override
    public void climate() {

    }

    @Override
    public void steel() {
        System.out.println("Hood is made by steel");
    }
}


