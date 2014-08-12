/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15;

/**
 *
 * @author Estudiante
 */
public class BusquedaLineal {

    public int BuscarNombre(String[] nombres, String busqueda) {

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(busqueda)) {
                return (i);
            }
        }

        return -1;
    }
}
