/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N=0;
        int Y=0;
       
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Digite el numero N "+"\n");
         N =Integer.parseInt(teclado.nextLine());
         
          System.out.print("Digite el numero Y "+"\n");
         Y =Integer.parseInt(teclado.nextLine());
         
      
         
        for (int i = 1; N >=i; i++) 
        {
           if(i%Y==0)
           {
           System.out.print("*");
            System.out.print("-"); 
           }
           else
           {
            System.out.print(i);
            System.out.print("-"); 
           }
           
        }
    }
    
}
