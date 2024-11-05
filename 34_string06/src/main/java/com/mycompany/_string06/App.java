package com.mycompany._string06;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Leer un String y luego lo van a imprimir;
        pero dejando tres espacios entre cada caracter
        sin afectar al String leido.
        ->  Tambien van a imprimir cuantas veces
            esta la letra c dentro del String leido,
            ignorando mayusc./minusc.*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digite un String: ");
        String str = s.nextLine();
        
        int contador = 0; //variable contador
        for( int i = 0; i < str.length(); i++ ){
            System.out.print(str.charAt(i)+"   ");
            //if( str.charAt(i) == 'c' || str.charAt(i) == 'C' ) contador++;
            if( str.toUpperCase().charAt(i) == 'C' ) contador++;
        }
        System.out.println("\nLa letra c se encontro: "+contador+" veces.");
    }
}
