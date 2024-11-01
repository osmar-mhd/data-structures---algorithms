import math

class EcuacionCuadratica:
    """Clase que representa una ecuación cuadrática y resuelve sus raíces."""

    def __init__(self, a: float, b: float, c: float):
        self.a = a
        self.b = b
        self.c = c

    def resolver(self):
        """Resuelve la ecuación cuadrática y retorna sus raíces."""
        discriminante = self.b**2 - 4 * self.a * self.c
        if discriminante > 0:
            raiz_discriminante = math.sqrt(discriminante)
            x1 = (-self.b + raiz_discriminante) / (2 * self.a)
            x2 = (-self.b - raiz_discriminante) / (2 * self.a)
            return (x1, x2)
        elif discriminante == 0:
            x = -self.b / (2 * self.a)
            return (x,)
        else:
            return ()

class GestorEcuaciones:
    """Clase que gestiona múltiples ecuaciones cuadráticas y resuelve sus raíces."""

    def __init__(self):
        self.ecuaciones = []

    def agregar_ecuacion(self, ecuacion: EcuacionCuadratica):
        """Agrega una ecuación cuadrática al gestor."""
        self.ecuaciones.append(ecuacion)

    def resolver_ecuaciones(self):
        """Resuelve todas las ecuaciones almacenadas y muestra sus soluciones."""
        resultados = []
        for ecuacion in self.ecuaciones:
            soluciones = ecuacion.resolver()
            if len(soluciones) == 2:
                resultados.append(f"Raíces reales: {soluciones[0]} y {soluciones[1]}")
            elif len(soluciones) == 1:
                resultados.append(f"Una raíz real: {soluciones[0]}")
            else:
                resultados.append("No hay raíces reales.")
        return resultados

# Uso del gestor y ecuaciones
def ejecutar():
    gestor = GestorEcuaciones()
    gestor.agregar_ecuacion(EcuacionCuadratica(1, -3, 2))  # Raíces reales
    gestor.agregar_ecuacion(EcuacionCuadratica(1, 2, 1))   # Una raíz real
    gestor.agregar_ecuacion(EcuacionCuadratica(1, 0, 1))   # Sin raíces reales
    resultados = gestor.resolver_ecuaciones()
    for resultado in resultados:
        print(resultado)

# Ejecuta la función si el archivo se ejecuta directamente
ejecutar()