/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica5;
import java.util.Scanner;
/**
 *
 * @author Kevin
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite el valor de A"+"\n");
         A =Integer.parseInt(teclado.nextLine());
         
         if(A%2==0){
             System.out.print("Es par"+"\n");
         }
         else{
             System.out.print("Es inpar"+"\n");
         }
    }
    
}
