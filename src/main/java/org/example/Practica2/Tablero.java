package org.example.Practica2;

import java.util.Random;

public class Tablero{
    private static int DIMENSION = 30;
    private int[][] estadoActual; //matriz que representa el
    // estado actual.
    private int[][] estadoSiguiente
            = new int[DIMENSION][DIMENSION]; // Matriz que representa el estado siguiente.
public void leerEstadoActual(){
    for (int i = 0; i < DIMENSION; i++) {
        for (int j = 0; j < DIMENSION; j++) {
            if (estadoSiguiente[i][j] == 1) {
                System.out.print("X");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println();
}

// La secuencia de ceros y unos del fichero es guardada en ‘estadoActual‘ y, utilizando las reglas del juego de la vida, se insertan los ceros y unos correspondientes en ‘estadoSiguiente‘.
    /********************************************************
     * Genera un estado inicial aleatorio. Para cada celda
     * genera un número aleatorio en el intervalo [0, 1). Si
     * el número es menor que 0,5, entonces la celda está
     * inicialmente viva. En caso contrario, está muerta.
     *******************************************************/
    public void generarEstadoActualPorMontecarlo(){
        Random rand = new Random();
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoSiguiente[i][j] = rand.nextInt(2);

            }
        }
        //leerEstadoActual();
    }
// La secuencia de ceros y unos generada es guardada en ‘estadoActual‘ y, utilizando las reglas del juego de la vida, se insertan los ceros y unos correspondientes en ‘estadoSiguiente‘.
    /********************************************************
     * Transita al estado siguiente según las reglas del
     * juego de la vida.
     ********************************************************/
    public void transitarAlEstadoSiguiente(){
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                int vecinos = 0;
                if (i > 0 && j > 0 && estadoSiguiente[i - 1][j - 1] == 1) {
                    vecinos++;
                }
                if (i > 0 && estadoSiguiente[i - 1][j] == 1) {
                    vecinos++;
                }
                if (i > 0 && j < DIMENSION - 1 && estadoSiguiente[i - 1][j + 1] == 1) {
                    vecinos++;
                }
                if (j > 0 && estadoSiguiente[i][j - 1] == 1) {
                    vecinos++;
                }
                if (j < DIMENSION - 1 && estadoSiguiente[i][j + 1] == 1) {
                    vecinos++;
                }
                if (i < DIMENSION - 1 && j > 0 && estadoSiguiente[i + 1][j - 1] == 1) {
                    vecinos++;
                }
                if (i < DIMENSION - 1 && estadoSiguiente[i + 1][j] == 1) {
                    vecinos++;
                }
                if (i < DIMENSION - 1 && j < DIMENSION - 1 && estadoSiguiente[i + 1][j + 1] == 1) {
                    vecinos++;
                }
                if (estadoSiguiente[i][j] == 1) {
                    if (vecinos < 2 || vecinos > 3) {
                        estadoSiguiente[i][j] = 0;
                    }
                } else {
                    if (vecinos == 3) {
                        estadoSiguiente[i][j] = 1;
                    }
                }
            }
        }
        //leerEstadoActual();
    }
// La variable ‘estadoActual‘ pasa a tener el contenido de ‘estadoSiguiente‘ y, éste útimo atributo pasar a reflejar el siguiente estado.
    /*******************************************************
     * Devuelve, en modo texto, el estado actual.
     * @return el estado actual.
     *******************************************************/
    @Override
    public String toString(){
        String estado = "";
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                if (estadoSiguiente[i][j] == 1) {
                    estado += "X";
                } else {
                    estado += " ";
                }
            }
            estado += "";

    }
    return estado;
    }
}

