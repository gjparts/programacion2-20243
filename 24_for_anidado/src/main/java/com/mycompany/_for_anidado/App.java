package com.mycompany._for_anidado;
public class App {
    public static void main(String[] args) {
        /*Estructura anidada (nested)
        Es una estructura dentro de otra estructura. Por ejemplo
        un for anidado es un for que esta dentro de otro for.
        ejemplo:
        Hacer un programa que pida al usuario un ancho
        y un alto como numeros enteros.
        El programa debe imprimir un rectangulo relleno de asteriscos
        en base al alto y ancho digitados.*/
        java.util.Scanner s = new java.util.Scanner(System.in);
        int alto, ancho;
        System.out.print("Digite ancho: ");
        ancho = s.nextInt();
        System.out.print("Digite alto: ");
        alto = s.nextInt();
        
        for( int i = 1; i <= alto; i++ ){
            for( int j = 1; j <= ancho; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
