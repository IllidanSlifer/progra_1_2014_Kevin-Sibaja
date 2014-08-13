/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodo.NodoFacturas;
import Nodo.NodoProducto;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class ListaFactura {

    public NodoFacturas ListaFactura;
    String ListaProductos = "";

    public ListaFactura() {
        ListaFactura = null;
    }

    public boolean EstaVacia() {
        return (this.getListaFactura() == null);
    }

    public void CrearFactura(int Id, String Cliente, double TotalExcepto,
            double TotalGravado, ListaProducto producto,
            double Subtotal, String Fecha, double Total,
            boolean Activo) {

        if (EstaVacia()) {
            NodoFacturas nuevo;
            nuevo = new NodoFacturas();
            nuevo.setId(Id);
            nuevo.setCliente(Cliente);
            nuevo.setTotalExcepto(TotalExcepto);
            nuevo.setTotalGravado(TotalGravado);
            nuevo.setSubtotal(Subtotal);
            nuevo.setFecha(Fecha);
            nuevo.setTotal(Total);
            nuevo.setListaProductos(producto);
            nuevo.setActivo(Activo);
            ListaFactura = nuevo;

        } else {
            NodoFacturas nuevo;
            nuevo = new NodoFacturas();
            nuevo.setId(Id);
            nuevo.setCliente(Cliente);
            nuevo.setTotalExcepto(TotalExcepto);
            nuevo.setTotalGravado(TotalGravado);
            nuevo.setSubtotal(Subtotal);
            nuevo.setFecha(Fecha);
            nuevo.setTotal(Total);
            nuevo.setListaProductos(producto);
            nuevo.setActivo(Activo);
        }
    }

    public String EditarFactura(int Id, String Cliente, double TotalExcepto, double TotalGravado,
            double Subtotal, String Fecha, double Total, boolean Activo) {
        NodoFacturas siguienteFactura = getListaFactura();
        while (siguienteFactura != null) {
            if (Id == siguienteFactura.getId()) {
                siguienteFactura.setCliente(Cliente);
                siguienteFactura.setTotalExcepto(TotalExcepto);
                siguienteFactura.setTotalGravado(TotalGravado);
                siguienteFactura.setSubtotal(Subtotal);
                siguienteFactura.setFecha(Fecha);
                siguienteFactura.setTotal(Total);
                siguienteFactura.setActivo(Activo);
            }
            siguienteFactura = siguienteFactura.getSiguienteFactura();
        }
        return "";
    }

    public void DesactivarFactura(int Id) {
        NodoFacturas siguienteFactura = getListaFactura();
        Boolean Activo = false;
        if (siguienteFactura == null) {
            JOptionPane.showInputDialog("Lista de Facturas vacia");
            return;
        }
        while (siguienteFactura != null) {
            if (Id == siguienteFactura.getId()) {
                siguienteFactura.setActivo(Activo);
                return;
            }
        }
    }

    public void ReemprimirFactura() {
        NodoFacturas recorridoFacturas = getListaFactura();
        while (recorridoFacturas != null) {
            JOptionPane.showMessageDialog(null, "El Id es: " + recorridoFacturas.getId()
                    + "\n " + "el Cliente es: " + recorridoFacturas.getCliente() + "\n"
                    + "El TotalExcepto es de: " + recorridoFacturas.getTotalExcepto()
                    + "\n" + "El TotalGravado es de: " + recorridoFacturas.getTotalGravado()
                    + "\n" + "El Subtotal es: " + recorridoFacturas.getSubtotal()
                    + "\n" + "La Fecha es: " + recorridoFacturas.getFecha()
                    + "\n" + "Total: " + recorridoFacturas.getTotal()
                    + "\n" + "ListaProductos: " + recorridoFacturas.getListaProductos().Imprimir()
                    + "\n" + "Esta Activo: " + recorridoFacturas.isActivo());

            recorridoFacturas = recorridoFacturas.getSiguienteFactura();
        }
    }

    /**
     * @return the ListaFactura
     */
    public NodoFacturas getListaFactura() {
        return ListaFactura;
    }

    /**
     * @param ListaFactura the ListaFactura to set
     */
    public void setListaFactura(NodoFacturas ListaFactura) {
        this.ListaFactura = ListaFactura;
    }
}
