package com.mycompany._arreglos;
import java.util.Arrays;
import java.util.Random;
public class App {

    public static void main(String[] args) {
        /*Arreglo (Array)
        Es una estructura de datos estática, secuencial y homogénea que
        agrupa datos.
        @ Estática: no puede cambiar su tamaño (lo opuesto a dinámico)
        @ Secuencial: cada elemnto existe en un espacio consecutivo
                      de memoria (lo opuesto a aleatorio)
        @ Homogéneo: todos sus elementos son del mismo tipo (lo opuesto a heterogéneo)
        -> un arreglo en todo lenguaje con sintaxis basada en C++ numera sus
           elementos usando Zero Indexing o sea desde 0 hasta N-1
        
        FORMA DE INICIALIZAR ARREGLOS:
        1) inicializar un arreglo sin datos
        2) inicializarlo prellenado con datos predefinidos
        
        FORMA 1: inicializar sin datos*/
        int arreglo1[] = new int[6]; //arreglo unidimensional de enteros de 4 elementos
        //JAVA al inicializar un arreglo lo llena con valores default
        //para imprimir un elemento de un arreglo se hace asi:
        System.out.println( arreglo1[0] );
        System.out.println( arreglo1[1] );
        System.out.println( arreglo1[2] );
        System.out.println( arreglo1[3] );
        System.out.println( arreglo1[4] );
        System.out.println( arreglo1[5] );
        //asignar un valor a determinado elemento del arreglo:
        arreglo1[3] = 9;    //cardinal: elemento en la posicion 3, ordinal: cuarto elemento
        arreglo1[5] = 123;  //cardinal: elemento en la posicion 5, ordinal: sexto elemento
        //puede usar una estructura de repeticion para imprimir todos los elementos
        //del arreglo:
        for( int i = 0; i < arreglo1.length; i++ ){
            System.out.println("posicion: "+i+", valor: "+arreglo1[i]);
        }
        System.out.println("numero de elementos en arreglo1: "+arreglo1.length);
        //que pasa si quiere tener acceso a una posicion inexistente en un arreglo?
        //System.out.println( arreglo1[1000] );
        //lo anterior genera una excepcion IndexOutOfBounds indicando que
        //queremos tener acceso a una posicion que esta fuera de los limites de
        //la estructura, no sea no existe.
        System.out.println("El primer elemento de arreglo1 es: "+arreglo1[0]);
        System.out.println("El ultimo elemento de arreglo1 es: "+arreglo1[5]);
        System.out.println("El ultimo elemento de arreglo1 es: "+arreglo1[ arreglo1.length-1 ]);
        
        //FORMA 2: inicializarlo prellenado con datos predefinidos
        int arreglo2[] = { 777, 234, 6, -8, 0, 456, 90, 786, 5432 };
        System.out.println("Numero de elementos de arreglo2: "+arreglo2.length);
        //imprimir el arreglo anterior
        for( int i = 0; i < arreglo2.length; i++ )
            System.out.println("Posicion: "+i+", valor: "+arreglo2[i]);
        
        //que pasa si imprimo la variable del arreglo?
        System.out.println("Direccion de memoria de arreglo2: "+arreglo2);
        System.out.println("Direccion de memoria de arreglo1: "+arreglo1);
        
        /*Hacer un programa que tenga un arreglo unidimensional
        de numeros enteros de tamaño 25 y llenar cada uno de sus
        elementos con un numero al azar entre 5 y 97 no importa
        que se repitan. Por ultimo imprimir el arreglo.*/
        Random r = new Random();
        int arreglo3[] = new int[25];
        System.out.println("*******************");
        //llenar cada elemento del arreglo
        for(int i = 0; i < arreglo3.length; i++){
            arreglo3[i] = r.nextInt(93)+5; //llenar
            System.out.println(arreglo3[i]); //imprimir
        }
        //crear un nuevo arreglo que sea una copia del arreglo del ejercicio
        //anterior; pero en este nuevo arreglo cada elemento estara elevado
        //al cubo. Imprimir el nuevo arreglo.
        int arreglo4[] = new int[ arreglo3.length ];
        //copiar cada item de arreglo3 hacia arreglo4; pero elevado al cubo
        System.out.println("******************* AL CUBO: ");
        for( int i = 0; i < arreglo4.length; i++ ){
            //arreglo4[i] = arreglo3[i]*arreglo3[i]*arreglo3[i];
            //a continuacion se eleva usando pow (que devuelve double)
            //y le decimos al compilador que considere ese double devuelto
            //por pow como un entero.
            arreglo4[i] = (int)Math.pow(arreglo3[i], 3);
            System.out.println(arreglo4[i]); //imprimir
        }
        
    }
}
