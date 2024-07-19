/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorioweek1;

import java.util.Scanner;

public class LaraSamuelFormulas {
    public static void main(String[] args){
        Scanner lea = new Scanner(System.in);
        
        
        System.out.println("Ejercicio A");
        
        System.out.println("Ingrese numerador 1: ");
        int numeradorUno=lea.nextInt();
        
        System.out.println("Ingrese denominador 1: ");
        int denominadorUno=lea.nextInt();
        
        System.out.println("Ingrese numerador 2: ");
        int numeradorDos=lea.nextInt();
        
        System.out.println("Ingrese denominador 2: ");
        int denominadorDos=lea.nextInt();
        
        System.out.print("Resultado: ");
        System.out.println(((double)numeradorUno/denominadorUno)+((double)numeradorDos/denominadorDos));
        
        
        System.out.println("Ejercicio B");
        
        System.out.println("Ingrese numerador 1: ");
        int numeradorOne=lea.nextInt();
        
        System.out.println("Ingrese denominador 1: ");
        int denominadorOne=lea.nextInt();
        
        System.out.println("Ingresar variable 1: ");
        int variableUno=lea.nextInt();
        
        System.out.println("Ingrese numerador 2: ");
        int numeradorTwo=lea.nextInt();
        
        System.out.println("Ingrese varible 2: ");
        int variableDos=lea.nextInt();
        
        System.out.println("Ingrese denominador 2: ");
        int denominadorTwo=lea.nextInt();
        
        System.out.print("Resultado: ");
        System.out.println(((double)numeradorOne/(variableUno-denominadorOne))-((double)(numeradorTwo*variableUno*variableDos)/denominadorTwo));
        
        
        System.out.println("Ejercicio C");
        
        System.out.println("Ingrese el numerador: ");
        int numerador=lea.nextInt();
        
        System.out.println("Ingrese denominador: ");
        int denominador=lea.nextInt();
        
        System.out.println("Ingrese numero: ");
        int numero=lea.nextInt();
        
        System.out.print("Resultado: ");
        System.out.println(((double)numerador/denominador)+(numero));
        
        
        System.out.println("Ejercicio D");
        
        System.out.println("Ingrese numero: ");
        int numeroAlreves=lea.nextInt();
        
        System.out.println("Ingrese el numerador: ");
        int numeradorAlreves=lea.nextInt();
        
        System.out.println("Ingrese denominador: ");
        int denominadorAlreves=lea.nextInt();
        
        System.out.print("Resultado: ");
        System.out.println((numeroAlreves)+((double)numeradorAlreves/denominadorAlreves));
        
        
        System.out.println("Ejercicio E");
        
        System.out.println("Ingrese variable a: ");
        int letraUno=lea.nextInt();
        
        System.out.println("Ingrese variable b: ");
        int letraDos=lea.nextInt();
        
        System.out.println("Ingrese variable c: ");
        int letraTres=lea.nextInt();
        
        System.out.println("Ingrese variable d: ");
        int letraCuatro=lea.nextInt();
        
        System.out.println("Ingrese variable e: ");
        int letraCinco=lea.nextInt();
        
        System.out.println("Ingrese variable f: ");
        int letraSeis=lea.nextInt();
        
        System.out.println("Ingrese variable g: ");
        int letraSiete=lea.nextInt();
        
        System.out.println("Ingrese variable h: ");
        int letraOcho=lea.nextInt();
        
        System.out.println("Ingrese variable j: ");
        int letraNueve=lea.nextInt();
        
        System.out.print("Resultado: ");
        System.out.println(((double)(letraUno^2)/(letraDos-letraTres)+(letraCuatro-letraCinco)/((double)letraSeis-((double)(letraSiete*letraOcho)/letraNueve))));
        
        
        System.out.println("Ejercicio F");
        
        System.out.println("Ingresar m: ");
        int variableOne=lea.nextInt();
        
        System.out.println("ingresar n: ");
        int variableTwo=lea.nextInt();
        
        System.out.println("Ingresar p: ");
        int variableThree=lea.nextInt();
        
        System.out.print("Resultado: ");
        System.out.println(((double)variableOne/variableTwo)+(variableThree));
        
        
        System.out.println("Ejercicio G");
        
        System.out.println("Ingresar m: ");
        int variableM=lea.nextInt();
        
        System.out.println("ingresar n: ");
        int variableN=lea.nextInt();
        
        System.out.println("Ingresar p: ");
        int variableP=lea.nextInt();
        
        System.out.println("Ingresar q: ");
        int variableQ=lea.nextInt();
        
        System.out.print("Resultado: ");
        System.out.println((double)(variableM)+((double)variableN/variableP-variableQ));
        
        
        System.out.println("Ejercicio H");
        
        System.out.println("Ingresar a: ");
        int variableA=lea.nextInt();
        
        System.out.println("ingresar b: ");
        int variableB=lea.nextInt();
        
        System.out.println("Ingresar c: ");
        int variableC=lea.nextInt();
        
        System.out.println("Ingresar d: ");
        int variableD=lea.nextInt();
        
        System.out.print("Resultado");
        System.out.println((double)(variableA^2/variableB^2)+((variableC^2/variableD^2)));
    }
}
