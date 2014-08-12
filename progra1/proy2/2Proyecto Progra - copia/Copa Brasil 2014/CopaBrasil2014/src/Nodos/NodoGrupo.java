/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author Dinier
 */
public class NodoGrupo {
    
    private String nombre;
    private NodoEstadio Estadios;
    private NodoEquipo equipos;
    private NodoJugador jugadores;
    private NodoGrupo siguienteGrupo;

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
     * @return the Estadios
     */
    public NodoEstadio getEstadios() {
        return Estadios;
    }

    /**
     * @param Estadios the Estadios to set
     */
    public void setEstadios(NodoEstadio Estadios) {
        this.Estadios = Estadios;
    }

    /**
     * @return the equipos
     */
    public NodoEquipo getEquipos() {
        return equipos;
    }

    /**
     * @param equipos the equipos to set
     */
   public void setEquipos(NodoEquipo equipos) {
        this.equipos = equipos;
   }

    /**
     * @return the jugadores
     */
    public NodoJugador getJugadores() {
        return jugadores;
    }

    /**
     * @param jugadores the jugadores to set
     */
    public void setJugadores(NodoJugador jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * @return the siguienteGrupo
     */
    public NodoGrupo getSiguienteGrupo() {
        return siguienteGrupo;
    }

    /**
     * @param siguienteGrupo the siguienteGrupo to set
     */
    public void setSiguienteGrupo(NodoGrupo siguienteGrupo) {
        this.siguienteGrupo = siguienteGrupo;
    }
    
    
}
