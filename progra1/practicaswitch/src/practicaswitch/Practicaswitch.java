/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaswitch;
import java.util.Scanner;
import practicaswitch.Ejercicio1;
/**
 *
 * @author Estudiante
 */
public class Practicaswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int numero=0;
        int opcion;
        char continuar;
        String mes;
        boolean validar;
        
     
        Scanner teclado=new Scanner(System.in);
        Ejercicio1 oejercicio1=new Ejercicio1();
        
        
        
        do
        {
            
            System.out.println("digite el numero para saber el mes es" + "\n");
           
                    numero=Integer.parseInt(teclado.nextLine());
                    mes= oejercicio1.mes(numero);
                    System.out.println(mes);
                
            
            
            
            System.out.println("Desea continuar con otra operacion S/N");
           continuar=teclado.nextLine() .charAt(0);
           if((continuar=='S')||(continuar=='s'))
           {   
               validar=true;
           }
           else
           {
               validar=false;
           } 
        
        }while((numero>=1)||(numero<=12));
          
            
            
            
        
        
    }
    
}
