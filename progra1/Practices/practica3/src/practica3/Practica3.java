/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica3;
import java.util.Scanner;
/**
 *
 * @author Kevin
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N=0;
        int suma;
        int suma1;
        int suma2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("digiete el valor de n" +"\n");
        N =Integer.parseInt(teclado.nextLine());
        
        suma=N+77;
        suma1=N-3;
        suma2=N*2;
        
        System.out.print(N+" incrementado en 77 es ="+suma+"\n");
        System.out.print(N+" decrementado en 3 es ="+suma1+"\n");
        System.out.print(N+" duplicado  es ="+suma2+"\n"); 
        
         
    }
    
}
