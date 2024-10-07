package com.mycompany._captura10;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Haga un programa que pregunte al usuario por su salario mensual y su antigüedad en años
        El programa le dira cuanto es el bono obtenido, este se calcula de
        la siguiente forma:
        multiplicar el salario mensual por un porcentaje de acuerdo a su antigüedad en años
        el porcentaje sale de esta tabla:

        Antigüedad    	 		% bono
        menos de 5 años	 		10%
        de 5 a menos de 10 años		15%
        de 10 a menos de 20 años	20%
        20 años o mas			25%*/
        Scanner x = new Scanner(System.in);
        float salario, anios, bono = 0;
        System.out.print("Salario mensual: ");
        salario = x.nextFloat();
        System.out.print("Años de antiguedad: ");
        anios = x.nextFloat();
        //calculo del bono
        if( anios < 5 ) bono = salario*0.10f;
        if( anios >= 5 && anios < 10 ) bono = salario*0.15f;
        if( anios >= 10 && anios < 20 ) bono = salario*0.20f;
        if( anios >= 20 ) bono = salario*0.25f;
        
        System.out.println("El bono es: "+bono);
    }
    
}
