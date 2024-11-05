public class Circulo {
    
    private double radio;

    // Constructor con validación
    public Circulo(double radio) {
        if (radio >= 0) {
            this.radio = radio;
        } else {
            throw new IllegalArgumentException("El radio debe ser positivo.");
        }
    }

    // Getter
    public double getRadio() {
        return radio;
    }

    // Setter
    public void setRadio(double radio) {
        if (radio >= 0) {
            this.radio = radio;
        } else {
            throw new IllegalArgumentException("El radio debe ser positivo.");
        }
    }

    // Cálculo de área
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Cálculo de perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo con radio = " + radio + " y área = " + calcularArea();
    }
}