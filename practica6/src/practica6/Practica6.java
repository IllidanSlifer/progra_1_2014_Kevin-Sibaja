/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica6;
import java.util.Scanner;
/**
 *
 * @author Kevin
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int B=0;
        
         Scanner teclado = new Scanner(System.in);
         
         
        System.out.print("Digite el valor de B"+"\n");
         B =Integer.parseInt(teclado.nextLine());
        
         
         if (B>=0){
            System.out.print("Es positivo"+"\n");  
         }
        else
         {
        
         System.out.print("Es negativo"+"\n");
         }
    }
    
}
