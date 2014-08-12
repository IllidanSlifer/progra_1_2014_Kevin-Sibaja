/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase18;

/**
 *
 * @author Estudiante
 */
public class Pila {

    private NodoDeLista raiz;

    public Pila() {
        raiz = null;
    }

    public void Push(String Dato) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(Dato);
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            nuevo.setSiguiente(raiz);
            raiz = nuevo;
        }
    }

    public Object Pop() {
        if (raiz != null) {
            Object info = raiz.getDato();
            raiz = raiz.getSiguiente();
            return info;
        }
        return new Object();

    }

    public void Imprimir() {
        NodoDeLista recorrido = raiz;
        System.out.println("listado de todos los elementos de la pila");
        while (recorrido != null) {
            System.out.print(recorrido.getDato() + "-");
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }

    public boolean Vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public int Cantidad() {
        int Cantidad = 0;
        NodoDeLista recorrido = raiz;
        while (recorrido != null) {
            Cantidad++;
            recorrido = recorrido.getSiguiente();
        }
        return Cantidad;
    }
}
