import java.lang.Math;
class EcuacionCuadratica {
    private double x;
    private double y;
    private double z;

    public EcuacionCuadratica(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setZ(double z) {
        this.z = z;
    }
    public double getDiscriminante() {
        return (y * y) - (4 * x * z);
    }
    public Double getRaiz() {
        double d = getDiscriminante();
        if (d >= 0) {
            return (-y + Math.sqrt(d)) / (2 * x);
        } else {
            return null;
        }
    }
    public Double getRaiz2() {
        double d = getDiscriminante();
        if (d >= 0) {
            return (-y - Math.sqrt(d)) / (2 * x);
        } else {
            return null;
        }
    }
    public String toString() {
        double d = getDiscriminante();
        if (d > 0) {
            return "Tiene dos raíces: " + getRaiz() + " y " + getRaiz2();
        } else if (d == 0) {
            return "Tiene una raíz: " + getRaiz();
        } else {
            return "Raíz real no disponible";
        }
    }
    public static void main(String[] args) {
        EcuacionCuadratica eq1 = new EcuacionCuadratica(1.0, 3, 1);
    System.out.println(eq1);
    }
}
