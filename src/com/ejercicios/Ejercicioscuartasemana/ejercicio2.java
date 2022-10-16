package com.ejercicios.Ejercicioscuartasemana;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = dato.nextLine();
        if (palabra.contains("b")){
            System.out.println("Contiene la letra b minúscula");
        }else {
            System.out.println("No contiene la letra b minúscula");
        }
    }
}


//Crea un programa que muestre por pantalla si una palabra que introduzca el usuario contiene la letra b minúscula.