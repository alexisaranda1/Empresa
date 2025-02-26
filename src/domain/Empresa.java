package domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Empresa {
    List<Empleado> empleados;

    public Empresa() {

        empleados = Arrays.asList(
                new Empleado("Juan", 35),
                new Empleado("María", 50),
                new Empleado("Pedro", 40),
                new Empleado("Ana", 30));
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);

    }

    public List<Empleado> filtarEmpleadosPOrEdad(int edad) {

        return empleados.stream() 
                .filter(empleado -> empleado.getEdad() > edad)
                .collect(Collectors.toList());
    }

    public void listarEmpleados() {
        empleados.stream() 
                .forEach(System.out::println);
    }

}