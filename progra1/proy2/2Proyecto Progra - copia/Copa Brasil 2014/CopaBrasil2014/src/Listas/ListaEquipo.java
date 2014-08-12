/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;



import Nodos.NodoEquipo;
import Nodos.NodoJugador;


/**
 *
 * @author Dinier
 */
public class ListaEquipo {
    
     private NodoEquipo raiz;
     
     
       public void InsertarE(String nombre,ListaJugador jugadores)
    {
        NodoEquipo nuevo;
        nuevo=new NodoEquipo();
        nuevo.setNombre(nombre);
        nuevo.setJugadores(jugadores.getListaJugadores());
        if(getRaiz()==null)
        {
            nuevo.setSiguienteEquipo(null);
            raiz=nuevo;
        }
        else
        {
            NodoEquipo auxiliar=getRaiz();
            while (auxiliar.getSiguienteEquipo()!=null) 
            {  
                auxiliar=auxiliar.getSiguienteEquipo();             
            }
            auxiliar.setSiguienteEquipo(nuevo);
        }        
    }
     
     
     
     public void Insertar(NodoEquipo dato) {
 
        if (getRaiz() == null) {
            dato.setSiguienteEquipo(null);
            
            raiz = dato;
        } else {
            dato.setSiguienteEquipo(getRaiz());
            raiz = dato;
        }
    }
     
    
      public int Cantidad() {
        int cont = 0;
        NodoEquipo conta = getRaiz();
        while (conta != null) {
            conta = conta.getSiguienteEquipo();
            cont++;
        }

        return cont++;

    }
      public NodoEquipo[] ordInscNameAlfa(NodoEquipo[] arreglo) {
        int in;
 
        for (int i = 1 ; i < arreglo.length ; i++) {
            NodoEquipo aux = arreglo[i];
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

        NodoEquipo recorrido = getRaiz();
        NodoEquipo arreglo[] = new NodoEquipo[Cantidad()];
        int cont = 0;
        while (recorrido != null) {
            arreglo[cont] = recorrido;
            cont++;
            recorrido = recorrido.getSiguienteEquipo();
        }
        arreglo = ordInscNameAlfa(arreglo);
                //ordenamientoburbuja(arreglo);
        raiz = null;
        for (int i = arreglo.length-1; i >= 0; i--) {
            Insertar(arreglo[i]);
        }

    }
    
    public void Imprimir()
    {
        NodoEquipo recorridoEquipo=getRaiz();
        
        System.out.println("Listado de todos los elementos de la lista");
        while(recorridoEquipo!=null)
        {
            System.out.println(recorridoEquipo.getNombre());
            
            NodoJugador recorridoJugadores=recorridoEquipo.getJugadores();
            while(recorridoJugadores!=null)
            {
                System.out.println(recorridoJugadores.getNombre() + " " +recorridoJugadores.getEdad());
                recorridoJugadores=recorridoJugadores.getSiguienteJugador();
            }
            recorridoEquipo=recorridoEquipo.getSiguienteEquipo();
        }
        System.out.println();
    }
    
    
      public void ImprimirPrueba()
    {
        NodoEquipo recorridoEquipo=getRaiz();
        
     
        
            
          System.out.print(recorridoEquipo.getNombre());  
          
    
    }
    
    
    public boolean EstaVacia()
    {
        return getRaiz()==null;
    }

    /**
     * @return the raiz
     */
    public NodoEquipo getRaiz() {
        return raiz;
    }
    
    
    
    
}
