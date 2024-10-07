package com.mycompany._captura11;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Operador Logico OR
        hace opcional el cumplimiento de dos o mas condiciones,
        con una de las condiciones que se cumpla entonces se ejecuta el
        codigo condicionado. Ejemplo:
        
        Hacer un programa que solicite digitar el año y el numero de mes como enteros.
        Luego se va a imprimir un mensaje indicando la cantidad de dias que tiene
        el mes/año proporcionado.
        IMPORTANTE: Recuerde que mes solo debe aceptar numeros entre 1 y 12*/
        Scanner abc = new Scanner(System.in);
        int a, m;
        System.out.print("Digite el año: ");
        a = abc.nextInt();
        System.out.print("Digite el mes: ");
        m = abc.nextInt();
        //mes solo puede ser entre 1 y 12
        if( m >= 1 && m <= 12 ){
            if( m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 )
                System.out.println("31 dias");
            if( m == 4 || m == 6 || m == 9 || m == 11 )
                System.out.println("30 dias");
            if( m == 2 ){
                if( a%4 == 0 )
                    System.out.println("29 dias");
                else
                    System.out.println("28 dias");
            }
        }
        else
            System.out.println("Mes debe ser entre 1 y 12");
    }
}
