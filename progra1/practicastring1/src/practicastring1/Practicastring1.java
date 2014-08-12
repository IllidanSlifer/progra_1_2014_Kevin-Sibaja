/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicastring1;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Practicastring1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion=0;
        
        Scanner oScanner=new Scanner(System.in);
        
        do
        {
            
            switch(opcion)
            {
                case 1:
                    System.out.println("digite la cadena a evaluar");
                    string1 ostring1=new string1();
                    oScanner=new Scanner(System.in);
                    ostring1.setCadena(oScanner.nextLine());
                    System.out.println(ostring1.validarPalabra());
                    System.out.println(ostring1.Palindromo());
            }
        }while(opcion<=3);
        
        
        
        
        
    }
    
}
