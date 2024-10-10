package com.mycompany._for1;
public class App {

    public static void main(String[] args) {
        //1) imprimir los numeros del 1 al 10 de uno en uno
        //10 iteraciones, forma 1
        for( int i = 1; i <= 10; i++ )
            System.out.println(i);
        //10 iteraciones, forma 2 (rara y no es practica)
        for( int i = 0; i < 10; i++ )
            System.out.println(i+1);
        
        //2) imprimir los numeros del 0 al 50 de dos en dos
        System.out.println("***********************");
        //26 iteraciones, forma 1
        for( int i = 0; i <= 50; i = i+2 )
            System.out.println(i);
        System.out.println("***********************");
        //26 iteraciones, forma 2 (usando operador de incremento +=
        for( int i = 0; i <= 50; i += 2 )
            System.out.println(i);
        System.out.println("***********************");
        //26 iteraciones, forma 3 (no tan comoda de leer)
        for( int i = 0; i <= 25; i++ )
            System.out.println(i+i);
        System.out.println("***********************");
        //51 iteraciones, menos eficiente, rara y poco practica
        for( int i = 0; i<= 50; i++ )
            if( i%2 == 0 )
                System.out.println(i);
        
        //3) imprimir los numeros del 0 al 50 de cinco en cinco 
        System.out.println("***********************");
        //11 iteraciones, forma 1
        for( int i = 0; i <= 50; i += 5 )
            System.out.println(i);
        System.out.println("***********************");
        //11 iteraciones, forma 2
        for( int i = 0; i <= 50; i = i + 5 )
            System.out.println(i);
        
        //4) recorrer los numeros del 1 al 50
        //pero solo imprimir los numeros impares.
        System.out.println("***********************");
        //51 iteraciones
        for( int i = 1; i <= 50; i++ )
            if( i%2 == 1 )
                System.out.println(i);
        
        /*5) imprimir los numeros del 1 al 100; colocar un asterisco
        a la derecha de aquellos numeros que son multiplo de 10*/
        //forma 1
        System.out.println("***********************");
        for( int i = 1; i <= 100; i++ ){
            if( i%10 != 0 )
                System.out.println(i);
            if( i%10 == 0 )
                System.out.println(i+"*");
        }
        //forma 2
        System.out.println("***********************");
        for( int i = 1; i <= 100; i++ ){
            if( i%10 == 0 )
                System.out.println(i+"*");
            else
                System.out.println(i);
        }
        //forma 3 (no es la mejor)
        System.out.println("***********************");
        for( int i = 1; i <= 100; i++ ){
            System.out.print(i);
            if( i%10 == 0 ) System.out.print("*");
            System.out.println();
        }
        /*6) imprimir los numeros del 10 al 1,
        de forma descendente de uno en uno*/
        //forma 1
        System.out.println("***********************");
        for( int i = 10; i >= 1; i-- )
            System.out.println(i);
        //forma 2
        System.out.println("***********************");
        for( int i = 10; i >= 1; i = i - 1 )
            System.out.println(i);
        //forma 3
        System.out.println("***********************");
        for( int i = 10; i >= 1; i -= 1 )
            System.out.println(i);
        
        /*7) imprimir los numeros del 10 al 0,
        de forma descendente de dos en dos*/
        System.out.println("***********************");
        for( int i = 10; i >= 0; i -= 2 )
            System.out.println(i);
        //forma extraña de resolver el anterior, confusa
        System.out.println("***********************");
        for( int i = 0; i <= 10; i = i + 2 )
            System.out.println(10-i);
        /*8) imprimir los numeros del 100 al 0,
        de forma descendente de diez en diez*/
        System.out.println("***********************");
        for( int i = 100; i >= 0; i -= 10)
            System.out.println(i);
        
        /*for permite tambien usar decimales como variable de control
        como por ejemplo para hacer saltos en pequeñas porciones*/
        //imprimir los numeros del 0 al 10 en saltos de 0.25 en 0.25
        System.out.println("***********************");
        for( float i = 0; i <= 10; i += 0.25f )
            System.out.println(i);
    }
}
