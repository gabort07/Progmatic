package Points;

public class Point3D extends Points {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void doubleDistance() {
        super.doubleDistance();
        this.z *= 2;
    }


}
