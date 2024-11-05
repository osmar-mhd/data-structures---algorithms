# data-structures---algorithms

Aquí tienes un desglose más completo de las estructuras de datos disponibles en Java, Python, React (JavaScript) y C#:

## Java Data Structures

| Estructura de Dato | Descripción |
|---------------------|-------------|
| Array | Estructura básica de datos para almacenar elementos del mismo tipo. |
| ArrayList | Lista dinámica que permite la adición y eliminación de elementos. |
| LinkedList | Implementación de una lista enlazada que permite inserciones y eliminaciones rápidas. |
| Vector | Lista dinámica similar a ArrayList, pero sincronizada. |
| Stack | Implementa una pila (LIFO). |
| Queue | Interfaz para la colección FIFO, con implementaciones como LinkedList y PriorityQueue. |
| PriorityQueue | Cola de prioridad que ordena sus elementos según su orden natural o un comparador. |
| HashMap | Implementación de la interfaz Map que almacena pares clave-valor y permite acceso rápido. |
| TreeMap | Implementación de Map que almacena claves en un árbol rojo-negro, ordenadas. |
| HashSet | Implementación de Set que no permite duplicados y utiliza un HashMap. |
| TreeSet | Implementación de Set que mantiene los elementos en orden. |
| LinkedHashMap | Implementación de Map que mantiene el orden de inserción. |
| WeakHashMap | Mapa que permite que sus claves sean recolectadas por el recolector de basura si no hay referencias fuertes. |
| EnumSet | Conjunto especializado para usar con enumeraciones. |
| ConcurrentHashMap | Implementación de Map que permite acceso concurrente. |
| CopyOnWriteArrayList | Implementación de List que permite acceso concurrente. |

## Python Data Structures

| Estructura de Dato | Descripción |
|---------------------|-------------|
| List | Estructura de datos flexible que puede contener elementos de diferentes tipos. |
| Tuple | Similar a listas, pero inmutables. |
| Set | Colección desordenada de elementos únicos. |
| Dictionary | Colección de pares clave-valor, permite acceso rápido a los elementos. |
| Deque | Cola de doble extremo que permite inserciones y eliminaciones rápidas. |
| Array (módulo array) | Array de elementos del mismo tipo, más eficiente en términos de memoria. |
| OrderedDict (del módulo collections) | Diccionario que recuerda el orden de inserción. |
| defaultdict (del módulo collections) | Diccionario que devuelve un valor predeterminado para claves no existentes. |
| Counter (del módulo collections) | Subclase de diccionario para contar hashable. |
| NamedTuple (del módulo collections) | Tuplas con nombres para facilitar el acceso a los elementos. |

## React (JavaScript) Data Structures

| Estructura de Dato | Descripción |
|---------------------|-------------|
| Array | Estructura de datos para almacenar listas de elementos. |
| Object | Colección de pares clave-valor. |
| Set | Colección de valores únicos. |
| Map | Colección de pares clave-valor que permite claves de cualquier tipo. |
| WeakMap | Similar a Map, pero las claves son recolectables por el recolector de basura. |
| WeakSet | Similar a Set, pero los valores son recolectables por el recolector de basura. |
| Typed Arrays | Arrays que permiten manejar datos binarios en diferentes formatos (e.g., Uint8Array, Float32Array). |

## C# Data Structures

| Estructura de Dato | Descripción |
|---------------------|-------------|
| Array | Estructura básica que almacena un número fijo de elementos del mismo tipo. |
| List<T> | Lista genérica que puede cambiar de tamaño dinámicamente. |
| Dictionary<TKey, TValue> | Colección de pares clave-valor. |
| HashSet<T> | Conjunto que no permite duplicados. |
| SortedSet<T> | Conjunto ordenado. |
| Queue<T> | Cola que sigue el principio FIFO. |
| Stack<T> | Pila que sigue el principio LIFO. |
| LinkedList<T> | Implementación de una lista doblemente enlazada. |
| ObservableCollection<T> | Colección que notifica a los suscriptores sobre cambios. |
| ConcurrentQueue<T> | Cola que permite el acceso concurrente. |
| ConcurrentStack<T> | Pila que permite el acceso concurrente. |
| SortedDictionary<TKey, TValue> | Diccionario que mantiene el orden de las claves. |
| BitArray | Estructura de datos que representa una colección de bits. |
| ArrayList | Lista que puede contener elementos de diferentes tipos (no se recomienda su uso en favor de List<T>). |