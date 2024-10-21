package com.mycompany._control_flujo_continue;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*Instrucciones de control de flujo
        -> continue: termina la iteracion actual y pasa a la siguiente
                     sin terminar con la estructura de repeticion.
        -> break: termina con la estructura de repeticion.*/
        //EJEMPLOS DE USO DE CONTINUE
        /*Hacer un programa que imprima los numeros del 1 al 100;
        pero no imprima los numeros que sean multiplos de 9.
        RETO: resuelvalo usando la instruccion continue.*/
        for( int i = 1; i <= 100; i++ ){
            if( i%9 == 0 ) continue; //saltar la iteracion actual
            System.out.println(i);
        }
        System.out.println("***************************");
        /*Leer N cantidad de numeros enteros, sume solo aquellos
        numeros que sean positivos. Si digita un numero negativo debera
        ignorarlo y seguir leyendo numeros.
        -> El programa termina cuando se digite el numero CERO
           y muestre la suma de los numeros leidos
        RETO: resuelvalo usando la instruccion continue.*/
        Scanner s = new Scanner(System.in);
        int numero, suma = 0;
        do {
            System.out.print("Digitar entero (cero finaliza): ");
            numero = s.nextInt();
            if( numero < 0 ) continue; //terminar la iteracion actual
            suma += numero;
        } while ( numero != 0 );
        System.out.println("Suma: "+suma);
    }
}
