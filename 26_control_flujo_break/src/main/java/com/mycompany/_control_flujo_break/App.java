package com.mycompany._control_flujo_break;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*usando una estructura de repeticion for hacer un programa
        que lea 100 numeros positivos de tipo long.
        -> si durante la lectura se digita un numero negativo terminar con
           la lectura de los 100 numeros.
        -> al finalizar el programa mostrar la suma de los numeros leidos;
           pero no sume el numero negativo leido para terminar con la estructura.*/
        Scanner s = new Scanner(System.in);
        long numero, suma = 0;
        for( int i = 1; i <= 100; i++ ){
            System.out.print("Digitar entero positivo: ");
            numero = s.nextLong();
            //si digita numero negativo se interrumpe la lectura de los 100 numeros
            if( numero < 0 ) break;
            suma += numero;
        }
        System.out.println("Suma: "+suma);
    }
}
