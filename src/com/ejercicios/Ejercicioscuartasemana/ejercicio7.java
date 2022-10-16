package com.ejercicios.Ejercicioscuartasemana;

import java.util.Scanner;

public class ejercicio7
{
    public static void main(String[] args) {
        Scanner cadena = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = cadena.nextLine();
        int numCaracteres = frase.length();
        if (numCaracteres % 2 == 0) {
            System.out.println("El número de carácteres es par " + numCaracteres) ;
        } else {
            System.out.println("El número de carácteres es impar " + numCaracteres);
        }
    }
}
