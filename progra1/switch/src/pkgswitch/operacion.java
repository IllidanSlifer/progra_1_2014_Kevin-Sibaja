/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgswitch;

/**
 *
 * @author Estudiante
 */
public class operacion {
    
    public double sumar(double valor1,double valor2)
    {
        return valor1+valor2;
    }
    public double resta(double valor1,double valor2)
    {
        return valor1-valor2;
    }
    public double division(double valor1,double valor2)
    {
        if(valor2==0)
        {
            return 0;
        }
        else
        {
            return valor1/valor2;
            
        }
    }
    public double multiplicacion(double valor1,double valor2)
    {
        return valor1*valor2;
    }
    public double raiz(double valor1)
    {
        return Math.sqrt(valor1);
    }
    public double potencia(double valor1,double valor2)
    {
        return Math.pow(valor1,valor2);
    }
}
