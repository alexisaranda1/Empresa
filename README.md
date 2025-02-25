jercicio: Sistema de Gestión de Empleados
Descripción:
Queremos desarrollar un sistema para gestionar a los empleados de una empresa. Cada empleado tiene información sobre su nombre, cargo, salario y años de experiencia. Además, la empresa tiene un conjunto de empleados y puede realizar ciertas operaciones sobre esta lista, como agregar un empleado, filtrar empleados por salario, contar empleados con más de X años de experiencia, obtener el promedio de salarios, etc.

Requisitos:
Clase Empleado:

Atributos:
nombre: String
cargo: String
salario: double
aniosExperiencia: int
Métodos:
Métodos getters y setters para todos los atributos.
Constructor que inicialice los valores.
Un método toString() para representar al empleado de manera legible.
Excepciones para validar el salario (que no sea negativo).
Clase Empresa:

Atributos:
empleados: ArrayList<Empleado> (una lista de objetos Empleado).
Métodos:
agregarEmpleado(Empleado empleado): para agregar empleados a la lista.
obtenerPromedioSalarios(): para calcular el promedio de salarios de los empleados.
filtrarEmpleadosPorSalario(double salarioMinimo): para obtener una lista de empleados cuyo salario sea superior al valor pasado como argumento.
contarEmpleadosConExperiencia(int anios): para contar cuántos empleados tienen más de los años de experiencia dados.
obtenerEmpleadosPorCargo(String cargo): para filtrar y obtener los empleados con un cargo específico.
Diagrama de Clases:
plaintext
Copiar
          +-----------------+             +-------------------+
          |    Empleado     |             |      Empresa      |
          +-----------------+             +-------------------+
          | - nombre: String|             | - empleados: ArrayList<Empleado>|
          | - cargo: String |             +-------------------+
          | - salario: double|             | + agregarEmpleado(Empleado): void|
          | - aniosExperiencia: int|       | + obtenerPromedioSalarios(): double |
          +-----------------+             | + filtrarEmpleadosPorSalario(double): List<Empleado> |
          | + getNombre(): String|         | + contarEmpleadosConExperiencia(int): int |
          | + setNombre(String): void|     | + obtenerEmpleadosPorCargo(String): List<Empleado> |
          | + getCargo(): String |         +-------------------+
          | + setCargo(String): void|
          | + getSalario(): double|
          | + setSalario(double): void| 
          | + getAniosExperiencia(): int|
          | + setAniosExperiencia(int): void|
          | + toString(): String|
          +-----------------+
                   |
                   | 1..*
                   | 
                   v
          +-------------------+
          |     ArrayList<Empleado>     |
          +-------------------+
Explicación del diagrama:
Empleado:

Contiene los atributos esenciales de un empleado (nombre, cargo, salario, años de experiencia).
El método setSalario(double salario) lanza una excepción si el salario es negativo.
El método toString() devuelve una representación en forma de cadena de un empleado.
Empresa:

Mantiene una lista de empleados (ArrayList<Empleado>).
Tiene métodos para realizar operaciones sobre esa lista:
agregarEmpleado: agrega un empleado a la lista.
obtenerPromedioSalarios: calcula el promedio de salarios de todos los empleados.
filtrarEmpleadosPorSalario: filtra a los empleados cuyo salario sea mayor que un valor dado.
contarEmpleadosConExperiencia: cuenta cuántos empleados tienen más de una cantidad dada de años de experiencia.
obtenerEmpleadosPorCargo: filtra a los empleados por cargo.
Relaciones:
Empleado y Empresa están relacionados a través de la lista de empleados en la clase Empresa (1..*). Esto indica que la empresa puede tener muchos empleados.