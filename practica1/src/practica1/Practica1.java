/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;
import java.util.Scanner;
/**
 *
 * @author Kevin
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int N=0;
        double A ;
        char C ;
        double suma ;
        double diferencia ;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("digite el valor de A" +"\n");
        A =Double.parseDouble(teclado.nextLine());
        System.out.print("digite el valor de N" +"\n");
        N =Integer.parseInt(teclado.nextLine());
        
        
        suma= N+A;
        diferencia=A-N;
        
        System.out.print("El valor de A es  = "+A+"\n");
        System.out.print("El valor de N es  = "+N+"\n");
        System.out.print("la suma de A + N es  = "+suma+"\n");
        System.out.print("la diferencia de N - A es  = "+diferencia+"\n");
        
        
        
        
    }
    
}
