/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._captura1;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner; //importar la clase para captura de datos
public class App {

    public static void main(String[] args) {
        //instanciar un nuevo objeto de clase Scanner
        //System.in indica que el Scanner va a leer de la consola del sistema
        Scanner x = new Scanner(System.in);
        //programa que suma dos numeros
        //declarar las variables
        int num1, num2;
        //leer los datos
        System.out.print("Digitar primer valor: ");
        num1 = x.nextInt();
        System.out.print("Digitar segundo valor: ");
        num2 = x.nextInt();
        System.out.println("La suma de los dos numeros es "+(num1+num2));
    }
}
