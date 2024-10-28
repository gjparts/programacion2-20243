package com.mycompany._string01;
public class App {
    public static void main(String[] args) {
        /*String (cadena de texto)
        Es una coleccion de elementos char
        -> en JAVA es una clase
        -> No es necesario importar ningnua libreria ya que
           String forma parte del lenguaje JAVA (java.lang)*/
        //declarar variables String
        String str1;
        String str2 = "Gerardo Portillo";
        String str3 = "algo", str4 = "abc";
        /*Si una variable String no se inicializa con un valor, no es posible leela*/
        //System.out.println(str1);
        //si tiene valor entonces se puede consultar
        System.out.println(str2);
        //concatenar String
        String a = "Ingenieria";
        String b = "Sistemas";
        String c = a+b;
        System.out.println(c);
        String d = a+" en "+b;
        System.out.println(d);
        //tambien podemos concatenarle numeros siempre y cuando halla un String en la concatenacion
        int x = 8, y = 15;
        //String e = x; //no se puede
        String e = x+""; //si se puede
        String f = "La suma de x mas y es: "+(x+y);
        //no olviden el uso de parentesis cuando concatenen operaciones matematicas con String
        System.out.println(f);
        
        //tamaño de un String
        String fruta = "Manzana verde";
        System.out.println("Cantidad de caracteres en fruta: "+fruta.length());
        //el metodo length() en un String devuelve un numero entero con
        //la cantidad de caracteres del String.
        int numero = fruta.length();
        System.out.println("Cantidad de caracteres en fruta: "+numero);
        
        //recorrer nu String caracter por caracter (extraccion de char)
        //los caracteres en un String se numeran de 0 a length()-1 (zero indexing)
        //voy a imprimir en una linea cada char del String
        for( int i = 0; i < fruta.length(); i++ ){
            System.out.println( fruta.charAt(i) );
        }
        //podemos tambien obtener los char sin necesidad de utilizar una estruc. for
        System.out.println("Primer char de fruta: "+fruta.charAt(0));
        System.out.println("Ultimo char de fruta: "+fruta.charAt( fruta.length()-1) );
        
        //obtener las versiones en mayusculas y minusculas de String
        String comida = "Baleada con Todo";
        //metodo toUpperCase: devuelve una version en mayusculas de un String
        //sin afectar al String original.
        System.out.println("comida en mayusculas: "+comida.toUpperCase());
        System.out.println("comida, variable original: "+comida);
        //metodo toLowerCase: devuelve una version en minusculas de un String
        //sin afectar al String original.
        System.out.println("comida en minusculas: "+comida.toLowerCase());
        System.out.println("comida, variable original: "+comida);
        //ejercicio
        String bebida = "Coca Cola 3L";
        //convertir a mayusculas el String bebida; pero afectando al String original
        System.out.println("bebida, variable original: "+bebida);
        bebida = bebida.toUpperCase();
        System.out.println("bebida, variable original: "+bebida);
        
        //obtener una version del String; pero sin relleno de espacios iniciales y finales
        //el metodo a usar se llama trim() y no afecta al String original
        String estudiante = "     Gerardo Portillo                  ";
        System.out.println("estudiante, variable original: "+estudiante);
        System.out.println("estudiante, longitud de variable original: "+estudiante.length());
        //imprimir la version trim() de estudiante
        System.out.println("estudiante, usando trim: "+estudiante.trim());
        System.out.println("estudiante, longitud usando trim: "+estudiante.trim().length());
        //comprobar que no se afecto a la variable original:
        System.out.println("estudiante, variable original: "+estudiante);
        System.out.println("estudiante, longitud de variable original: "+estudiante.length());
        //ahora deseamos sobreescribir a la variable original estudiante hacia su
        //version sin espacios en blanco
        estudiante = estudiante.trim();
        System.out.println("******* hemos afecta a la variable orignal *******");
        System.out.println("estudiante, variable original: "+estudiante);
        System.out.println("estudiante, longitud de variable original: "+estudiante.length());
    }
}
