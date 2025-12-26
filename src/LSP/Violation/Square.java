package LSP.Violation;

public class Square extends  RectangleLSPV {
    @Override

    public void setWidth(int width) {

        super.setWidth(width);

        super.setHeight(width);

    }

    @Override
    public void setHeight(int height) {

        super.setWidth(height);

        super.setHeight(height); }

}

