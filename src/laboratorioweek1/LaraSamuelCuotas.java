/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorioweek1;

import java.util.Scanner;

public class LaraSamuelCuotas {
    
    public static void main(String[] args) {
        
        Scanner lea = new Scanner(System.in);
        
        double meses;
        double interes, prestamoBanco;
        double total=0, totalMensual=0;
        
        
        System.out.print("Prestamo a pagar: ");
        prestamoBanco=lea.nextDouble();
        
        System.out.print("Ingresar el plazo de los meses: ");
        meses=lea.nextDouble();
        
        System.out.print("Ingresar el interes: ");
        interes=lea.nextDouble();
        
        total=prestamoBanco*meses*interes;
        totalMensual=total/meses;
        
        System.out.println("");
        System.out.println("Pago mensual: "+totalMensual);
        System.out.println("El interes a pagar es de "+total);
        
    
    }
    
}
