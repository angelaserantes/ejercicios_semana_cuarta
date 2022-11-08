package com.ejercicios.Ejercicioscuartasemana;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Dime una figura geométrica");
        String figura = datos.nextLine();
        if (figura.contains("triángulo")){
            System.out.println("Introduce el valor de la base");
            int base = datos.nextInt();
            System.out.println("Introduce el valor de la altura");
            int altura = datos.nextInt();
            int areaTriangulo = (base * altura) / 2;
            System.out.println("El área del triángulo es " + areaTriangulo);
        } else if (figura.contains("rectángulo")) {
            System.out.println("Introduce el valor de la base");
            int base = datos.nextInt();
            System.out.println("Introduce el valor de la altura");
            int altura = datos.nextInt();
            int areaRectangulo = (base * altura);
            System.out.println("El área del rectángulo es " + areaRectangulo);
        } else if (figura.contains("pentágono")) {
            System.out.println("Introduce el valor del perímetro");
            int perimetro = datos.nextInt();
            System.out.println("Introduce el valor del apotema");
            int apotema = datos.nextInt();
            int areaPentagono = (perimetro * apotema) / 2;
            System.out.println("El área del pentágono es " + areaPentagono);
        } else if (figura.contains("hexágono")) {
            System.out.println("Introduce el valor del perímetro");
            int perimetro = datos.nextInt();
            System.out.println("Introduce el valor del apotema");
            int apotema = datos.nextInt();
            int areaHexagono = (perimetro * apotema) / 2;
            System.out.println("El área del hexágono es " + areaHexagono);
        }else {System.out.println("La figura no está en nuestro sistema");}
    }
}

//Crea un programa que muestre por pantalla distintas figuras geométricas (triángulo, rectángulo, pentágono y hexágono). Según lo que escoja el usuario, se le pedirá que introduzca unos valores clave para calcular el área de la figura seleccionada. Mostrar por pantalla el resultado.