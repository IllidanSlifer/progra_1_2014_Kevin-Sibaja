/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atributos;

/**
 *
 * @author Estudiante
 */
public class account {
    
    private double saldoinicial;
    private boolean hayerror;
    
    public account()
    {    
        saldoinicial=0;
        hayerror=false;
    }
        /**
         * este metodo sirve para aumentar la cuenta del usuario
         * @para monto parametropara recibir el nuevo monto
         */
    
    public void Deposito(double monto)
    {
        setSaldoinicial(getSaldoinicial() + monto);
    }   
    public void retiro(double monto)
    {
        if(getSaldoinicial()>=monto)
            setSaldoinicial(getSaldoinicial() - monto);
        else
            setHayerror(true);
   
    }
    
   //fin

    /**
     * @return the saldoinicial
     */
    public double getSaldoinicial() {
        return saldoinicial;
    }

    /**
     * @param saldoinicial the saldoinicial to set
     */
    public void setSaldoinicial(double saldoinicial) {
        this.saldoinicial = saldoinicial;
    }

    /**
     * @return the hayerror
     */
    public boolean isHayerror() {
        return hayerror;
    }

    /**
     * @param hayerror the hayerror to set
     */
    public void setHayerror(boolean hayerror) {
        this.hayerror = hayerror;
    }
        
    
    
}
