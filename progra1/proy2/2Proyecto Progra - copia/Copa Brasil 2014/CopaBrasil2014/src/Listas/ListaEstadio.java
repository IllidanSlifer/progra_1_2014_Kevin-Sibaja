/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;



import Nodos.NodoEquipo;
import Nodos.NodoEstadio;


/**
 *
 * @author Dinier
 */
public class ListaEstadio {
    private NodoEstadio listaEstadios;
    
/*    public void Insertar(String nombre,NodoEstadio Estadios)
    {
        NodoEstadio nuevo;
        nuevo=new NodoEstadio();
        nuevo.setNombre(nombre);
        nuevo.setSiguienteEstadio(Estadios.getSiguienteEstadio());
        if(listaEstadios==null)
        {
            nuevo.setSiguienteEstadio(null);
            listaEstadios=nuevo;
        }
        else
        {
            NodoEstadio auxiliar=listaEstadios;
            while (auxiliar.getSiguienteEstadio()!=null) 
            {  
                auxiliar=auxiliar.getSiguienteEstadio();             
            }
            auxiliar.setSiguienteEstadio(nuevo);
        }        
    }*/
    
    
        public void InsertarE(String nombre,ListaEquipo equipos,String Clima,int personas)
    {
        NodoEstadio nuevo;
        nuevo=new NodoEstadio();
        nuevo.setNombre(nombre);
        nuevo.setEquipos(equipos.getRaiz());
        nuevo.setClima(Clima);
        nuevo.setCantidadPersonas(personas);
        if(listaEstadios==null)
        {
            nuevo.setSiguienteEstadio(null);
            listaEstadios=nuevo;
            
        }
        else
        {
            NodoEstadio auxiliar=listaEstadios;
            while (auxiliar.getSiguienteEstadio()!=null) 
            {  
                auxiliar=auxiliar.getSiguienteEstadio();             
            }
            auxiliar.setSiguienteEstadio(nuevo);
        }        
    }
    
    
    
    public void Imprimir()
    {
        NodoEstadio recorridoEstadios=listaEstadios;
        
       System.out.println("Listado de todos los elementos de la lista");
        while(recorridoEstadios!=null)
        {
                System.out.println( "El nombre del estadio es: " +recorridoEstadios.getNombre()
                        + "\n " + "El clima es: " +recorridoEstadios.getClima()+ "\n" 
                        + "La cantidad de expectadores es de: "  +recorridoEstadios.getCantidadPersonas() 
                        + "\n" + "La cantidad de partidos que se jugaron son: " 
                        +recorridoEstadios.getPartidosJugados()
                        +"\n"+recorridoEstadios.getEquipos().getNombre()
                        +"\n"+recorridoEstadios.getEquipos().getJugadores().getNombre());   
            
            recorridoEstadios=recorridoEstadios.getSiguienteEstadio();
        }
    }
    
     public void ImprimirCl()
    {
        NodoEstadio recorridoEstadios=listaEstadios;
        
       System.out.println("Listado de todos los elementos de la lista");
        while(recorridoEstadios!=null)
        {
                System.out.println( "El nombre del estadio es: " +recorridoEstadios.getNombre()
                        + "\n " + "El clima es: " +recorridoEstadios.getClima()+ "\n" 
                        +"\n"+recorridoEstadios.getEquipos().getNombre()
                        +"\n"+recorridoEstadios.getEquipos().getJugadores().getNombre());   
            
            recorridoEstadios=recorridoEstadios.getSiguienteEstadio();
        }
    }
    
    public boolean EstaVacia()
    {
        return listaEstadios==null;
    }

    /**
     * @return the listaEstadios
     */
    public NodoEstadio getListaEstadios() {
        return listaEstadios;
    }

    /**
     * @param listaEstadios the listaEstadios to set
     */
    public void setListaEstadios(NodoEstadio listaEstadios) {
        this.listaEstadios = listaEstadios;
    }
}
    

