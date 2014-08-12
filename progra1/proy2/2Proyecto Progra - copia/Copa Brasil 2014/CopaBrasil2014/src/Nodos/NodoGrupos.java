
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

import Listas.ListaEquipo;
import Listas.ListaGrupo;
/**
 *
 * @author Dinier
 */
public class NodoGrupos {
    
    private String nombre;
    private NodoGrupo grupo;
    private NodoGrupos siguienteGrupo;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the siguienteGrupo
     */
    public NodoGrupos getSiguienteGrupo() {
        return siguienteGrupo;
    }

    /**
     * @param siguienteGrupo the siguienteGrupo to set
     */
    public void setSiguienteGrupo(NodoGrupos siguienteGrupo) {
        this.siguienteGrupo = siguienteGrupo;
    }

    /**
     * @return the grupo
     */
    public NodoGrupo getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(NodoGrupo grupo) {
        this.grupo = grupo;
   }

   
    
}
