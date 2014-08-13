/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodo;

import Listas.ListaProducto;

/**
 *
 * @author Estudiante
 */
public class NodoFacturas {

    public int Id;
    public String Cliente;
    public double TotalGravado;
    public double TotalExcepto;
    public double Subtotal;
    public String Fecha;
    public double Total;
    public ListaProducto ListaProductos;
    public boolean Activo;
    public NodoFacturas siguienteFactura;

    public NodoFacturas (){}
    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Cliente
     */
    public String getCliente() {
        return Cliente;
    }

    /**
     * @param Cliente the Cliente to set
     */
    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    /**
     * @return the TotalGravado
     */
    public double getTotalGravado() {
        return TotalGravado;
    }

    /**
     * @param TotalGravado the TotalGravado to set
     */
    public void setTotalGravado(double TotalGravado) {
        this.TotalGravado = TotalGravado;
    }

    /**
     * @return the TotalExcepto
     */
    public double getTotalExcepto() {
        return TotalExcepto;
    }

    /**
     * @param TotalExcepto the TotalExcepto to set
     */
    public void setTotalExcepto(double TotalExcepto) {
        this.TotalExcepto = TotalExcepto;
    }

    /**
     * @return the Subtotal
     */
    public double getSubtotal() {
        return Subtotal;
    }

    /**
     * @param Subtotal the Subtotal to set
     */
    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    /**
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Total
     */
    public double getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(double Total) {
        this.Total = Total;
    }

    public ListaProducto getListaProductos() {
        return ListaProductos;
    }

    public void setListaProductos(ListaProducto ListaProductos) {
        this.ListaProductos = ListaProductos;
    }


    /**
     * @return the Activo
     */
    public boolean isActivo() {
        return Activo;
    }

    /**
     * @param Activo the Activo to set
     */
    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }

    /**
     * @return the siguienteFactura
     */
    public NodoFacturas getSiguienteFactura() {
        return siguienteFactura;
    }

    /**
     * @param siguienteFactura the siguienteFactura to set
     */
    public void setSiguienteFactura(NodoFacturas siguienteFactura) {
        this.siguienteFactura = siguienteFactura;
    }
}