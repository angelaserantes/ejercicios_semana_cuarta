package com.ejercicios.Ejercicioscuartasemana;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Introduce un número");
        int n1 = numeros.nextInt();
        if (n1 > 10) {
            System.out.println("El número es mayor que diez");

        } else if (n1 == 10) {
            System.out.println("El número es igual a diez");


        } else {
            System.out.println("El número es menor que diez");
        }
    }
}

//Crea un programa que muestre por pantalla si un número introducido por el usuario es mayor o menor que 10