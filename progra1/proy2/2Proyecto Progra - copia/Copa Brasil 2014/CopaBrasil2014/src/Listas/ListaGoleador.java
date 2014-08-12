/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoGoleador;

/**
 *
 * @author Dinier
 */
public class ListaGoleador {
    
     private NodoGoleador listaGoleador;
    //METODO PARA INSERTAR GOLEADORES.
    public void Insertar(String nombre, NodoGoleador Goleador) {
        NodoGoleador nuevo;
        nuevo = new NodoGoleador();
        nuevo.setNombre(nombre);
        nuevo.setSiguienteGoleador(Goleador.getSiguienteGoleador());
        nuevo.setEquipos(Goleador.getEquipos());
        nuevo.setGoles(Goleador.getGoles());
        

       if(listaGoleador==null)
        {
            nuevo.setSiguienteGoleador(null
            );
            listaGoleador=nuevo;
        }
        else
        {
            NodoGoleador auxiliar=listaGoleador;
            while (auxiliar.getSiguienteGoleador()!=null) 
            {  
                auxiliar=auxiliar.getSiguienteGoleador();             
            }
            auxiliar.setSiguienteGoleador(nuevo);
        }        
    }
//METODO IMPRIMIR GOLEADORES.
   public void Imprimir()
    {
        NodoGoleador recorridoGoleador=listaGoleador;
        
        
        while(recorridoGoleador!=null)
        {
                System.out.println( "El nombre del jugador es: " +recorridoGoleador.getNombre()
                        + "\n " + "Goles anotados: " +recorridoGoleador.getGoles()+ "\n" 
                        + "Equipo: "  +recorridoGoleador.getEquipos());
                           
            
            recorridoGoleador=recorridoGoleador.getSiguienteGoleador();
        }
    }
    
    public boolean EstaVacia()
    {
        return listaGoleador==null;
    }

    /**
     * @return the listaResultado
     */
    public NodoGoleador getListaResultado() {
        return listaGoleador;
    }

    /**
     * @param listaResultado the listaResultado to set
     */
    public void setListaResultado(NodoGoleador listaResultado) {
        this.listaGoleador = listaResultado;
    }
    
}
