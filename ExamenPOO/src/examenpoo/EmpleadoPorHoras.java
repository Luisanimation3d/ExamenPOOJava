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
public class EmpleadoPorHoras extends Empleado{
    private float nroHoras;
    private float valorHora;
    EmpleadoPorHoras(String name, String lastName, float nroHoras, float valorHora){
        super(name,lastName);
        this.nroHoras = nroHoras;
        this.valorHora = valorHora;
    }

    public float getNroHoras() {
        return nroHoras;
    }

    public void setNroHoras(float nroHoras) {
        this.nroHoras = nroHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    
    double pagos(){
        return this.nroHoras * this.valorHora;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{" + "nroHoras=" + nroHoras + ", valorHora=" + valorHora + "}\n" +
                "NombreEmpleado{" + super.getNombre() + "}\n" +
                "ApellidoEmpleado{" + super.getApellido() + "}";
    }
    
}
