package com.mycompany._string10;
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
        
    }
}
