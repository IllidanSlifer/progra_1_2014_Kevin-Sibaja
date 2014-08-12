/*
 * CLASE PARA LISTA DE EQUIPOS.
 */

package Listas;

import Nodos.NodoEquipo;
import Nodos.NodoJugador;
import javax.swing.JOptionPane;

/**
 *
 * @author Jimenez
 */
public class ListaEquipo {
    
    public NodoEquipo listaEquipo;
    //METODO PARA INSERTAR .
    
    public void Insertar(String nombre,ListaJugador jugadores)
    {
        NodoEquipo nuevo;
        nuevo=new NodoEquipo();
        nuevo.setNombre(nombre);
        nuevo.setJugadores(jugadores.getListaJugadores());
        if(listaEquipo==null)
        {
            nuevo.setSiguienteEquipo(null);
            listaEquipo=nuevo;
        }
        else
        {
            NodoEquipo auxiliar=listaEquipo;
            while (auxiliar.getSiguienteEquipo()!=null) 
            {  
                auxiliar=auxiliar.getSiguienteEquipo();             
            }
            auxiliar.setSiguienteEquipo(nuevo);
        }        
    }
    
    public void Imprimir(String equipo)
    {
          NodoEquipo siguienteEquipos = CargarDatos.equipos.listaEquipo;
       
          while (siguienteEquipos != null) {
            
            if (equipo.equals(siguienteEquipos.getNombre())) {

            
            NodoJugador recorridoJugadores=siguienteEquipos.getJugadores();
            while(recorridoJugadores!=null)
            {
                 JOptionPane.showMessageDialog(null,recorridoJugadores.getNombre() +  " \n "+"Edad:  " +recorridoJugadores.getEdad()+" Años. ");
                recorridoJugadores=recorridoJugadores.getSiguienteJugador();
            }
                break;
           
            }
            
            siguienteEquipos = siguienteEquipos.getSiguienteEquipo();
        }
        
       
    }
    
    public boolean EstaVacia()
    {
        return listaEquipo==null;
    }

    Object getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
