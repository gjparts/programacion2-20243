package com.mycompany._string02;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //capturar String por medio de la consola usando Scanner
        Scanner s = new Scanner(System.in);
        System.out.print("Digite un string: ");
        String str1 = s.nextLine();
        
        System.out.println("el String leido es: "+str1);
        /*Del string que se acaba de leer imprima:
        1) el tamaño
        2) su version en mayusculas
        3) su version en minusculas
        4) su version aplicando trim
        5) tamaño del String aplicando trim
        6) una copia del String reemplazando caracteres E por numeros 3
           pero ignorando mayusculas/minusuclas sin usar el metodo replace.*/
        System.out.println("Tamaño: "+str1.length());
        System.out.println("Mayusculas: "+str1.toUpperCase());
        System.out.println("Minusculas: "+str1.toLowerCase());
        System.out.println("Aplicar trim: "+str1.trim());
        System.out.println("Tamanio luego de trim: "+str1.trim().length());
        
        String copia = "";
        for( int i = 0; i < str1.length(); i++ ){
            if( str1.toUpperCase().charAt(i) == 'E' )  //if( str1.charAt(i) == 'E' || str1.charAt(i) == 'e' )
                copia += '3';
            else
                copia += str1.charAt(i);
        }
        System.out.println("Luego de reemplazar E por 3: "+copia);
    }
}
