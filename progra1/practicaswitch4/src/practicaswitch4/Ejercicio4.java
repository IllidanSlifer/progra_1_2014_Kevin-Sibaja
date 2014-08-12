/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaswitch4;

/**
 *
 * @author Byron
 */
public class Ejercicio4 {
    
    
    public Ejercicio4()
    {
        
    }
    public int dia(int pdia, int dia)
    {
        
        int año;
        /* int dia = 0*/;
        
        switch(dia)
        {
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
                
               
            default:
                break;
                
        }return pdia;
        }
        
}
