package ISP.Violation;

public class HumanWorker implements Worker {

    @Override

    public void work() {

        System.out.println("Les humains travaillent");

    }

    @Override

    public void eat() {

        System.out.println(" Les humains mangent");
    }
}
