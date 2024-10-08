package com.mycompany._switch1;
import java.util.Random; //clase para generar numeros al azar
public class App {
    public static void main(String[] args) {
        /*Hacer un programa que genere un numero al azar entre 3 y 8
        y dependiendo del numero generado nos imprima un color, estos pueden ser:
        3 = verde, 4 = azul, 5 = rojo, 6 = blanco, 7 = negro, 8 = amarillo*/
        //instanciar un objeto para generar numeros al azar
        Random generador = new Random();
        //.nextInt(max-min+1)+min;
        int numero = generador.nextInt(8-3+1)+3;
        //int numero = generador.nextInt(6)+3;
        System.out.println("numero generado: "+numero);
        switch(numero){
            case 3:
                System.out.println("verde");
            break;
            case 4:
                System.out.println("azul");
            break;
            case 5: System.out.println("rojo"); break;
            case 6: System.out.println("blanco"); break;
            case 7: System.out.println("negro"); break;
            case 8: System.out.println("amarillo"); break;
            default:
                System.out.println("Numero desconocido");
        }
    }
}
