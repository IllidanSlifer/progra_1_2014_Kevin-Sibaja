/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2.kevin;

import Listas.ListaProducto;
import Listas.ListaFactura;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Examen2Kevin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Supermercado “El Granada” ");
        int opc = 0;
        int opcprod = 0;
        String nombre = "";
        int id = 0;
        int idF = 0;
        int precioUnitario = 0;
        int cantidad = 0;
        double TotalGrabado;
        double TotalExcepto;
        double impuesto;
        double Subtotal;
        String Fecha = "";
        double Total;
        boolean Activo;
        boolean Gravado;
        ListaProducto producto = new ListaProducto();
        ListaFactura factura = new ListaFactura();

        do {
            try {

                opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL"
                        + "\n1: CREAR NUEVA FACTURA."
                        + "\n2: EDITAR LA FACTURA."
                        + "\n3: DESACTIVAR FACTURA."
                        + "\n4: REEMPRIMIR FACTURA."
                        + "\n5: AGREGAR INVENTARIO."
                        + "\n6: EDITAR INVENTARIO."
                        + "\n7: DESACTIVAR INVENTARIO."
                        + "\n8: Agregar más productos a un inventario."
                        + "\n0: SALIR."));
                switch (opc) {
                    case 1:
                        do {

                            opcprod = Integer.parseInt(JOptionPane.showInputDialog(
                                    "CREAR NUEVA FACTURA "
                                    + "\n1: Pedir el nombre al usuario."
                                    + "\n2: introducir los productos de la compra."
                                    + "\n3: Salir."));

                            switch (opcprod) {
                                case 1: {
                                    nombre = JOptionPane.showInputDialog(""
                                            + "DIGITE EL NOMBRE DEL CLIENTE");
                                    break;
                                }
                                case 2: {
                                    idF = Integer.parseInt(
                                            JOptionPane.showInputDialog(""
                                                    + "DIGITE EL ID DEL "
                                                    + "PRODUCTO"));
                                    TotalGrabado = Integer.parseInt(
                                            JOptionPane.showInputDialog(""
                                                    + "DIGITE EL TOTAL GRABADO"));
                                    TotalExcepto = Integer.parseInt(
                                            JOptionPane.showInputDialog(""
                                                    + "DIGITE EL TotalExcepto"));
                                    Subtotal = Integer.parseInt(
                                            JOptionPane.showInputDialog(""
                                                    + "DIGITE EL Subtotal"));
                                    Fecha = String.valueOf((JOptionPane.showInputDialog(""
                                            + "DIGITE LA FECHA")));
                                    Total = Integer.parseInt((JOptionPane.showInputDialog(""
                                            + "DIGITE EL Total")));
                                    Activo = Boolean.valueOf((JOptionPane.showInputDialog(""
                                            + "DIGITE SI ESTA Activo")));
                                    factura.CrearFactura(idF, Fecha, TotalExcepto, TotalGrabado, producto, Subtotal, Fecha, Total, Activo);
                                    break;
                                }
                            }

                        } while (opcprod != 3);
                        break;
                    case 2:
                        opcprod = Integer.parseInt(JOptionPane.
                                showInputDialog("EDITAR LA FACTURA "
                                        + "\n1: Modificar los productos"
                                        + " y los atributos de la factura."
                                        + "\n0: Salir."));
                        idF = Integer.parseInt(
                                JOptionPane.showInputDialog(""
                                        + "DIGITE EL ID DE LA "
                                        + "FACTURA"));
                        TotalGrabado = Integer.parseInt(
                                JOptionPane.showInputDialog(""
                                        + "DIGITE EL TOTAL GRABADO"));
                        TotalExcepto = Integer.parseInt(
                                JOptionPane.showInputDialog(""
                                        + "DIGITE EL TotalExcepto"));
                        Subtotal = Integer.parseInt(
                                JOptionPane.showInputDialog(""
                                        + "DIGITE EL Subtotal"));
                        Fecha = String.valueOf((JOptionPane.showInputDialog(""
                                + "DIGITE LA FECHA")));
                        Total = Integer.parseInt((JOptionPane.showInputDialog(""
                                + "DIGITE EL Total")));
                        Activo = Boolean.valueOf((JOptionPane.showInputDialog(""
                                + "DIGITE SI ESTA Activo")));
                        factura.EditarFactura(idF, Fecha, TotalExcepto, TotalGrabado, Subtotal, Fecha, Total, Activo);
                        break;
                    case 3:
                        opcprod = Integer.parseInt(JOptionPane.
                                showInputDialog("DESACTIVAR FACTURA "
                                        + "\n1: Solicitar el id de la factura."
                                        + "\n0: Salir."));
                        factura.DesactivarFactura(id);
                        break;
                    case 4:
                        opcprod = Integer.parseInt(JOptionPane.
                                showInputDialog("REEMPRIMIR FACTURA "
                                        + "\n1: Solicitar el id de la factura."
                                        + "\n0: Salir."));
                        factura.ReemprimirFactura();
                        break;
                    case 5:
                        opcprod = Integer.parseInt(JOptionPane.
                                showInputDialog("AGREGAR INVENTARIO "
                                        + "\n0: Salir."));

                        id = Integer.parseInt(
                                JOptionPane.showInputDialog(""
                                        + "DIGITE EL ID DEL "
                                        + "PRODUCTO"));
                        nombre = String.valueOf((JOptionPane.showInputDialog(""
                                + "DIGITE LA DESCRIPCION")));
                        precioUnitario = Integer.parseInt(
                                JOptionPane.showInputDialog(""
                                        + "DIGITE EL PRECIO UNITARIO"));
                        cantidad = Integer.parseInt(
                                JOptionPane.showInputDialog(""
                                        + "DIGITE LA CANTIDAD"));
                        Fecha = String.valueOf((JOptionPane.showInputDialog(""
                                + "DIGITE LA FECHA")));
                        impuesto = Integer.parseInt((JOptionPane.showInputDialog(""
                                + "DIGITE EL Impuesto")));
                        Activo = Boolean.valueOf((JOptionPane.showInputDialog(""
                                + "DIGITE SI ESTA Activo")));
                        Gravado = Boolean.valueOf((JOptionPane.showInputDialog(""
                                + "DIGITE SI ESTA Gravado")));
                        producto.AgregarProducto(id, nombre, precioUnitario, cantidad, Activo, Gravado, impuesto, Fecha);

                        break;
                    case 6:
                        opcprod = Integer.parseInt(JOptionPane.
                                showInputDialog("EDITAR INVENTARIO "
                                        + "\n0: Salir."));
                        id = Integer.parseInt(
                                JOptionPane.showInputDialog(""
                                        + "DIGITE EL ID DEL "
                                        + "PRODUCTO"));
                        nombre = String.valueOf((JOptionPane.showInputDialog(""
                                + "DIGITE LA DESCRIPCION")));
                        precioUnitario = Integer.parseInt(
                                JOptionPane.showInputDialog(""
                                        + "DIGITE EL PRECIO UNITARIO"));
                        cantidad = Integer.parseInt(
                                JOptionPane.showInputDialog(""
                                        + "DIGITE LA CANTIDAD"));
                        Fecha = String.valueOf((JOptionPane.showInputDialog(""
                                + "DIGITE LA FECHA")));
                        impuesto = Integer.parseInt((JOptionPane.showInputDialog(""
                                + "DIGITE EL Impuesto")));
                        Activo = Boolean.valueOf((JOptionPane.showInputDialog(""
                                + "DIGITE SI ESTA Activo")));
                        Gravado = Boolean.valueOf((JOptionPane.showInputDialog(""
                                + "DIGITE SI ESTA Gravado")));
                        producto.EditarProducto(id, Fecha, precioUnitario, cantidad, Activo, Gravado, opcprod, Fecha);

                        break;
                    case 7:
                        opcprod = Integer.parseInt(JOptionPane.
                                showInputDialog("DESACTIVAR INVENTARIO "
                                        + "\n0: Salir."));
                        producto.DesactivaProducto(id);

                        break;
                    case 8:
                        opcprod = Integer.parseInt(JOptionPane.
                                showInputDialog("Agregar más productos "
                                        + "a un inventario "
                                        + "\n1: Solicitar datos"
                                        + "\n0: Salir."));
                        producto.AgregarCantidadaProducto(id, cantidad);
                        break;

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION");
            }
        } while (opc
                != 0);
    }
}
