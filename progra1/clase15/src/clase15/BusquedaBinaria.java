/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15;

/**
 *
 * @author Estudiante
 */
public class BusquedaBinaria {

    public int BuscaNombre(String[] nombres, String busqueda) {
        int inicial = 0;
        int elementofinal = nombres.length - 1;

        while (inicial < elementofinal) {
            int central = (inicial + elementofinal) / 2;
            if (busqueda.compareTo(nombres[central]) > 0) {
                inicial = central + 1;

            } else {
                if (busqueda.compareTo(nombres[central]) > 0) {
                    elementofinal = central + 1;
                } else {
                    return central;
                }
            }
        }
        return -1;
    }
}
