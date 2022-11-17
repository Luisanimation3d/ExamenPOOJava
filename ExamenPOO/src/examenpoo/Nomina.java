/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpoo;

/**
 *
 * @author SENA
 */
public class Nomina {
    String name;
    String lastName;
    int nroHoras;
    float valorHora;
    double salario;
    String tipoEmpleado;
    Nomina(String name, String lastName, double salario, String tipoEmpleado){
            EmpleadoAsalariado empleado = new EmpleadoAsalariado(name, lastName, salario);
            this.tipoEmpleado = tipoEmpleado;
            this.name = empleado.getNombre();
            this.lastName = empleado.getApellido();
            this.salario = empleado.getSalarioMensual();
    }
    Nomina(String name, String lastName, int nroHoras, float valorHora, String tipoEmpleado){
            EmpleadoPorHoras empleado = new EmpleadoPorHoras(name, lastName, nroHoras, valorHora);
            this.tipoEmpleado = tipoEmpleado;
            this.name = empleado.getNombre();
            this.lastName = empleado.getApellido();
            this.salario = empleado.pagos();
    }
}
