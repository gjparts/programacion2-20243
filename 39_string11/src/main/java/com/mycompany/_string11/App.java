package com.mycompany._string11;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*Metodo substring
        Devuelve un String que esta dentro de otro String
        en JAVA lo usamos de dos maneras:
        1) .substring(posicion_inicial)
           nos devuelve un String desde la posicion inicial hasta el resto del Srring
        2) .substring(posicion_inicial, posicion_final)
           nos devuelve un String desde la posicion inicial hasta la posicion final*/
        String str = "El veloz murcielago hindu comida feliz kiwi y cardillo.";
        System.out.println(str);
        System.out.println("Substring desde la posicion 0 hasta la 7: "+str.substring(0,7));
        //no se puede extraer de posiciones que no existen (en este caso la posicion 1000)
        //System.out.println("Substring desde la posicion 5 hasta la 1000: "+str.substring(5,1000));
        System.out.println("Substring desde la posicion 5 hasta la 21: "+str.substring(5,21));
        //posicion inicial no debe de ser mayor a posicion final:
        //System.out.println("Substring desde la posicion 25 hasta la 9: "+str.substring(25,9));
        //usando la forma 1:
        System.out.println("Substring desde la posicion 7: "+str.substring(7));
        System.out.println("Substring desde la posicion 12: "+str.substring(12));
        /*Leer un numero de cedula de Honduras (DNI), el programa
        unicamente debe validar que este numero tenga 13 caracteres.
        * el programa deberá eliminar los espacios de relleno, güiones,
          güiones bajos, espacios en blanco de la cadena.
        
        *Luego de leer la cedula mostrar la informacion siguiente:
        1) numero de departamento
        2) numero de municipio
        3) año de asentamiento
        4) correlativo en que fue asentado
        
        ejemplo:
        Digitar cedula: 1401-1982-01055
        Resultado:
        Departamento: 14
        Municipio: 01
        Año de asentamiento: 1982
        Correlativo: 01055*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digite su DNI: ");
        String dni = s.nextLine();
        //eliminacion de espacios de relleno, güiones
        //güiones bajos, espacios en blanco
        dni = dni.trim().replace("-", "").replace("_", "").replace(" ", "");
        //comprobar la longitud
        if( dni.length() == 13 ){
            System.out.println("Departamento: "+dni.substring(0,2));
            System.out.println("Municipio: "+dni.substring(2,4));
            System.out.println("Anio de Asentamiento: "+dni.substring(4,8));
            System.out.println("Correlativo: "+dni.substring(8));
        }
        else
            System.out.println("DNI debe de ser de 13 digitos.");
    }
}