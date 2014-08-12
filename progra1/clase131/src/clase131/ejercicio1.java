/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase131;

/**
 *
 * @author Estudiante
 */
public class ejercicio1 {

    public int[] OrdenamientoB(int[] arreglo, String ordenamiento) {
        int indice = 0;
        int indice2 = 0;
        int auxiliar = 0;
        
        if (ordenamiento.equals("B")) {
            
            for (indice = 0; indice < arreglo.length - 1; indice++) {
                for (indice2 = 0; indice2 < (((arreglo.length) - indice) - 1); indice2++) {
                    if (arreglo[indice2 + 1] < arreglo[indice2]) {
                        auxiliar = arreglo[indice2 + 1];
                        arreglo[indice2 + 1] = arreglo[indice2];
                        arreglo[indice2] = auxiliar;
                    }
                }
            }
        }
        else
        {
           for (indice = 0; indice < arreglo.length - 1; indice++) {
                for (indice2 = 0; indice2 < (((arreglo.length) - indice) - 1); indice2++) {
                    if (arreglo[indice2 + 1] > arreglo[indice2]) {
                        auxiliar = arreglo[indice2 + 1];
                        arreglo[indice2 + 1] = arreglo[indice2];
                        arreglo[indice2] = auxiliar;
                    }
                }
            } 
        }

        return arreglo;
    }
}
