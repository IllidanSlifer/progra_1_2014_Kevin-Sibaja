/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica4;
import java.util.Scanner;
/**
 *
 * @author Kevin
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        int D;
        int valA;
        int valB;
        int valC;
        int valD;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite el valor de A"+"\n");
         A =Integer.parseInt(teclado.nextLine());
         
         System.out.print("Digite el valor de B"+"\n");
         B =Integer.parseInt(teclado.nextLine());
         
         System.out.print("Digite el valor de C"+"\n");
         C =Integer.parseInt(teclado.nextLine());
         
         System.out.print("Digite el valor de D"+"\n");
         D =Integer.parseInt(teclado.nextLine());
         
         
         valA=A;
         valB=B;
         valC=C;
         valD=D;
         
         B=C;
         C=A;
         A=D;
         D=valB;
         
         System.out.print("el nuevo valor de A es = "+A+"\n");
          System.out.print("el nuevo valor de B es = "+B+"\n");
          System.out.print("el nuevo valor de C es = "+C+"\n");
          System.out.print("el nuevo valor de D es = "+D+"\n");
                 
         
    }
    
}
