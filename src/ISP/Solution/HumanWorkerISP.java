package ISP.Solution;

public class HumanWorkerISP implements EatTable{

    @Override

    public void work() {

        System.out.println("Les humains travaillent");

    }

    @Override

    public void eat() {

        System.out.println(" Les humains mangent");
    }

}

