/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorioweek1;

import java.util.Scanner;

public class LaraSamuelPlanillaEmpleado {

    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        
        String name;
        int horasTrabajadas;
        int semanas=4;
        double tarifa;
        double pago=0, pagoSemanal=0;
        
        
        System.out.print("Ingresar el nombre del empleado: ");
        name=lea.next();
        System.out.print("Ingresar horas trabajadas en el mes: ");
        horasTrabajadas=lea.nextInt();
        System.out.print("Ingresar tarifa por hora: ");
        tarifa=lea.nextDouble();
        System.out.println("");
        
        pago=horasTrabajadas*tarifa;
        pagoSemanal=pago/4;
        
        System.out.println("***** INFORMACION *****");
        System.out.println("Nombre del empleado: "+name);
        System.out.print("Salario neto a la semana: "+pagoSemanal);
        
    }
    
}
