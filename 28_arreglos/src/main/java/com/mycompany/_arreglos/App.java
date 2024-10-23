package com.mycompany._arreglos;
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
    }
}
