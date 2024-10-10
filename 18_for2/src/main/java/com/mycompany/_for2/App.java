package com.mycompany._for2;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*Hacer un programa que pida al usuario 10 numeros,
        al finalizar el programa imprimira la suma de esos 10 numeros,
        asi como cual es el mayor de los 10 numeros.*/
        //forma 1: el valor mas grande lo calcularemos considerando
        //que la primer lectura es hasta ese momento el valor mayor.
        Scanner s = new Scanner(System.in);
        float suma = 0; //variable acumulador
        float numero; //variable temporal para captura de datos
        float mayor = 777; //variable bandera (flag) que determina quien es el numero mayor
        //en este caso puedo poner cualquier numero de inicio en mayor
        //porque sera sobreescrito en la iteracion 1
        //lectura y operacion de los numeros
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Digite un numero: ");
            numero = s.nextFloat();
            //sumar el numero recien leido a la variable acumulador
            suma += numero; //suma = suma + numero;
            //si estamos en la primera iteracion ese sera mi primer numero mas grande
            //de lo contrario si el numero recien leido supera al numero mayor
            //entonces el nuevo numero mayor es el numero recien leido.
            if( i == 1 )
                mayor = numero;
            else
                if( numero > mayor )
                    mayor = numero;
        }
        System.out.println("La suma de los numeros es: "+suma);     
        System.out.println("Numero mayor: "+mayor);
    }
}
