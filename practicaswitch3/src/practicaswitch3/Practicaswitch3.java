/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaswitch3;
import java.util.Scanner;
/**
 *
 * @author Byron
 */
public class Practicaswitch3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        char letra;
        boolean validar;
        char continuar;
        Scanner teclado=new Scanner(System.in);
        Ejercicio3 oejercicio3=new Ejercicio3();
        
        do
        {
            System.out.println("digite la letra");
            letra=teclado.nextLine().charAt(0);
            
            
                System.out.println("Desea continuar S/N");
            continuar=teclado.nextLine().charAt(0);
            if((continuar=='S')||(continuar=='s'))
           {   
               validar=true;
           }
           else
           {
               validar=false;
           } 
            
            
            
        }while(validar);
        
    }
    
}
