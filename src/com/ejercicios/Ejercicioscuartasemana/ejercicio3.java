package com.ejercicios.Ejercicioscuartasemana;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner productos = new Scanner(System.in);
        System.out.println("Selecciona un producto");
        String producto = productos.nextLine();
        if (producto.contains("cacao")){
            System.out.println("El precio es de 2 €");
        } else if (producto.contains("avellanas")){
            System.out.println("El precio es de 3€");
        } else if (producto.contains("leche")) {
            System.out.println("El precio es de 1.50€");
        } else{
            System.out.println("El producto introducido no existe");
        }

    }
}


//Crea un programa que muestre por pantalla una selección de productos al usuario (3 o 4) y dependiendo de lo que escriba el usuario, se muestre el precio del producto.