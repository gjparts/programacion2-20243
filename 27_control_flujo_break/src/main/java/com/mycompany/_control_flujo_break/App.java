package com.mycompany._control_flujo_break;
import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        /*hacer una estructura while infinita
        dicha estructura se rompe solo si adivina el numero secreto
        el numero secreto sera un numero entero al azar entre 1 y 6
        dicho numero va a cambiar en cada iteracion.
        RETO: usar al menos una instruccion break.*/
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int secreto, numero;
        //estructura while infinita
        while(true){
            secreto = r.nextInt(6)+1;
            System.out.print("Adivina un numero entre 1 y 6: ");
            numero = s.nextInt();
            if( numero == secreto ) break; //rompe el while infinito
        }
        System.out.println("Has sido liberado, Adios!");
    }
}
