/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica13;

/**
 *
 * @author Estudiante
 */
public class clase13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] arreglo = {56, 4, 85, 85, 42};
        int[] arregloOrdenado;
        ejercicio1 oejercicio1 = new ejercicio1();
        arregloOrdenado = oejercicio1.OrdenS(arreglo, "A");

        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.println(arregloOrdenado[i]);
        }
    }

}
