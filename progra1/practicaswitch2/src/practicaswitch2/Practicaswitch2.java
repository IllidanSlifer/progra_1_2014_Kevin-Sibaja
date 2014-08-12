/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaswitch2;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Practicaswitch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        int numero;
        boolean validar = false;
        char continuar = 's';
        int opcion;
        String resultado;
        char nuevonumero;
        
        Scanner teclado=new Scanner(System.in);
        Ejercicio2 oejercicio2=new Ejercicio2();
        do
        {
          System.out.println("digite el numero");
                numero=teclado.nextInt();
                System.out.println(oejercicio2.Numero(numero));
            System.out.println("Desea continuar S/N");
            resultado=teclado.nextLine();
            teclado.close();
                
               
              
                
    }while(validar);
                

        
    }
}
  
