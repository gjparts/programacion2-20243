package com.mycompany._for4;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*Hacer un programa que pida 10 numeros enteros, al finalizar
        mostrar el promedio de los numeros, asi como el conteo
        de cuantos numeros pares fueron leidos y cuantos numeros
        impares fueron leidos ademas de imprimir cual fue
        el numero mayor y el numero menor leido.*/
        Scanner s = new Scanner(System.in);
        int suma = 0, pares = 0, impares = 0; //variables acumuladoras
        int numero; //variable temporal
        int mayor = 1234, menor = 1234; //variables bandera
    
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Entero: ");
            numero = s.nextInt();
            suma += numero; //sumar para el promedio
            //en la primera iteracion establezco el mayor y el menor de inicio
            if( i == 1 ){
                mayor = numero;
                menor = numero;
            }else{
                //en las siguientes iteraciones competimos con el ultimo mayor/menor
                if( numero > mayor ) mayor = numero;
                if( numero < menor ) menor = numero;
            }
            //pares/impares
            if( numero%2 == 0 )
                pares++;
            else
                impares++;
        }
        System.out.println("El promedio es: "+(suma/10.0f));
        System.out.println("el mayor es: "+mayor);
        System.out.println("el menor es: "+menor);
        System.out.println("Pares: "+pares);
        System.out.println("Impares: "+impares);
    }
}
