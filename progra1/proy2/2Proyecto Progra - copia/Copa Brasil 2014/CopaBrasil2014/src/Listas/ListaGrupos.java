/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoEquipo;
import Nodos.NodoGrupo;
import Nodos.NodoGrupos;
import Nodos.NodoJugador;


/**
 *
 * @author Dinier
 */
public class ListaGrupos {
   
    private NodoGrupos listaGrupo;
     
    
    public void InsertarGs(String nombre, ListaGrupo grupo)
    {
        NodoGrupos nuevo;
        nuevo = new NodoGrupos();
        nuevo.setNombre(nombre);
        nuevo.setGrupo(grupo.getRaiz());
        NodoGrupos auxiliar = getListaGrupo();
        
        if(listaGrupo==null)
        {
            nuevo.setSiguienteGrupo(null);
            listaGrupo=nuevo;
        }
        else
        {
            auxiliar=listaGrupo;
            while (auxiliar.getSiguienteGrupo()!=null) 
            {  
                auxiliar=auxiliar.getSiguienteGrupo();             
            }
            auxiliar.setSiguienteGrupo(nuevo);
        }
    }
    
    
    
    
     public void Insertar(NodoGrupos dato) {
 
        if (listaGrupo == null) {
            dato.setSiguienteGrupo(null);
            
            listaGrupo = dato;
        } else {
            dato.setSiguienteGrupo(listaGrupo);
            listaGrupo = dato;
        }
    }
     
    
      public int Cantidad() {
        int cont = 0;
        NodoGrupos conta = listaGrupo;
        while (conta != null) {
            conta = conta.getSiguienteGrupo();
            cont++;
        }

        return cont++;

    }
      public NodoGrupos[] ordInscNameAlfa(NodoGrupos[] arreglo) {
        int in;
 
        for (int i = 1 ; i < arreglo.length ; i++) {
            NodoGrupos aux = arreglo[i];
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

        NodoGrupos recorrido = listaGrupo;
        NodoGrupos arreglo[] = new NodoGrupos[Cantidad()];
        int cont = 0;
        while (recorrido != null) {
            arreglo[cont] = recorrido;
            cont++;
            recorrido = recorrido.getSiguienteGrupo();
        }
        arreglo = ordInscNameAlfa(arreglo);
                //ordenamientoburbuja(arreglo);
        listaGrupo = null;
        for (int i = arreglo.length-1; i >= 0; i--) {
            Insertar(arreglo[i]);
        }

    }
    
    public void Imprimir()
    {
        NodoGrupos recorridoGrupo=listaGrupo;
        
        System.out.println("Lista de grupos");
        while(recorridoGrupo!=null)
        {
            System.out.println(recorridoGrupo.getNombre());
            
            while(recorridoGrupo.getSiguienteGrupo()!=null)
            {
                recorridoGrupo=recorridoGrupo.getSiguienteGrupo();
                System.out.println(recorridoGrupo.getNombre());
            }
            recorridoGrupo=recorridoGrupo.getSiguienteGrupo();
        }
        System.out.println();
    }
    
    public boolean EstaVacia()
    {
        return listaGrupo==null;
    }
    /**
     * @return the listaGrupo
     */
    public NodoGrupos getListaGrupo() {
        return listaGrupo;
    }

    /**
     * @param listaGrupo the listaGrupo to set
     */
    public void setListaGrupo(NodoGrupos listaGrupo) {
        this.listaGrupo = listaGrupo;
    }
}
