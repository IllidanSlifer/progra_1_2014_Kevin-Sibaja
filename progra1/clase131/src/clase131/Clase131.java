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
public class Clase131 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = {50,26,7,9,15,27};
        int[] arregloOrdenado;
        ejercicio1 oejercicio1 = new ejercicio1();
        arregloOrdenado = oejercicio1.OrdenamientoB(arreglo,"A");

        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.println(arregloOrdenado[i]);
        }
        
            
    }  
}
