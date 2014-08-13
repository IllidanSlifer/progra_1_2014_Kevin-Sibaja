/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodo;

/**
 *
 * @author Estudiante
 */
public class NodoProducto {

    public NodoProducto siguienteProducto;
    public int Id;
    public double PrecioUnitario;
    public int Cantidad;
    public double Impuesto;
    public String Fecha;
    public String Descripción;
    public boolean EsGravado;
    public boolean Activo;

    /**
     * @return the siguienteProducto
     */
    public NodoProducto getSiguienteProducto() {
        return siguienteProducto;
    }

    /**
     * @param siguienteProducto the siguienteProducto to set
     */
    public void setSiguienteProducto(NodoProducto siguienteProducto) {
        this.siguienteProducto = siguienteProducto;
    }

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
     * @return the PrecioUnitario
     */
    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    /**
     * @param PrecioUnitario the PrecioUnitario to set
     */
    public void setPrecioUnitario(float PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    /**
     * @return the Impuesto
     */
    public double getImpuesto() {
        return Impuesto;
    }

    /**
     * @param Impuesto the Impuesto to set
     */
    public void setImpuesto(double Impuesto) {
        this.Impuesto = Impuesto;
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
     * @return the Descripción
     */
    public String getDescripción() {
        return Descripción;
    }

    /**
     * @param Descripción the Descripción to set
     */
    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

    /**
     * @return the EsGravado
     */
    public boolean isEsGravado() {
        return EsGravado;
    }

    /**
     * @param EsGravado the EsGravado to set
     */
    public void setEsGravado(boolean EsGravado) {
        this.EsGravado = EsGravado;
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

}
