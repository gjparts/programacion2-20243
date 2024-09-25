/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._captura6;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class App {

    public static void main(String[] args) {
        /*Se da un descuento por venta, se captura el monto de la venta.
        Si la venta es mayor o igual a 2000 se da un 10% de descuento
        Si la venta es mayor o igual a 5000 se da un 20% de descuento
        Si la venta es mayor o igual a 10000 se da un 30% de descuento
        Si la venta es mayor o igual a 20000 se da un 50% de descuento
        Hacer un programa que imprima el valor del descuento y el valor a pagar*/
        //forma 2: condiciones sin el uso de else
        float venta, tasaDescuento = 0, descuento;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite el monto de la venta:");
        venta = s.nextFloat();
        //calculo del descuento
        if( venta >= 2000 ) tasaDescuento = 0.10f;
        if( venta >= 5000 ) tasaDescuento = 0.20f;
        if( venta >= 10000 ) tasaDescuento = 0.30f;
        if( venta >= 20000 ) tasaDescuento = 0.50f;
        
        descuento = venta*tasaDescuento;
        System.out.println("El descuento es de: "+descuento);
        System.out.println("El valor a pagar es: "+(venta-descuento));
    }
}
