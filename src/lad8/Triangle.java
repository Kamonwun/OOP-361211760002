package lad8;

public class Triangle extends  GraphicObject {
    private double base;
    private double height;


    @Override
    public void findArea() {
        double area = 0.5 * base * height;
        System.out.println("The are of Triangle:  "+ area);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
