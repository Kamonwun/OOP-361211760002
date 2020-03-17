package lad8;

public class Circle extends GraphicObject {
    final static double PI = 3.141;
    private double radius;


    @Override
    public void findArea() {
        double area = PI * radius *radius;
        System.out.println("The are of Circle :"+area);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
