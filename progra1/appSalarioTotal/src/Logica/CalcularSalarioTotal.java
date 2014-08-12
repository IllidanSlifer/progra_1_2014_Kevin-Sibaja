/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author Byron
 */
public class CalcularSalarioTotal {
    
    private double salarioBase; //variable que contiene el salario base del empleado
    private char genero; // variable que contiene el genero del empleado
    private double ventas; // varibale que contiene el total de ventas del empleado
    private int codigoComision; // variable que va a contener el codigo de comision
    private final double porcentajeComisionMujerRango1 = 0.1; // costante que contiene el porcentaje de comision si el rango es 1 y el si es mujer
    private final double porcentajeComisionHombreRango1 = 0.05;// costante que contiene el porcentaje de comision si el rango es 1 y el si es hombre
    private final double porcentajeComisionmenorRango2 = 0.05; // costante que contiene el porcentaje de comision si el rango es 2 y las ventas son =<10.000
    private final double porcentajeComisionmayorRango2 = 0.1; // costante que contiene el porcentaje de comision si el rango es 2 y las ventas mayor a 10.000
    private final double porcentajeComisionRango3 = 0.0015; // costante que contiene el porcentaje de comision si el rango es 3

    
    //Constructor vacio
    public CalcularSalarioTotal() {}
    
    /*Costructor sobrecargado*/
    public CalcularSalarioTotal(double pSalario, char pGenero, int pCodComision, double pVentas) {
            this.salarioBase = pSalario;
            this.genero = pGenero;
            this.codigoComision = pCodComision;
            this.ventas = pVentas;
    }
    
    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * @return the ventas
     */
    public double getVentas() {
        return ventas;
    }

    /**
     * @param ventas the ventas to set
     */
    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    /**
     * @return the codigoComision
     */
    public int getCodigoComision() {
        return codigoComision;
    }

    /**
     * @param codigoComision the codigoComision to set
     */
    public void setCodigoComision(int codigoComision) {
        this.codigoComision = codigoComision;
    }


    /**
     *Calcula el salario segun las comisiones + el salario base
     * returna un double con el total
     */
    public double calcularSalario() {
        double salarioTotal = this.salarioBase;
        //salarioTotal=
        
        return salarioTotal;
    }
    
    public double calcularComision() {
        double comision = 0;
        
        switch(this.codigoComision){
            
            case 1: {
                if(this.genero=='F')
                    comision = this.ventas * this.porcentajeComisionMujerRango1;
                else{
                    comision = this.ventas * this.porcentajeComisionHombreRango1;
                }
                break;
            }
            case 2:
            case 3:    
            case 4:    
            case 5:
            case 7:{
                if(this.ventas<=10000){
                    comision = this.ventas * this.porcentajeComisionmenorRango2;
                }
                else{
                    comision = 500+ ((this.ventas-10000) * this.porcentajeComisionmayorRango2);
                }
                break;            
            }
                
            default:    
    }
            
    
        
        return comision;
    }
    
}
