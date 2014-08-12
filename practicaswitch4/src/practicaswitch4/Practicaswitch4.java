/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaswitch4;
import java.util.Scanner;
/**
 *
 * @author Byron
 */
public class Practicaswitch4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int mes;
        int año;
        int dia;
        boolean validar;
        char continuar;
        
        Scanner teclado=new Scanner(System.in);
        Ejercicio4 oejercicio4=new Ejercicio4();
        do
        {
            System.out.print("digite el mes");
            mes =Integer.parseInt(teclado.nextLine());
            System.out.print("digite el año");
            año =Integer.parseInt(teclado.nextLine());
            
            System.out.print("el mes tiene" +"\n");
            
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
