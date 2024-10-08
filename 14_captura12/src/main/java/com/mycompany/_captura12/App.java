package com.mycompany._captura12;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Una tienda da un descuento del 10% a personas
        cuya edad este entre 18 y 21 o entre 35 y 59.
        Preguntar al usuario la edad y el monto de la venta.
        Imprimir lo que tiene que pagar y el monto del
        descuento otorgado.
        Obligatorio realizarlo utilizando los operadores AND OR*/
        Scanner abc = new Scanner(System.in);
        int edad;
        float venta, descuento = 0;
        System.out.print("Digite la edad del cliente: ");
        edad = abc.nextInt();
        System.out.print("Digite el monto de lo vendido: ");
        venta = abc.nextFloat();
        //calculo del descuento
        if( edad >= 18 && edad <= 21 || edad >= 35 && edad <= 59 )
            descuento = venta*0.10f;
        //imprimir resultados
        System.out.println("El descuento es: "+descuento);
        System.out.println("Total a pagar: "+(venta-descuento));
    }
}
