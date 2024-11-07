package com.mycompany._string09;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*Metodo contains
        Nos indica si un String ha sido encontrado dentro de otro String
        -> no ignora mayusculas/minusculas;
        -> devuelve true si se ha encontrado, o falso si no;
        -> contains no altera ya que solo lee.*/
        String str = "Hay una vara junto a la ROCa que esta a la orilla del Mar";
        System.out.println("String original: "+str);
        
        System.out.println("str contiene la palabra arbol? "+str.contains("arbol"));
        System.out.println("str contiene la palabra roca? "+str.contains("roca"));
        System.out.println("str contiene la palabra ROCa? "+str.contains("ROCa"));
        System.out.println("str contiene la palabra mar? "+str.contains("mar"));
        System.out.println("str contiene la palabra mar ignorando mayusc/minusc? "+str.toLowerCase().contains("mar"));
        System.out.println("str contiene la palabra ROCA ignorando mayusc/minusc? "+str.toUpperCase().contains("ROCA"));
        
        System.out.println("String original: "+str);
        
        /*preguntar al usuario: ¿que desea buscar dentro de str?
        ignorando mayusculas/misnuculas
        si lo que el usuario desea buscar se encuentra entonces
        responder: "Texto encontrado"
        del lo contrario responder: "Texto no se encontró"*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digite lo que desea buscar dentro de str: ");
        String buscar = s.nextLine();
        
        if( str.toLowerCase().contains( buscar.toLowerCase() ) == true )
            System.out.println("Texto encontrado");
        else
            System.out.println("Texto no se encontro");
    }
}
