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
public class Empleado {
    private String name;
    private String lastName;
    Empleado(){
        
    }
    Empleado(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    void setNombre(String name){
        this.name = name;
    }
    
    String getNombre(){
        return this.name;
    }
    
    void setApellido(String lastName){
        this.lastName = lastName;
    }
    String getApellido(){
        return this.lastName;
    }
    
}
