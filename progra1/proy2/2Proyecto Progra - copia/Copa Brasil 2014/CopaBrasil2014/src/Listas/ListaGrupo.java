/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoEquipo;
import Nodos.NodoJugador;
import Nodos.NodoGrupo;

/**
 *
 * @author Dinier
 */
public class ListaGrupo {
    
      private NodoGrupo raiz;
     
     
       public void InsertarG(String nombre,ListaJugador jugadores)
    {
        NodoGrupo nuevo;
        nuevo=new NodoGrupo();
        nuevo.setNombre(nombre);
        nuevo.setJugadores(jugadores.getListaJugadores());
        if(getRaiz()==null)
        {
            nuevo.setSiguienteGrupo(null);
            setRaiz(nuevo);
        }
        else
        {
            NodoGrupo auxiliar=getRaiz();
            while (auxiliar.getSiguienteGrupo()!=null) 
            {  
                auxiliar=auxiliar.getSiguienteGrupo();             
            }
            auxiliar.setSiguienteGrupo(nuevo);
        }        
    }
     
     
     
     public void Insertar(NodoGrupo dato) {
 
        if (getRaiz() == null) {
            dato.setSiguienteGrupo(null);
            
            setRaiz(dato);
        } else {
            dato.setSiguienteGrupo(getRaiz());
            setRaiz(dato);
        }
    }
     
    
      public int Cantidad() {
        int cont = 0;
        NodoGrupo conta = getRaiz();
        while (conta != null) {
            conta = conta.getSiguienteGrupo();
            cont++;
        }

        return cont++;

    }
      public NodoGrupo[] ordInscNameAlfa(NodoGrupo[] arreglo) {
        int in;
 
        for (int i = 1 ; i < arreglo.length ; i++) {
            NodoGrupo aux = arreglo[i];
            in = i;    //inicia el desplazamiento en i
             
            while (in > 0 && arreglo[in - 1].getNombre().compareTo(aux.getNombre()) > 0) {
                arreglo[in] = arreglo[in - 1];    //desplaza el elemento hacia la derecha
                --in;
            }
 
            arreglo[in] = aux;    //inserta elemento
        }
        return arreglo;
    }
    
    public void arreglo() {

        NodoGrupo recorrido = getRaiz();
        NodoGrupo arreglo[] = new NodoGrupo[Cantidad()];
        int cont = 0;
        while (recorrido != null) {
            arreglo[cont] = recorrido;
            cont++;
            recorrido = recorrido.getSiguienteGrupo();
        }
        arreglo = ordInscNameAlfa(arreglo);
                //ordenamientoburbuja(arreglo);
        setRaiz(null);
        for (int i = arreglo.length-1; i >= 0; i--) {
            Insertar(arreglo[i]);
        }

    }
    
    public void Imprimir()
    {
        NodoGrupo recorridoGrupo=getRaiz();
        
        System.out.println("Listado de todos los elementos de la lista");
        while(recorridoGrupo!=null)
        {
            System.out.println(recorridoGrupo.getNombre());
            
            NodoJugador recorridoJugadores=recorridoGrupo.getJugadores();
            while(recorridoJugadores!=null)
            {
                System.out.println(recorridoJugadores.getNombre() + " " +recorridoJugadores.getEdad());
                recorridoJugadores=recorridoJugadores.getSiguienteJugador();
            }
            recorridoGrupo=recorridoGrupo.getSiguienteGrupo();
        }
        System.out.println();
    }
    
    public boolean EstaVacia()
    {
        return getRaiz()==null;
    }

    /**
     * @return the raiz
     */
    public NodoGrupo getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoGrupo raiz) {
        this.raiz = raiz;
    }

    
    
}
