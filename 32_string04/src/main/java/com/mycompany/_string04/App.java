package com.mycompany._string04;
public class App {
    public static void main(String[] args) {
        //Conversiones
        //convetir de String a int
        String str1 = "500";
        int entero1 = Integer.parseInt(str1);
        System.out.println("str1: "+str1);
        System.out.println("entero1: "+entero1);
        
        //convertir de String a float
        String str2 = "3.1416423432424";
        float f1 = Float.parseFloat(str2);
        System.out.println("str2: "+str2);
        System.out.println("f1: "+f1);
        
        //convertir de String a Double
        String str3 = "10.432424242442";
        double d1 = Double.parseDouble(str3);
        System.out.println("str3: "+str3);
        System.out.println("d1: "+d1);
        
        //convertir desde cualquier tipo de dato primivo
        //hacia String
        int entero2 = 908;
        float f2 = 5.654353453242f;
        long l1 = 14011982010554L;
        double d2 = 897.4234243;
        String str4 = String.valueOf(entero2);
        String str5 = String.valueOf(f2);
        String str6 = String.valueOf(l1);
        String str7 = String.valueOf(d2);
        System.out.println("str4: "+str4);
        System.out.println("str5: "+str5);
        System.out.println("str6: "+str6);
        System.out.println("str7: "+str7);
    }
}
