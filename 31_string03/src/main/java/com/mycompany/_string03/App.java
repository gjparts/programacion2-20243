package com.mycompany._string03;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*Bug que ocurre en la consola/terminal de Windows
        Cuando se viene de leer un numero almacenado
        en una variable cuyo tipo de dato es primitivo;
        entonces si a continuacion desea leer un String
        el programa se salta dicha lectura.*/
        Scanner s = new Scanner(System.in);
        int numero;
        String str1;
        System.out.print("Digite un numero entero: ");
        numero = s.nextInt();
        
        /*Cuando se viene de leer un numero primitivo y luego se desea
        leer una String entonces el buffer de entrada de la consola por
        alguna razon no se vacia, lanzamos un .nextLine() sin asignar para
        forzar el vaciado del buffer sin afectar el funcionamiento del programa.*/
        s.nextLine(); //vaciar el buffer de entrada (cuando se viene de leer numeros)
        
        System.out.print("Digite un string: ");
        str1 = s.nextLine();
        System.out.println("Entero leido: "+numero);
        System.out.println("String leido: "+str1);
        System.out.println("Adios ***********************");
    }
}
