/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Clase15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] arreglo = {"Mario","Efren", "Susana", "Campbell", "Aquiles", "Illidan"};
        BusquedaLineal bl = new BusquedaLineal();
        
        System.out.print("la busqueda lineal es" + bl.BuscarNombre(arreglo, "Illidan"));
        
        System.out.println();
        
        String[] arreglo2 = {"Susana", "Illidan", "Mario", "Campbell", "Aquiles", "Efren"};
                
        BusquedaBinaria bb = new BusquedaBinaria();
        System.out.print("la busqueda binaria es" + bb.BuscaNombre(arreglo2, "Illidan"));
        System.out.println();

    }
}
