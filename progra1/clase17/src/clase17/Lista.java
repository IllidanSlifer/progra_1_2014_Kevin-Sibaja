/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase17;

/**
 *
 * @author Estudiante
 *
 */
public class Lista {

    private NodoDeLista raiz;

    public Lista() {
        raiz = null;
    }

    public void Insertar(String dato) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            nuevo.setSiguiente(raiz);
            raiz = nuevo;
        }
    }

    public void Imprimir() {
        NodoDeLista recorrido = raiz;
        System.out.println("listado de todos los elementos de la lista");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }

    public boolean EstaVacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }
}
