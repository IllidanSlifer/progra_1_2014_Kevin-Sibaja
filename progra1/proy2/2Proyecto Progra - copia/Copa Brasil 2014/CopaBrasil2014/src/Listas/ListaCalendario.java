/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoCalendario;


/**
 *
 * @author Dinier
 */
public class ListaCalendario {
    
 private NodoCalendario listaCalendario;
 
 
 
 
 
 public  void rc(String nombre)
 {
     NodoCalendario prueba = listaCalendario;
     for (int i = 0; i < 1; i++) {
         if(prueba.getFecha().contains(nombre))
         {
         System.out.println(prueba.getFecha()+"fecha1");
         }
         if(prueba.getFecha2().contains(nombre))
         {
         System.out.println(prueba.getFecha2()+"fecha2");
         }
         if(prueba.getFecha3().contains(nombre))
         {
         System.out.println(prueba.getFecha3()+"fecha3");
         }
         if(prueba.getFecha4().contains(nombre))
         {
         System.out.println(prueba.getFecha4()+"fecha4");
         }
         prueba=prueba.getSiguienteFecha();
     }
 }
 

    public void Insertar(String fecha,String fecha2,String fecha3,String fecha4) {
        NodoCalendario nuevo;
        nuevo = new NodoCalendario();
        nuevo.setFecha(fecha);
        nuevo.setFecha2(fecha2);
        nuevo.setFecha3(fecha3);
        nuevo.setFecha4(fecha4);
       

        if (getListaCalendario() == null) {
            nuevo.setSiguienteFecha(null);
            setListaCalendario(nuevo);
        } else {
            NodoCalendario auxiliar = getListaCalendario();
            while (auxiliar.getSiguienteFecha() != null) {
                auxiliar = auxiliar.getSiguienteFecha();
            }
            auxiliar.setSiguienteFecha(nuevo);
        }
    }
    
     public void InsertarClima(String clima,String personas) {
        NodoCalendario nuevo;
        nuevo = new NodoCalendario();
        nuevo.setClima(clima);
        nuevo.setCpersonas(personas);
        
            nuevo.setSiguienteClima(null);
            setListaCalendario(nuevo);
       
    }
     
      public void ImprimirClima() {
        NodoCalendario recorridoJugador = getListaCalendario();
        
        while (recorridoJugador != null) {
            System.out.println(recorridoJugador.getClima()+recorridoJugador.getCpersonas());
            recorridoJugador = recorridoJugador.getSiguienteClima();
        }

    }
    

    public void Imprimir() {
        NodoCalendario recorridoJugador = getListaCalendario();

        System.out.println("Calendario de los partidos.");
        while (recorridoJugador != null) {
            System.out.println(recorridoJugador.getFecha()+"\n"+recorridoJugador.getFecha2()
                    +"\n"+recorridoJugador.getFecha3()+"\n"+
                    recorridoJugador.getFecha4());
            recorridoJugador = recorridoJugador.getSiguienteFecha();
            
        }

    }

    public boolean EstaVacia() {
        return getListaCalendario() == null;
    }

    /**
     * @return the listaCalendario
     */
    public NodoCalendario getListaCalendario() {
        return listaCalendario;
    }

    /**
     * @param listaCalendario the listaCalendario to set
     */
    public void setListaCalendario(NodoCalendario listaCalendario) {
        this.listaCalendario = listaCalendario;
    }    
    
}
