/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import Nodo.NodoProducto;
import javax.swing.JOptionPane;
/**
 *
 * @author Estudiante
 */
public class ListaProducto {

    public NodoProducto ListaProductos;
    //variable para el nodo inicial

    //Metodo que devuelve un true si la lista esta vacia
    public boolean EstaVacia() {
        return (this.getListaProductos() == null);
    }

    //Metodo para agregar un Estadio a la lista
    public void AgregarProducto(int Id, String Descripción, int PrecioUnitario,
            int Cantidad, Boolean Activo, Boolean EsGravado, 
            double Impuesto, String Fecha) {

        
        if (EstaVacia()) {
            NodoProducto nuevo;
            nuevo = new NodoProducto();
            nuevo.setId(Id);
            nuevo.setDescripción(Descripción);
            nuevo.setPrecioUnitario(PrecioUnitario);
            nuevo.setCantidad(Cantidad);
            nuevo.setActivo(Activo);
            nuevo.setEsGravado(EsGravado);
            nuevo.setImpuesto(Impuesto);
            nuevo.setFecha(Fecha);
            setListaProductos(nuevo);
            
        } else {
            NodoProducto nuevo;
            nuevo = new NodoProducto();
            nuevo.setId(Id);
            nuevo.setDescripción(Descripción);
            nuevo.setPrecioUnitario(PrecioUnitario);
            nuevo.setCantidad(Cantidad);
            nuevo.setActivo(Activo);
            nuevo.setEsGravado(EsGravado);
            nuevo.setImpuesto(Impuesto);
            nuevo.setFecha(Fecha);
        }
        
    }

    //Metodo para modificar los datos de la lista
    public String EditarProducto(int Id, String Descripción, int PrecioUnitario, int Cantidad, Boolean Activo, Boolean EsGravado, float Impuesto, String Fecha) {
        NodoProducto siguienteProducto = getListaProductos();
        while (siguienteProducto != null) {
            if (Id == siguienteProducto.getId()) {
                siguienteProducto.setDescripción(Descripción);
                siguienteProducto.setPrecioUnitario(PrecioUnitario);
                siguienteProducto.setCantidad(Cantidad);
                siguienteProducto.setActivo(Activo);
                siguienteProducto.setEsGravado(EsGravado);
                siguienteProducto.setImpuesto(Impuesto);
                siguienteProducto.setFecha(Fecha);
            }
            siguienteProducto = siguienteProducto.getSiguienteProducto();
        }
        return "";
    }

    //Metodo para eliminar datos de la lista
    public void EliminarProducto(int Id) {
        NodoProducto siguienteProducto = getListaProductos();
        NodoProducto anterior = siguienteProducto;

        if (siguienteProducto == null) {
            JOptionPane.showInputDialog("Lista de productos vacia");
            return;
        }
        while (siguienteProducto != null) {
            if (Id == siguienteProducto.getId()) {
                if (siguienteProducto == getListaProductos()) {
                    setListaProductos(siguienteProducto.getSiguienteProducto());
                    return;
                }
                anterior.setSiguienteProducto(siguienteProducto.getSiguienteProducto());
                return;
            }
            anterior = siguienteProducto;
            siguienteProducto = siguienteProducto.getSiguienteProducto();
        }
    }

    //Metodo para desactivar un producto
    public void DesactivaProducto(int Id) {
        NodoProducto siguienteProducto = getListaProductos();
        Boolean Activo = false;
        if (siguienteProducto == null) {
            JOptionPane.showInputDialog("Lista de productos vacia");
            return;
        }
        while (siguienteProducto != null) {
            if (Id == siguienteProducto.getId()) {
                siguienteProducto.setActivo(Activo);
                    return;
                }
            siguienteProducto = siguienteProducto.getSiguienteProducto();
            }
        }
    
    public void AgregarCantidadaProducto(int Id, int Cantidad){
        NodoProducto siguienteProducto = getListaProductos();
        
        while (siguienteProducto != null) {
            if (Id == siguienteProducto.getId()) {
                int CantidadTotal = siguienteProducto.getCantidad() + Cantidad;
                siguienteProducto.setCantidad(CantidadTotal);
            }
            siguienteProducto = siguienteProducto.getSiguienteProducto();
        }
    }
    
    //Metodo para imprimir los datos de la lista
    public String Imprimir() {
        String temp  = "";
        NodoProducto recorridoProductos = getListaProductos();

        while (recorridoProductos != null) {
            temp += "El Id es: " + recorridoProductos.getId()
                    + "\n " + "La Descripcion es: " + recorridoProductos.getDescripción() + "\n"
                    + "La cantidad es de: " + recorridoProductos.getCantidad()
                    + "\n" + "Esta Activo: " + recorridoProductos.isActivo()
                    + "\n" + "Es Gravado: " + recorridoProductos.isEsGravado()
                    + "\n" + "Impuesto: " + recorridoProductos.getImpuesto()
                    + "\n" + "Fecha: " + recorridoProductos.getFecha();

            recorridoProductos = recorridoProductos.getSiguienteProducto();
        }
        return temp;
    }

    /**
     * @return the ListaProductos
     */
    public NodoProducto getListaProductos() {
        return ListaProductos;
    }

    /**
     * @param ListaProductos the ListaProductos to set
     */
    public void setListaProductos(NodoProducto ListaProductos) {
        this.ListaProductos = ListaProductos;
    }
    public  NodoProducto BuscarProducto(int id) {
        NodoProducto producto = ListaProductos;
        while (producto != null) {
            if (id == producto.Id) {
                return producto;
            }
            producto = producto.siguienteProducto;
        }
        return producto;
    }
}
