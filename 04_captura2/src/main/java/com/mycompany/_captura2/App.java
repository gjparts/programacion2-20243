/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._captura2;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        //instanciar objeto de clase Scanner
        Scanner lector = new Scanner(System.in);
        double a,b,c,d;
        //leer
        System.out.print("a: ");
        a = lector.nextDouble();
        System.out.print("b: ");
        b = lector.nextDouble();
        System.out.print("c: ");
        c = lector.nextDouble();
        System.out.print("d: ");
        d = lector.nextDouble();
        //operar
        double parte1 = (Math.pow(a,2)+b)/c-Math.pow(d,3);
        double parte2 = Math.sqrt(c+d);
        double resultado = parte1/parte2;
        System.out.println("Resultado: "+resultado);
        //otra forma de hacerlo y sin usar variable:
        //observe que toda la operacion se encierra en parentesis
        System.out.println("Resultado: "+((Math.pow(a,2)+b)/c-Math.pow(d,3))/(Math.sqrt(c+d)));
    }
}
