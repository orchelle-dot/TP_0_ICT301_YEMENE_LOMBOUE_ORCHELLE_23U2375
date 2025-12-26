
package LSP.Solution;

public class RectangleLSPs implements ShapeLSP{

    private int width;

    private int height;

    public RectangleLSPs(int width, int height) {

        this.width = width;

        this.height = height;

    }

    @Override

    public int getArea() {

        return width * height;
    }
}

