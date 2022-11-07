package Point2DandPoint3D;

public class Point3D extends Point2D {
    private float z = 0.0f;


    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] test=new float[3];
        test[0]=this.z;
        test[1]=this.z;
        test[2]=this.z;
        return test;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x, y);
        this.z=z;
    }
    public String toString() {
        return  "("+getX()+","+getY()+","+getZ()+")";
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(10,15,20);
        System.out.println(point3D);
    }
}
