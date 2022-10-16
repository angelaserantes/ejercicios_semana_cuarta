package com.ejercicios.Ejercicioscuartasemana;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Introduce un número");
        int n1 = numeros.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}


//Crea un programa que calcule si un número dado por el usuario es par o impar y lo muestre por pantalla.