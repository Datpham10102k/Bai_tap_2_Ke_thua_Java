//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Kiểm thử Point2D
        Point2D p2d = new Point2D(2.5f, 3.5f);
        System.out.println("Point2D: " + p2d);
        float[] xy = p2d.getXY();
        System.out.println("Array XY: [" + xy[0] + ", " + xy[1] + "]");

        // Kiểm thử Point3D
        Point3D p3d = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + p3d);
        float[] xyz = p3d.getXYZ();
        System.out.println("Array XYZ: [" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + "]");
    }
}