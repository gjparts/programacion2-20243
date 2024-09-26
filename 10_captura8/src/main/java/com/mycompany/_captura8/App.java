/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._captura8;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*operador lógico AND
        en lenguajes basados en C, se escribe con doble ampersand: &&
        Hace obligatorio el cumplimiento de dos o mas condiciones.
        ejemplo:
        */
        int a, b, c;
        //pedir al usuario que digite los valores de a, b y c
        //si a es mayor a 5 Y b es menor a 7 Y c es igual a 1
        //entonces mostrar el mensaje BIENVENIDO de lo contrario
        //mostrar el mensaje NO AUTORIZADO
        Scanner xyz = new Scanner(System.in);
        System.out.print("a: ");
        a = xyz.nextInt();
        System.out.print("b: ");
        b = xyz.nextInt();
        System.out.print("c: ");
        c = xyz.nextInt();
        if( a > 5 && b < 7 && c == 1 )
            System.out.println("BIENVENIDO");
        else
            System.out.println("NO AUTORIZADO");
    }
}
