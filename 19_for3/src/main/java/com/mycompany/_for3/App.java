package com.mycompany._for3;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*Hacer un programa que pida al usuario 10 numeros,
        al finalizar el programa imprimira la suma de esos 10 numeros,
        asi como cual es el mayor de los 10 numeros.*/
        //forma 2: el valor mayor inicializar con el numero mas pequeño
        //soportado por mi arquitectura
        Scanner s = new Scanner(System.in);
        float suma = 0; //variable acumulador
        float numero; //variable temporal de lectura
        float mayor = Float.MAX_VALUE*-1; //variable bandera (flag) para determinar el numero mayor
        //MAX_VALUE es el valor MAS grande soportado; pero lo multiplicamos
        //por -1 para indicr que queremos el valor MAS pequeño soportado (MIN_VALUE)
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Digite numero: ");
            numero = s.nextFloat();
            //sumar numero recien leido
            suma += numero;
            //determina si el numero recien leido es el mayor
            if( numero > mayor )
                mayor = numero;
        }
        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("El mayor es: "+mayor);
    }
}
