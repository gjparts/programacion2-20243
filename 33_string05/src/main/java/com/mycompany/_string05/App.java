package com.mycompany._string05;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //comparar dos String en JAVA
        //en JAVA no se usa el comparador == para comparar
        //dos String que estan en variables, ya que el String
        //es un objeto y el operador == lo que hace es comparar
        //dos direcciones de memoria y no su contenido.
        String a = "Pera";
        String b = "Pera";
        if( a == b )
            System.out.println("a y b son iguales");
        else
            System.out.println("a y b no son iguales");
        //direccion de memoria de a y b
        System.out.println("direccion de memoria de a: "+System.identityHashCode(a));
        System.out.println("direccion de memoria de b: "+System.identityHashCode(b));
        /*lo anterior funciona porque a y b tienen el mismo valor fijo "Pera"; entonces
        lo que hace el proceso de compilacion es apuntar ambas variables a la misma direccion
        de memoria, puesto que los valores fijos para optimizar memoria se resumen
        y cuando son iguales entonces se envian al mismo punto en memoria.*/
        Scanner s = new Scanner(System.in);
        String x,y;
        System.out.print("Digite un string para x: ");
        x = s.nextLine();
        System.out.print("Digite un string para y: ");
        y = s.nextLine();
        //comparacion usando == (incorrecto para objetos)
        if( x == y )
            System.out.println("x y, son iguales utilizando ==");
        else
            System.out.println("x y, no son iguales utilizando ==");
        
        //direccion de memoria de x y y
        System.out.println("direccion de memoria de x: "+System.identityHashCode(x));
        System.out.println("direccion de memoria de y: "+System.identityHashCode(y));
        /*para las variables que se afectan en tiempo de ejecucion (runtime) estas
        son asignadas a diferentes direccion de memoria independientemente de que
        en algun momento lleguen a tener el mismo valor.*/
        
        //FORMA CORRECTA DE COMPARAR DOS OBJETOS STRING EN JAVA
        if( x.equals(y) == true )
            System.out.println("x y, son iguales usando el metodo equals");
        else
            System.out.println("x y, no son iguales usando el metodo equals");
        //IMPORTANTE: equals compara los dos String; pero sin ignorar mayusculas/minusculas
        //entonces: como podemos comparar dos String pero ignorando mayusculas/minusculas?
        //Forma 1: comparar ambos String; pero usando la misma capitalizacion (casing)
        if( x.toUpperCase().equals( y.toUpperCase() ) == true )
            System.out.println("x y, son iguales usando el metodo equals y toUpperCase");
        else
            System.out.println("x y, no son iguales usando el metodo equals y toUpperCase");
        
        //Forma 2: JAVA incluye el metodo equalsIgnoreCase, permite comparar dos String
        //ignorando la capitalizacion
        if( x.equalsIgnoreCase(y) == true )
            System.out.println("x y, son iguales usando el metodo equalsIgnoreCase");
        else
            System.out.println("x y, no son iguales usando el metodo equalsIgnoreCase");
        
        //comparar dos String, ignorando la capitalizacion y evitando los espacios de relleno
        if( x.trim().equalsIgnoreCase(y.trim()) == true )
            System.out.println("x y, son iguales usando el metodo equalsIgnoreCase y trim");
        else
            System.out.println("x y, no son iguales usando el metodo equalsIgnoreCase y trim");
        
        /*Hacer un programa que pregunte 3 String al usuario, luego van a imprimir un mensaje
        indicando si los 3 iguales o, si los 3 no son iguales. Ignore mayusc/minusc. y 
        espacios de relleno.*/
        String q,w,e;
        System.out.print("Digitar primer String: ");
        q = s.nextLine();
        System.out.print("Digitar segundo String: ");
        w = s.nextLine();
        System.out.print("Digitar tercer String: ");
        e = s.nextLine();
        
        //forma 1: usando operadores logicos
        if( q.trim().equalsIgnoreCase( w.trim() ) == true && q.trim().equalsIgnoreCase(e.trim()) == true )
            System.out.println("Los tres String son iguales");
        else
            System.out.println("Los tres String NO son iguales");
        
        //forma 2: sin usar operadores logicos (mas trabajoso)
        if( q.trim().equalsIgnoreCase( w.trim() ) == true )
            if( q.trim().equalsIgnoreCase(e.trim()) == true )
                System.out.println("Los tres String son iguales");
            else
                System.out.println("Los tres String NO son iguales");
        else
            System.out.println("Los tres String NO son iguales");
    }
}
