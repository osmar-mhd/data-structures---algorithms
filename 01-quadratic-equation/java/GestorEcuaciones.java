import java.util.ArrayList;
import java.util.List;

public class GestorEcuaciones {
    private List<EcuacionCuadratica> ecuaciones;

    public GestorEcuaciones() {
        ecuaciones = new ArrayList<>();
    }

    public void agregarEcuacion(EcuacionCuadratica ecuacion) {
        ecuaciones.add(ecuacion);
    }

    public void resolverEcuaciones() {
        for (EcuacionCuadratica ecuacion : ecuaciones) {
            double[] soluciones = ecuacion.resolver();
            if (soluciones.length == 2) {
                System.out.println("Raíces reales: " + soluciones[0] + " y " + soluciones[1]);
            } else if (soluciones.length == 1) {
                System.out.println("Una raíz real: " + soluciones[0]);
            } else {
                System.out.println("No hay raíces reales.");
            }
        }
    }

    public static void main(String[] args) {
        GestorEcuaciones gestor = new GestorEcuaciones();
        
        // Agregar ecuaciones cuadráticas para resolver
        gestor.agregarEcuacion(new EcuacionCuadratica(1, -3, 2)); // Raíces reales
        gestor.agregarEcuacion(new EcuacionCuadratica(1, 2, 1));  // Una raíz real
        gestor.agregarEcuacion(new EcuacionCuadratica(1, 0, 1));  // Sin raíces reales
        
        // Resolver y mostrar las soluciones
        gestor.resolverEcuaciones();
    }
}
