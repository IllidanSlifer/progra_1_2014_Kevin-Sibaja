/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaswitch2;

/**
 *
 * @author Estudiante
 */
class Ejercicio2 {
    
    public Ejercicio2()
    {
        
    }
    public int Numero(int pNumero)
    {                
       String numero;
       char nuevonumero;
       int resultado=0;
    
       numero=String.valueOf(pNumero);
       nuevonumero=numero.charAt(numero.length()-1);       
    
        switch(nuevonumero)
        {
            case '2': case 5:case 8:
                resultado=pNumero*pNumero;
            break;    
            case '4': case 7: case 9:
                resultado=pNumero*5;
            break;    
            case '1': case 3: case 0: case 6:
                resultado=pNumero;
            break; 

        }        
        return resultado;    
    }
    


}
