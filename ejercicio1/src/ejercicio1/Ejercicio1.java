/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Kevin
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
        
    
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite el numero "+"\n");
         numero =Integer.parseInt(teclado.nextLine());
         
         
         System.out.print("\n");
         
         for (int i = 1; i <=numero; i++)
         {
         System.out.println("*");
        
        }
        System.out.print("\n");
        
      
            
            
    }
    
}
