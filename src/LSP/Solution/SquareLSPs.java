package LSP.Solution;

public class SquareLSPs implements ShapeLSP {


    private int side;

    public SquareLSPs(int side) {

        this.side = side;

    }

    @Override

    public int getArea() {

        return side * side;

    }
}

