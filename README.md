# Sistema de Gestión de Empleados

Este proyecto implementa un sistema de gestión para empleados de una empresa. El sistema permite realizar varias operaciones sobre una lista de empleados, tales como agregar nuevos empleados, filtrar empleados por salario, calcular el promedio de salarios, contar empleados con cierta experiencia, y obtener empleados con un cargo específico.

## Requisitos

1. **Empleado**:
   - Atributos: `nombre`, `cargo`, `salario`, `años de experiencia`.
   - Métodos:
     - Métodos getters y setters para todos los atributos.
     - Un constructor que inicialice los valores.
     - Método `toString()` para representar al empleado de manera legible.
     - Excepciones para validar el salario (que no sea negativo).

2. **Empresa**:
   - Atributos: `empleados` (ArrayList de tipo `Empleado`).
   - Métodos:
     - `agregarEmpleado(Empleado empleado)`: agrega un nuevo empleado a la lista.
     - `obtenerPromedioSalarios()`: obtiene el promedio de los salarios de todos los empleados.
     - `filtrarEmpleadosPorSalario(double salarioMinimo)`: filtra los empleados que tienen un salario mayor que el valor dado.
     - `contarEmpleadosConExperiencia(int anios)`: cuenta cuántos empleados tienen más de los años de experiencia dados.
     - `obtenerEmpleadosPorCargo(String cargo)`: filtra los empleados que tienen un cargo específico.

## Diagrama de Clases





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
