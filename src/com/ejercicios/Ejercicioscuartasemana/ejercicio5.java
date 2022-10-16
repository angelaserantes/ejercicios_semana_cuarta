package com.ejercicios.Ejercicioscuartasemana;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        System.out.println("introduce una frase");
        String frase = texto.nextLine();
        if (frase.contains("b") & frase.contains("p") & frase.contains("v") & frase.contains("u") ){
            System.out.println("La frase  contiene b, p, v y u");
        } else if (frase.contains("v") & frase.contains("u")) {
            System.out.println("La frase contiene v y u");
        } else if  (frase.contains("b") & frase.contains("p")){
            System.out.println("La frase contiene b y p");
        }  else{ System.out.println("La frase no contiene al mismo tiempo b, p, v y u");}
    }
}

//Crea un programa que pida una frase al usuario y comprueba si en esa frase
//contiene alguna b o v. Si existe una b, buscar si tiene alguna p la frase. Si
//tiene v, buscar si tiene u. Estas cláusulas no son excluyentes. Mostrar por
//pantalla si son ciertos todos los casos.