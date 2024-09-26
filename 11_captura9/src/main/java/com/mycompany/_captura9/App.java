/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._captura9;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Leer la edad de una persona y luego imprimir a que
        grupo de poblacion corresponde en base a la siguiente tabla:
        Grupo       	rango
        menor de edad   de 0 a menos de 18
        mayor de edad   entre 18 y 20
        adulto      	entre 21 y 59
        tercera edad	de 60 en delante
        Resolverlo utilizando el operador logico AND*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digite la edad: ");
        int edad = s.nextInt();
        //resultado:
        if( edad >= 0 && edad < 18 ) System.out.println("menor de edad");
        if( edad >= 18 && edad <= 20 ) System.out.println("mayor de edad");
        if( edad >= 21 && edad <= 59 ) System.out.println("adulto");
        if( edad >= 60 ) System.out.println("tercera edad");
    }
}
