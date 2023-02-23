package org.example.Practica1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Recibimos por teclado con scanner puntosTotales
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa los puntos totales: ");
        double puntosTotales = scanner.nextInt();
        System.out.println("El número PI es " +  Matematicas.generarNumeroPi(puntosTotales));

    }
}
