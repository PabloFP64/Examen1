package org.example;

import org.example.Practica1.Principal;

import java.util.Scanner;

public class Launcher {
    //elegimos que práctica queremos ejecutar
    public void launch() {
        //elegimos por teclado con scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número de la práctica que quieres ejecutar: ");
        int practica = scanner.nextInt();
        switch (practica) {
            case 1:
                //ejecutamos la práctica 1
                org.example.Practica1.Principal.main(null);
                break;
            case 2:
                //ejecutamos la práctica 2
                org.example.Practica2.Principal.main(null);
                break;
            case 3:
                //ejecutamos la práctica 3

                break;
        }


    }
}
