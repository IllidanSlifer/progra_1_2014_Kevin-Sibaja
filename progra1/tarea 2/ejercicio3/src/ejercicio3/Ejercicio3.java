/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Byron
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double inicio;
        double Final;
        double incremento;
        double suma=0;
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Digite el valor inicial "+"\n");
         inicio =Double.parseDouble(teclado.nextLine());
         
         
          System.out.print("Digite el valor final "+"\n");
         Final =Double.parseDouble(teclado.nextLine());
         
          System.out.print("Digite el incremento "+"\n");
         incremento =Double.parseDouble(teclado.nextLine());
        
         suma=inicio ;
      while(suma<Final) 
         
         {
             
           suma=suma+incremento;
           
               System.out.println("la sumatoria es "+suma); 
         
         }
    }
    
}
