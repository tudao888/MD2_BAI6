package CircleandCylinder;

public class Circle1 {
    private double radius;
    private String color;

    public Circle1 (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }
    public String toString() {
        return "bán kính hình tròn là: " + getRadius()
                + " màu là: "  + getColor()
                + " có diện tích là:" + getArea();

    }

    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(10.0,"Red");
        System.out.println(circle1);

    }
}
