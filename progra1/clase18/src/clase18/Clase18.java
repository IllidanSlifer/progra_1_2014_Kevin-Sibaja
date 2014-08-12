/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase18;

/**
 *
 * @author Estudiante pila: ultimo que entra es el primero que sale.... cola:
 * primero que entra primero que sale
 */
public class Clase18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Pila oPila = new Pila();
        oPila.Push("Kevin");
        oPila.Push("Illuvatar");
        oPila.Push("Slifer");
        oPila.Push("Illidan");
        oPila.Imprimir();
        System.out.println("la cantidad de elementos es " + oPila.Cantidad());
        if (oPila.Vacia()) {
            System.out.println("la pila no esta vacia");
        } else {
            System.out.println("la pila esta vacia");
            oPila.Pop();
            oPila.Pop();
            oPila.Imprimir();
        }*/
        Cola oCola =new Cola();
        oCola.Encolar("Kevin");
        oCola.Encolar("Illidan");
        oCola.Encolar("Slifer");
        oCola.Encolar("Illuvatar");
        oCola.Imprimir();
        oCola.Desencolar();
        oCola.Imprimir();
    }

}
