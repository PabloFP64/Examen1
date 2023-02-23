package org.example.Practica1;
import java.util.Scanner;


public class Matematicas {
    public static double generarNumeroPi(double PuntosTotales) {
        //hacemos un metodo de aproximacion de pi con el método montecarlo
        double pi = 0;
        //Metodo montecarlo
        for (int i = 0; i < PuntosTotales; i++) {
            double x = Math.random();
            double y = Math.random();
            if (Math.pow(x, 2) + Math.pow(y, 2) <= 1) {                pi++;
            }
        }
        pi = 4 * pi / PuntosTotales;
        return pi;
    }

}
