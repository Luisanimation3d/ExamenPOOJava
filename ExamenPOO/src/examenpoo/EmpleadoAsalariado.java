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
public class EmpleadoAsalariado extends Empleado {
    
    private double salarioMensual;
    
    EmpleadoAsalariado(){
     
    } 
    EmpleadoAsalariado(String name, String lastName, double salario){
        super(name, lastName);
        this.salarioMensual = salario;
    } 
    void setSalarioMensual(double salario){
        this.salarioMensual = salario;
    }
    
    double getSalarioMensual(){
        return this.salarioMensual;
    }

    @Override
    public String toString() {
        return "EmpleadoAsalariado{" + "salarioMensual=" + salarioMensual + "}\n" +
                "NombreEmpleado{" + super.getNombre() + "}\n" +
                "ApellidoEmpleado{" + super.getApellido() + "}";
    }

    
    
    
 
}
