/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorioweek1;

import java.util.Scanner;

public class LaraSamuelCuotas {
    
    public static void main(String[] args) {
        
        Scanner lea = new Scanner(System.in);
        double cobro=0, totalMensual=0, total=0, conversion=0;
        
        
        System.out.print("Prestamo a pagar: ");
        double prestamoBanco=lea.nextDouble();
        
        System.out.print("Ingresar el plazo de los meses: ");
        double meses=lea.nextDouble();
        
        System.out.print("Ingresar porcentaje del interes: %");
        double interes=lea.nextDouble();
        
        conversion=interes/100;
        cobro=prestamoBanco*meses*conversion;
        totalMensual=cobro/meses;
        total=prestamoBanco+cobro;
        
        System.out.println("***** CUOTAS *****");
        System.out.println("Pago mensual: HNL "+totalMensual);
        System.out.println("El interes a pagar es de: HNL "+total);
        
    
    }
    
}
