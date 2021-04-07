package bai_tap.point2d_and_point3d;

public class Point3D extends Point2D{
    private float z =0.0f;

    public Point3D() {
    }

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
    public void setXYZ(float x,float y,float z){
        this.setXY(x,y);
        this.setZ(z);
    }
    public float[] getXYZ(){
        float[] array = {this.getX(),this.getY(),this.z};
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{" +super.toString()+
                "z=" + z +
                '}';
    }
}
