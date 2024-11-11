package com.mycompany._string10;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*Metodo indexOf
        devuelve la posicion de la primer coincidencia
        encontrado para un String dentro de otro String.
        -> Si se encuentra el String entonces devolvera
           un valor >= 0 indicando la posicion donde se
           encontro;
        -> Si no se encuentra el String entonces develve -1;
        -> indexOf NO ignora mayusculas/minusculas.*/
        String str = "El carro es azul con negro. El carro esta matriculado.";
        System.out.println("str: "+str);
        System.out.println("Posiciones donde encontramos las siguientes busquedas:");
        System.out.println("rojo: "+str.indexOf("rojo"));
        System.out.println("azul: "+str.indexOf("azul"));
        System.out.println("carro: "+str.indexOf("carro"));
        //observe que en str la palabra carro esta dos veces.
        //indexOf devolvera la posicion de la primer coincidencia.
        //indexOf tiene sobrecarga de metodos, por lo tanto nos ofrece
        //otra forma de utilizarla:
        System.out.println("primer coincidencia de carro: "+str.indexOf("carro",0));
        //el segundo parametro en indexOf indica desde donde vamos a comenzar a buscar
        //siendo 0 el primer caracter de str.
        //como la ultima vez que encontramos carro fue en la posicion 3
        //para buscar la siguiente coincidencia de carro entonces continuamos
        //la busqueda a partir del caracter 4.
        System.out.println("siguiente coincidencia de carro: "+str.indexOf("carro",4));
        //habra una tercera coincidencia de carro en str?
        //hacemos otra busqueda; pero comenzando desde la posicion 32 ya que carro se encontro
        //en la posicion 31.
        System.out.println("siguiente coincidencia de carro: "+str.indexOf("carro",32));
        //lo anterior devuelve -1 indicando que ya no hay mas coincidencias de carro en str.
        
        String colores = "rojo amarillo verde rojo azul ROJO Verde Azul azul rosa AMARILLo";
        /*hacer un programa en el que le preguntemos al usuario que color desea
        buscar en el String colores. El programa imprimirá cuántas veces fue encontrado
        dicho color ignorando mayusc./minusc. Ejemplo:
        color a buscar: rojo
        veces que se encontró: 3*/
        Scanner s = new Scanner(System.in);
        System.out.println(colores);
        System.out.print("Color a buscar: ");
        String buscar = s.nextLine();
        int ultima_posicion = 0; //variable bandera
        int coincidencias = 0; //contador
        
        //repetir hasta que la ultima posicion sea -1
        while( ultima_posicion >= 0 ){
            ultima_posicion = colores.toLowerCase().indexOf(buscar.toLowerCase(),ultima_posicion);

            //cuando encontramos algo es porque no es -1 o sea >= 0
            if( ultima_posicion >= 0 ){
                ultima_posicion++; //sumar 1 a la ultima posicion para seguir buscando
                coincidencias++; //sumar 1 al contador de veces que se encontro
            }
        }
        System.out.println("veces que se encontro: "+coincidencias);
    }
}
