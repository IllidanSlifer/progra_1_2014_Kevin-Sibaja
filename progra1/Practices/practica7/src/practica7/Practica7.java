/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica7;
import java.util.Scanner;
/**
 *
 * @author Byron
 */
public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int C=0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite el valor de C"+"\n");
         C =Integer.parseInt(teclado.nextLine());
         
         
         //positivo o negativo
          if (C>=0){
            System.out.print("Es positivo"+"\n");  
         }
        else
         {
        
         System.out.print("Es negativo"+"\n");
         }
        //fin positivo o negativo
        //par o impar
          
           if (C%2==0){
            
             System.out.print("Es par"+"\n");
        }
        else
        {
             System.out.print("Es impar"+"\n");
        }
        //fin par o impar
           
           //multiplo del 5
           
            if (C%5==0){
            
             System.out.print("Es multiplo 5 "+"\n");
        }
        else
        {
             System.out.print("No es multiplo 5 "+"\n");
        }
        
        //fin multiplo del 5
        //multiplo de 10
            
             if (C%10==0){
            
             System.out.print("Es multiplo de 10 " +"\n");
        }
        else
        {
             System.out.print("No es multiplo del 10 "+"\n");
        }
            //fin multiplo de 10
             //mayor o menor a 100
              if (C>100){
            
             System.out.print("Es mayor  a 100 "+"\n");
        }
        else
        {
             System.out.print("Es menor  a 100 "+"\n");
        }
    }
    
}
