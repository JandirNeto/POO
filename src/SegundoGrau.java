public class SegundoGrau {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;

    public SegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean calcular() {
        double delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            System.out.println("Delta negativo, sem raízes reais.");
            return false;
        }
        double sqrtDelta = Math.sqrt(delta);
        x1 = (-b + sqrtDelta) / (2 * a);
        x2 = (-b - sqrtDelta) / (2 * a);
        return true;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
}
