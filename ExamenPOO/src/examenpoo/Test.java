/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Test {
    public static void main(String args[]){
        ArrayList<Nomina> nomina = new ArrayList<Nomina>();
        System.out.println("SISTEMA DE EMPLEADOS");
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        int nroHoras = 0;
        float valorHora = 0;
        double salario = 0;
        int opcion = 0;
        while (cont < 3){
            System.out.print("Seleccione el tipo de empleado que necesita crear [1:Asalariado - 2:Por horas] :");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:{
                    System.out.println("Digite su nombre: ");
                    nombre = sc1.nextLine();
                    System.out.println("Digite su apellido: ");
                    apellido = sc1.nextLine();
                    System.out.println("Digite su salario: ");
                    salario = sc.nextDouble();
                    Nomina ea1 = new Nomina(nombre,apellido,salario,"Asalariado");
                    nomina.add(ea1);
                    System.out.println("**Empleado Asalariado creado**");
                    cont++;
                    break;
                }
                case 2:{
                    System.out.println("Digite su nombre: ");
                    nombre = sc1.nextLine();
                    System.out.println("Digite su apellido: ");
                    apellido = sc1.nextLine();
                    System.out.println("Digite su numero de horas: ");
                    nroHoras = sc.nextInt();
                    System.out.println("Digite el valor de horas: ");
                    valorHora = sc.nextFloat();
                    Nomina ea1 = new Nomina(nombre,apellido,nroHoras,valorHora,"Por Horas");
                    nomina.add(ea1);
                    System.out.println("**Empleado por horas creado**");
                    cont++;
                    break;
                }
                default:{
                    System.out.println("Tipo de empleado incorrecto");
                }
            }
        }
        int contAsalariado = 0;
        int contHora = 0;
        /*for(Nomina i: nomina){
            System.out.println("Empleado "+i.tipoEmpleado);
            System.out.println("Name: "+i.name);
            System.out.println("Last Name: "+i.lastName);
            System.out.println("Salary: "+i.salario);
        }*/
        cont = 0;
        System.out.println("Empleados Asalariados");
        double total = 0;
        double acunAsalariado = 0;
        double acumPorHoras = 0;
        for(Nomina i: nomina){
            if(i.tipoEmpleado.equals("Asalariado")){
                System.out.println("# "+cont+" : "+i.name+" - "+i.salario);
                acunAsalariado += i.salario;
                cont++;
            }
        }
        if(cont == 0){
            System.out.println("No hay empleados asalariados en el sistema");
            System.out.println("TOTAL PAGO EMPLEADOS ASALRIADOS: "+acunAsalariado);
        }
        cont = 0;
        System.out.println("Empleados Por Horas");
        for(Nomina i: nomina){
            if(i.tipoEmpleado.equals("Por Horas")){
                System.out.println("# "+cont+" : "+i.name+" - "+i.salario);
                acumPorHoras += i.salario;
                cont++;
            }
        }
        if(cont == 0){
            System.out.println("No hay empleados por hora en el sistema");
            System.out.println("TOTAL PAGO EMPLEADOS POR HORA: "+acumPorHoras);
        }
        System.out.println("SUMATORIA DE PAGOS DE LA EMPRESA: "+(acunAsalariado + acumPorHoras));
    }
}
