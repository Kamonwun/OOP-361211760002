package lad8;

public  abstract class GraphicObject {
    private double x;
    private double y;

    //
    public abstract void findArea();


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}


