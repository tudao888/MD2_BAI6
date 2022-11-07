package CircleandCylinder;

public class Cylinder extends Circle1 {
    private double height = 10.0;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI*getRadius()*getRadius()*height;
    }

    public String toString() {
        return "bán kính hình trụ là: " + getRadius()
                + " màu là: "  + getColor()
                + " có thể tích là:" + getVolume();

    }

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(10.0,"Green", 8.0);
        System.out.println(cylinder1);
    }
}
