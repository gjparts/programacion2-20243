package com.mycompany._while_dowhile;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Estructuras de repeticion while y do-while
        estas estructuras iteran dependiendo del cumplimiento de una
        o varias condiciones.
        -> para facilitar su entendimiento imaginelas como un if
           iterativo, o sea un if que se dejara de repetir cuando
           la o las condiciones del while dejen de cumplirse.
        -> estas estructuras las usamos normalmente cuando NO sabemos
           cuando se va a terminar de iterar
        -> while: pregunta primero, hace despues
        -> do-while: hace primero, pregunta despues*/
        //imprimir los numeros del 1 al 10 de uno en uno utilizando while
        int x = 1; //variable de control
        while( x <= 10 ){
            System.out.println(x);
            x++; //modificar la variable de control
        }
        //imprimir los numeros del 1 al 10 de uno en uno utilizando do-while
        int z = 1; //variable de control
        do{
            System.out.println(z);
            z++; //modificar la variable de control
        }while(z <= 10); 
        //hacer un programa que pregunte numeros al usuario, el programa
        //termina hasta que el usuario digite CERO. (resolver usando while)
        Scanner s = new Scanner(System.in);
        System.out.println("*********** usando while ***********");
        double numero = 4567; //while pregunta primero
                           //por lo tanto debe haber un valor de inicio
                           //que permita ingresar a while al menos una vez
        while(numero != 0){
            System.out.print("Numero: ");
            numero = s.nextDouble();
        }
        //hacer un programa que pregunte numeros al usuario, el programa
        //termina hasta que el usuario digite CERO. (resolver usando do-while)
        System.out.println("*********** usando do-while ***********");
        double valor; //do-while siempre hace la primer iteracion
                      //si la variable de control se escribe en cada iteracion
                      //entonces no es necesario ponerle un valor de inicio
        do{
            System.out.print("Numero: ");
            valor = s.nextDouble();
        }while( valor != 0 );
    }
}
