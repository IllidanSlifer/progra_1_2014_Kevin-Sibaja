/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoEquipo;
import Nodos.NodoEstadios;
import Nodos.NodoJugador;
import javax.swing.JOptionPane;

/**
 *
 * @author juan jose
 */
public class ListaJugador {

    private NodoJugador listaJugadores;
    //variable para el nodo inicial
    private NodoJugador primero;
    //variable para el nodo final
    private NodoJugador ultimo;
    //variabale para el tamaño del nodo
    private int tamaño;

    //Metodo para insertar los datos de las lista
    public void Insertar(String nombre, int edad) {

        if (EstaVacia()) {
            NodoJugador nuevo;
            nuevo = new NodoJugador();
            nuevo.setNombre(nombre);
            nuevo.setEdad(edad);
            this.primero = nuevo;
            this.ultimo = nuevo;

            listaJugadores = nuevo;
            listaJugadores.siguienteJugador = null;
            System.out.println("Nuevo");
        } else {
            NodoJugador nuevo;
            nuevo = new NodoJugador();
            nuevo.setNombre(nombre);
            nuevo.setEdad(edad);
            this.ultimo.siguienteJugador = nuevo;
            this.ultimo = nuevo;
        }
    }
    public void Agregar(String nombre, int edad) {

        if (EstaVacia()) {
            NodoJugador nuevo;
            nuevo = new NodoJugador();
            nuevo.setNombre(nombre);
            nuevo.setEdad(edad);
            this.ultimo=nuevo;
            listaJugadores = nuevo;
            listaJugadores.siguienteJugador = null;
            System.out.println("Nuevo");
        } else {
            NodoJugador nuevo;
            nuevo = new NodoJugador();
            nuevo.setEdad(edad);
            nuevo.setNombre(nombre);
            
            this.ultimo.siguienteJugador = nuevo;
            this.ultimo = nuevo;
        }
    }
    

    

    public void Ordenar() {
        NodoJugador aux;
        aux = listaJugadores;
        NodoJugador aux2;
        aux2 = null;
        String nombre = "";
        int edad = 0;
        while (aux.getSiguienteJugador() != null) {
            aux2 = aux.getSiguienteJugador();
            while (aux2 != null) {
                if (aux.getEdad() > aux2.getEdad()) {
                    nombre = aux2.getNombre();
                    edad = aux2.getEdad();
                    aux2.setEdad(aux.getEdad());
                    aux2.setNombre(aux.getNombre());
                    aux.setEdad(edad);
                    aux.setNombre(nombre);
                }
                aux2 = aux2.getSiguienteJugador();
            }
            aux = aux.getSiguienteJugador();
        }
    }

    //Metodo que imprime el nombre del Jugador modificado
    public void ImprimirNombre(String equipo, String nomNuevo) {

        NodoEquipo siguienteEquipo = CargarDatos.equipos.listaEquipo;

        while (siguienteEquipo != null) {

            if (equipo.equals(siguienteEquipo.getNombre())) {

                NodoJugador recorridoJugadores = siguienteEquipo.getJugadores();

                while (recorridoJugadores != null) {
                    if (nomNuevo.equals(recorridoJugadores.getNombre())) {

                        JOptionPane.showMessageDialog(null, "El nombre del jugador es: " + String.valueOf(recorridoJugadores.getNombre()) + "\n"
                                + "La edad es: " + String.valueOf(recorridoJugadores.getEdad()) + "\n");
                    }
                    recorridoJugadores = recorridoJugadores.getSiguienteJugador();
                }

                break;
            }

            siguienteEquipo = siguienteEquipo.getSiguienteEquipo();
        }
    }

    //Metodo que imprime una posicion de la lista
    public void toStringPosicion(int num) {
        String retorno = "";
        if (!this.EstaVacia()) {
            NodoJugador temp = this.primero;
            for (int i = 0; i < num; i++) {
                if ((num - 1) == i) {
                    JOptionPane.showMessageDialog(null, "El nombre del jugador es: " + String.valueOf(temp.nombre) + "\n"
                            + "La edad es: " + String.valueOf(temp.edad) + "\n");
                }
                temp = temp.siguienteJugador;
            }
        }
    }

    public void ImprimirUltimo() {
        NodoJugador recorridoJugador = getListaJugadores();

        System.out.println("El jugador mas viejo es: ");
        while (recorridoJugador != null) {
            if (recorridoJugador.getSiguienteJugador() == null) {
                System.out.println(recorridoJugador.getNombre() + " " + recorridoJugador.getEdad());
            }
            recorridoJugador = recorridoJugador.getSiguienteJugador();
        }
        System.out.println();
    }

    public void ImprimirPrimero() {
        NodoJugador recorridoJugador = getListaJugadores();

    }

    //Metodo que devuelve un true si la lista esta vacia
  public boolean EstaVacia() {
        return (this.listaJugadores== null);
    }

    //Metodo para eliminar datos de la lista
    public void EliminarJugador(String equipo, String nombre) {

        NodoEquipo siguienteEquipo = CargarDatos.CargarEquipos().listaEquipo;

        while (siguienteEquipo != null) {

            if (equipo.equals(siguienteEquipo.getNombre())) {

                NodoJugador siguienteJugador = siguienteEquipo.getJugadores();
                NodoJugador anterior = siguienteJugador;

                while (siguienteJugador != null) {
                    if (nombre.equals(siguienteJugador.getNombre())) {

                        if (siguienteJugador == CargarDatos.CargarEquipos().listaEquipo.getJugadores()) {
                            listaJugadores = siguienteJugador.getSiguienteJugador();
                             CargarDatos.equipos.listaEquipo.setJugadores(listaJugadores);
                            return;
                        }

                        anterior.setSiguienteJugador(siguienteJugador.getSiguienteJugador());
                        return;

                    }

                    anterior = siguienteJugador;
                    siguienteJugador = siguienteJugador.getSiguienteJugador();

                }
                break;
            }

            siguienteEquipo = siguienteEquipo.getSiguienteEquipo();
        }

    }

    public NodoJugador BuscarJugador(String nombre) {
        NodoJugador siguienteJugador = listaJugadores;
        while (siguienteJugador != null) {
            if (nombre.equals(siguienteJugador.getNombre())) {
                return siguienteJugador;
            }
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
        return null;
    }

    //Metodo para modificar los datos de la lista
    public String ModificarJugador(String equipo, String nombre, String nuevoNombre, int edad) {

        NodoEquipo siguienteEquipo = CargarDatos.CargarEquipos().listaEquipo;

        while (siguienteEquipo != null) {

            if (equipo.equals(siguienteEquipo.getNombre())) {

                NodoJugador recorridoJugadores = siguienteEquipo.getJugadores();

                while (recorridoJugadores != null) {
                    if (nombre.equals(recorridoJugadores.getNombre())) {
                        recorridoJugadores.setNombre(nuevoNombre);
                        recorridoJugadores.setEdad(edad);
                    }
                    recorridoJugadores = recorridoJugadores.getSiguienteJugador();
                }

                break;
            }

            siguienteEquipo = siguienteEquipo.getSiguienteEquipo();
        }
        return "";

    }
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
