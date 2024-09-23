/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._variables;

/**
 *
 * @author Gerardo
 */
public class App {

    public static void main(String[] args) {
        /*Variables
        Los tipos de datos de datos de la variables
        se agrupan en dos tipos:
        1) tipos de datos primitivos: son aquellos
           que vienen definidos en el compilador del lenguaje
            * int
            * char
            * float
            * double
            * bool (boolean)
            * void
            * long
        2) tipos de datos compuestos: estan hechos de varios
           tipos de datos primitivos, ejemplos:
            * string (String)
            * Date
            * Scanner
            * Random
            * JTextField
        CONSIDERACIONES AL NOMBRAR VARIABLES:
        1) Su nombre no puede comenzar con numero
        2) No se debe usar espacios en blanco para nombrarlas
        3) No se debe usar ciertos caracteres especiales
           para nombrarlas (depende del lenguaje)
        4) no se puede usar palabras reservadas como nombre
           de variable, ejemplo: int, double, for, if, switch...
           (depende del lenguaje)
        5) Recuerde que debe respetar las mayusculas/minusculas
           usadas a la hora de nombrar sus variables.
        6) dos variables no pueden tener el mismo nombre dentro
           del mismo ambito (scope)*/
        //practica:
        int a; //declarar variable sin inicializar
        //una variable sin inicializar, no puede ser leida:
        //System.out.println(a);
        //declarar variable inicializada:
        int b = 5;
        System.out.println("valor de b: "+b);
        //declarar varias variables del mismo tipo
        int num1 = 7, num2 = 8, num3 = 5;
        double pi = 3.1416, abc = 2.456;
        //los float si llevan decimales necesita que
        //se les coloque una f al final del valor
        float gravedad = 9.8f;
        float algo = 5;
        //diferencia en int y long
        //int mide 4 bytes, no le cabe un valor como la cedula
        //en cambio long mide 8 bytes ahi si cabe dicho valor:
        //int cedula = 1401198201055;
        //importante: si usa long no olvide colocar una L al final
        //del valor
        long dni = 1401198201055L;
        //uso de char:
        char letra1 = 'a'; //comita simple: alt+39
        char vocal2 = 'e', letra5 = 'Z';
        //uso de boolean
        boolean otracosa = true;
        boolean opcion = false;
        
        /*ley de precendencia de operadores
        la expresiones se evaluan de izq. a der. y respetando
        la tabla siguiente:
        a) parentesis ()
        b) exponentes (pow)
        c) multiplicaciones y divisiones
        d) sumas y restas*/
        double cifra1 = 5, cifra2 = 3, cifra3 = 2;
        //resolver la suma de cifra1 mas cifra2 y todo ello entre cifra3
        System.out.println( (cifra1+cifra2)/cifra3 );
        //otro ejemplo (hecho en la pizarra)
        System.out.println( (cifra1-cifra2)/(cifra1+cifra3) );
        
        //concatenar: unir los contenidos de dos expresiones
        System.out.println("El valor de la gravedad en la tierra es "+gravedad);
        System.out.println("cifra1 vale "+cifra1+", cifra2 vale "+cifra2);
        /*observe que el operador de suma tambien se usa para unir String con numeros
        esto se debe a que el operador suma esta sobrecargado, si el operador
        se usa en numeros entonces los va a sumar, si se usa en String entonces
        va a unirlos. Todo obedeciendo a la ley de precendencia de operadores
        como en el ejemplo siguiente:*/
        System.out.println("La suma de cifra1 y cifra2 es "+cifra1+cifra2);
        //el resultado anterior concatena a cifra1 y cifra2 porque la expresion
        //se evalua de izquierda a derecha, String+numero = String
        //solucion: usar parentesis porque estan a la cabeza en la tabla de operadores:
        System.out.println( "La suma de cifra1 y cifra2 es "+(cifra1+cifra2) );
        
        //uso de las funciones de la clase Math
        //elevar un numero a determinada potencia
        double n1 = 81, n2 = 3;
        //elevar n1 al cuadrado
        System.out.println("n1 al cuadrado: "+Math.pow(n1, 2));
        //elevar n2 al cubo
        System.out.println("n2 al cubo: "+Math.pow(n2, 3));
        //en la clase Math tambien hay valores contantes como por ejemplo:
        System.out.println("El valor de pi es "+Math.PI);
        System.out.println("El exponencial es "+Math.E);
        System.out.println("El logaritmo de n2 es "+Math.log(n2));
        
        //raiz cuadrada
        System.out.println("La raiz cuadrada de n1 es: "+Math.sqrt(n1));
        double n3 = 27;
        //raiz cubica de n3:
        System.out.println("La raiz cubica de n3 es: "+Math.pow(n3, 1.0/3.0));
        //raiz quinta de n1:
        System.out.println("La raiz quinta de n1 es: "+Math.pow(n3, 1.0/5.0));
        
        //importante:
        System.out.println("Division entera de 1/3 es: "+(1/3));
        System.out.println("Residuo de dividir 1/3 es: "+(1%3));
        
        System.out.println("Division entera de 5/2 es: "+(5/2));
        System.out.println("Residuo de dividir 5/2 es: "+(5%2));
        
        
        System.out.println("Division racional de 1/3 es: "+(1.0/3.0));
        System.out.println("Division racional de 5/2 es: "+(5.0/2.0));
        
        //redondeo al entero mas proximo
        double c1 = 5.82, c2 = 5.23, c3 = 5.000001;
        System.out.println("round de c1 es: "+Math.round(c1));
        System.out.println("round de c2 es: "+Math.round(c2));
        System.out.println("round de c3 es: "+Math.round(c3));
        
        //ceil: devuelve el entero superior al double enviado
        //con un decimal que se pase entonces devuelve el siguiente entero
        System.out.println("ceil de c1 es: "+Math.ceil(c1));
        System.out.println("ceil de c2 es: "+Math.ceil(c2));
        System.out.println("ceil de c3 es: "+Math.ceil(c3));
        
        //floor: devuelve el entero inferior al double enviado
        //podemos decir que floor devuelve la parte entera del decimal
        System.out.println("floor de c1 es: "+Math.floor(c1));
        System.out.println("floor de c2 es: "+Math.floor(c2));
        System.out.println("floor de c3 es: "+Math.floor(c3));
    }
}
