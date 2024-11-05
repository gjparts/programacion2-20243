package com.mycompany._string07;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*Arreglos de String
        Hacer un arreglo de String que tenga almacenados los nombres
        de siete frutas.
        Luego preguntamos al usuario por una fruta, el programa debera
        buscar si dicha fruta existe dentro del arreglo.
        Si la encuentra que muestre un mensaje indicando la posicion
        donde fue encontrada, de lo contrario mostrar un mensaje
        indicando que la fruta no se encontro.
        -> ignorar mayusc./minusc. durante la busqueda.*/
        String frutas[] = {"Pera","Uva","Manzana","Sandia","Melon","Kiwi","Limon"};
        Scanner s = new Scanner(System.in);
        System.out.print("Digite una fruta para buscar: ");
        String buscar = s.nextLine();
        
        //hacer la busqueda
        boolean encontrado = false; //variable bandera (flag)
        for( int i = 0; i < frutas.length; i++ ){
            if( frutas[i].equalsIgnoreCase(buscar) == true ){
                System.out.println("Fruta encontrada en la posicion: "+i);
                encontrado = true;
                break; //fruta encontrada, no seguimos buscando.
            }
        }
        if( encontrado == false ) System.out.println("No se encontro.");
        
        /*imprimir cada fruta del arreglo llamado frutas;
        pero colocando un asterisco
        entre cada caracter de cada fruta.
        Imprima un fruta por renglon.
        sin afectar al arreglo original.*/
        
        //fruta por fruta:
        for( int i = 0; i < frutas.length; i++ ){
            //en cada fruta: caracter por caracter
            for( int j = 0; j < frutas[i].length(); j++ ){
                System.out.print(frutas[i].charAt(j)+"*");
            }
            System.out.println(); //nuevo renglon
        }
    }
}
