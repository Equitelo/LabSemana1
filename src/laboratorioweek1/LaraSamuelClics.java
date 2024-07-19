
package laboratorioweek1;

import java.util.Scanner;

public class LaraSamuelClics {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        double impuesto=0;
        double promedio=0;
        double total=0;
        double sumaImpuesto=0;
        
        System.out.println("Ingresar el total de clics");
        int totalClic=lea.nextInt();
        
        System.out.println("Cantidad de clic 1: ");
        int clics1=lea.nextInt();
        System.out.println("Precio del click 1: ");
        double precioClic1=lea.nextDouble();
        
        System.out.println("Cantidad de clic 2: ");
        int clics2=lea.nextInt();
        System.out.println("Precio del click 2: ");
        double precioClic2=lea.nextDouble();
        
        System.out.println("Cantidad de clic 3: ");
        int clics3=lea.nextInt();
        System.out.println("Precio del click 3: ");
        double precioClic3=lea.nextDouble();
        
        total=(clics1*precioClic1)+(clics2*precioClic2)+(clics3*precioClic3);
        promedio= total/totalClic;
        
        impuesto=total*0.16;
        sumaImpuesto=total+impuesto;
        
        System.out.println("Costo promedio: "+promedio);
        System.out.println("Con el impuesto: "+total);
        
    }
}
