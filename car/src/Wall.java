public class Wall {
    private double width;
    private double height;
    private String name;

    public Wall(){
        this.width = setWidth();
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
