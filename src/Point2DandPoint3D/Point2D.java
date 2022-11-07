package Point2DandPoint3D;

public class Point2D {
     private float x = 0.0f;
     private float y = 0.0f;


    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] test=new float[2];
        test[0]=this.x;
        test[1]=this.y;
        return test;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "("+this.x+","+this.y+")";
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(10,15);
        System.out.println(point2D);
    }
}
