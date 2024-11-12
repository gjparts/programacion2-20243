package com.mycompany._string12;
public class App {
    public static void main(String[] args) {
        /*Metodo split
        Crea un arreglo de elementos String
        que nace de dividir en partes a otro String. Cada
        parte esta delimitada por un un String conocido como token.*/
        String str = "Sistemas,Civil,Mecanica,Electrica,Industrial";
        String arreglo[]; //este es el arreglo
        //apuntamos a arreglo el resultado de split, el token a
        //usar va a ser una coma (,)
        arreglo = str.split(",");
        //recorrer e imprimir el arreglo
        for( int i = 0; i < arreglo.length; i++ )
            System.out.println( "Posicion: "+i+", valor: "+arreglo[i] );
        //el token puede ser cualquier String, hay excepciones
        //por ejemplo no se puede usar caracteres reservados como \
        str = "890_Gerardo Portillo_080255_170045_2024/11/11";
        String arreglo2[] = str.split("_");
        for( int i = 0; i < arreglo2.length; i++ )
            System.out.println( "Posicion: "+i+", valor: "+arreglo2[i] );

        //el token tambien puede ser una palabra o frase:
        //split considera mayusculas/minusculas (case sensitive)
        str = "HondaSEPARADORCivicSEPARADOR2004SEPARADORNegroSEPARADORImportado";
        arreglo2 = str.split("SEPARADOR"); //puede reutilizar el arreglo
        for( int i = 0; i < arreglo2.length; i++ )
            System.out.println( "Posicion: "+i+", valor: "+arreglo2[i] );
        
        //hay otros caracteres no permitidos; pero que no dan error, por ejemplo: |
        str = "Doritos|Churritos|5|12.00|60.00|Frito Lay";
        arreglo2 = str.split("|");
        for( int i = 0; i < arreglo2.length; i++ )
            System.out.println( "Posicion: "+i+", valor: "+arreglo2[i] );
        //el caso anterior demuestra que la | lo que hace es partir en chars a str
        //la explicacion es: la barra | se usa para hacer expresiones regulares
        //por lo tanto no se puede usar como token.
    }
}
