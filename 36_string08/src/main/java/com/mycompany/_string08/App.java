package com.mycompany._string08;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*Metodo replace
        Devuelve un String al cual se ha aplicado el reemplazo
        de todas las coincidencias en que se encontro otro String.
        -> IMPORTANTE: este metodo no ignora mayusculas/minusculas.*/
        String str = "Verde es la Pera, la pera es verde. Que verde es la pera!";
        System.out.println("String original: "+str);
        //reemplazar verde por roja, sin alterar el String original
        System.out.println( str.replace("verde","roja") );
        System.out.println("String original: "+str);
        //si desea alterar el String original:
        str = str.replace("verde","roja");
        System.out.println("String original: "+str);
        
        //tambien es posible desencadenar varios reemplazos en un String
        String str2 = "La sandia es una fruta deliciosa, el jugo de sandia es mejor que el de noni";
        //para str2 vamos a reemplazar sandia por melon, y noni por anona; pero alterando al String original
        System.out.println("str2 original: "+str2);
        str2 = str2.replace("sandia", "melon").replace("noni", "anona").replace("La melon", "El melon");
        System.out.println("str2 luego de replace: "+str2);
        
        /*leer una cadena de texto, y reemplazar dentro de ella todos
        los espacios en blanco por guiones bajos
        alterando la cadena original, ejemplo:
        Digitar String: Gerardo Josue Portillo
        resultado: Gerardo_Josue_Portillo*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digite un String: ");
        //forma 1: (paso a paso)
        //String str3 = s.nextLine();
        //str3 = str3.replace(" ", "_");
        
        //forma 2: (aplicar replace en el momento de la lectura)
        String str3 = s.nextLine().replace(" ", "_");
        System.out.println("resulrado: "+str3);
        
        /*Leer un String y luego reemplazar todas las letras a por 4,
        todas las letras e por 3 y todas las letras i por 1 alterando
        el String original ignorando mayusc/minusc., sin modificar
        la capitalizacion de la cadena
        original luego imprimirla.
        Importante: resolverlo utilizando el metodo replace.
        ejemplo:
        Digitar String: ArlequiN
        Resultado: 4rl3qu1N*/
        System.out.print("Digitar String:");
        String str4 = s.nextLine();
        //forma 1: replaces uno por uno
        /*str4 = str4.replace("a", "4");
        str4 = str4.replace("A", "4");
        str4 = str4.replace("e", "3");
        str4 = str4.replace("E", "3");
        str4 = str4.replace("i", "1");
        str4 = str4.replace("I", "1");*/
        
        //forma 2: replaces en cadena
        str4 = str4.replace("a", "4").replace("A", "4").replace("e","3").replace("E","3").replace("i","1").replace("I","1");
        System.out.println("Resultado: "+str4);
    }
}
