/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoJugador;


/**
 *
 * @author Dinier
 */
public class ListaJugador {
    
   private NodoJugador listaJugadores;
   
   
   public String jugadorJoven(ListaJugador EqJ  )
   {NodoJugador prueba= EqJ.listaJugadores;
       String resultado="";
       String nombre=prueba.getNombre();
       int edad=prueba.getEdad();
       
       while(prueba != null)
       {
           if(prueba.getEdad() < edad) {
               edad=prueba.getEdad();
               nombre =prueba.getNombre();
           }
           prueba = prueba.getSiguienteJugador();
       }
       resultado= nombre+" " + edad;
       
       return resultado;
   }
   
   public String jugadorViejo(ListaJugador EqJ  )
   {NodoJugador prueba= EqJ.listaJugadores;
       String resultado="";
       String nombre=prueba.getNombre();
       int edad=prueba.getEdad();
       
       while(prueba != null)
       {
           if(prueba.getEdad() > edad) {
               edad=prueba.getEdad();
               nombre =prueba.getNombre();
           }
           prueba = prueba.getSiguienteJugador();
       }
       resultado= nombre+" " + edad;
       
       return resultado;
   }  
    public void Insertar(String nombre, int x)
    {
        NodoJugador nuevo;
        nuevo = new NodoJugador();
        nuevo.setNombre(nombre);
        nuevo.setEdad(x);
        NodoJugador auxiliar = getListaJugadores();
        
        if (getListaJugadores()==null) {
            auxiliar=nuevo;
            setListaJugadores(auxiliar);
        } else {
            if (x<auxiliar.getEdad()) {
                nuevo.setSiguienteJugador(auxiliar);
                auxiliar=nuevo;
                setListaJugadores(auxiliar);
            } else {
                NodoJugador reco=auxiliar;
                NodoJugador atras=auxiliar;
                while (x>=reco.getEdad() && reco.getSiguienteJugador()!=null) {
                    atras=reco;
                    reco=reco.getSiguienteJugador();
                }
                if (x>=reco.getEdad()) {
                    reco.setSiguienteJugador(nuevo);
                } else {
                    nuevo.setSiguienteJugador(reco);
                    atras.setSiguienteJugador(nuevo);
                }
            }
        }
    }
    
    
    
    public void Imprimir() {
        NodoJugador recorridoJugador = getListaJugadores();

        System.out.println("Listado de todos los elementos de la lista");
        while (recorridoJugador != null) {
            System.out.println(recorridoJugador.getNombre() + " " + recorridoJugador.getEdad());
            recorridoJugador = recorridoJugador.getSiguienteJugador();
        }
        System.out.println();
    }

    public boolean EstaVacia() {
        return getListaJugadores() == null;
    }

    public void EliminarJugador(String nombre) {
        NodoJugador siguienteJugador = listaJugadores;
        NodoJugador anterior = siguienteJugador;

        if (siguienteJugador == null) {
            System.out.println("Lista de jugadores vacia");
            return;
        }
        while (siguienteJugador != null) 
        {
            if (nombre.equals(siguienteJugador.getNombre())) 
            {
                if (siguienteJugador == listaJugadores) 
                {
                    listaJugadores = siguienteJugador.getSiguienteJugador();
                    return;
                }
                anterior.setSiguienteJugador(siguienteJugador.getSiguienteJugador());
                return;
            }
            anterior = siguienteJugador;
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
    }
    
    public NodoJugador BuscarJugador(String nombre)
    {
        NodoJugador siguienteJugador = listaJugadores;
        while (siguienteJugador != null) 
        {
            if (nombre.equals(siguienteJugador.getNombre())) 
            {
                return siguienteJugador;
            }
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
        return null;
    }
    
    public void ModificarJugador(String nombre,String nuevoNombre,int edad)
    {
        NodoJugador siguienteJugador = listaJugadores;
        while (siguienteJugador != null) 
        {
            if (nombre.equals(siguienteJugador.getNombre())) 
            {
                siguienteJugador.setNombre(nuevoNombre);
                siguienteJugador.setEdad(edad);
                return;
            }
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
    }
/*     public void EliminarJugador(String nombre)
    {
        NodoJugador siguienteJugador = listaJugadores;
        while (siguienteJugador != null) 
        {
            if (nombre.equals(siguienteJugador.getNombre())) 
            {
                siguienteJugador.setSiguienteJugador(siguienteJugador.getSiguienteJugador());
              
                return;
            }
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
    }*/
     

     

    /**
     * @return the listaJugadores
     */
    public NodoJugador getListaJugadores() {
        return listaJugadores;
    }

    /**
     * @param listaJugadores the listaJugadores to set
     */
    private void setListaJugadores(NodoJugador listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
    
}
