package com.mycompany._while_dowhile;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Hacer un programa que lea N cantidad de numeros positivos.
        La lectura de numeros terminara cuando se lea un numero negativo.
        Una vez concluida la lectura de numeros mostraremos la suma de los
        numeros positivos capturados. (resolver usando while o do-while)*/
        //en mi caso lo resolvere usando do-while
        Scanner s = new Scanner(System.in);
        float numero, suma = 0;
        do{
            System.out.print("Digite numero positivo: ");
            numero = s.nextFloat();
            if( numero > 0 ) suma += numero; //solo sumamos numeros positivos
        }while( numero >= 0 );
        System.out.println("La suma de los numeros positivos es: "+suma);
    }
}
