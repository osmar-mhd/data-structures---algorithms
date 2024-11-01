public class EcuacionCuadratica {
    private double a;
    private double b;
    private double c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] resolver() {
        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            // Dos raíces reales
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return new double[] {raiz1, raiz2};
        } else if (discriminante == 0) {
            // Una raíz real
            double raiz = -b / (2 * a);
            return new double[] {raiz};
        } else {
            // No hay raíces reales
            return new double[] {};
        }
    }
}