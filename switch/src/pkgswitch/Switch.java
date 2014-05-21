/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgswitch;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valor1=0;
        int valor2=0;
        double resultado=0;
        char continuar;
        boolean validar=true;
        int  opcion=0;
        Scanner teclado=new Scanner(System.in);
       
        operacion ooperacion=new operacion();
        do
        {
            
            
            System.out.println("digite la opercion a evaluar");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. division");
            System.out.println("4. multiplicacion");
            System.out.println("5. raiz");
            System.out.println("6. potencia");
            
            
            
                    System.out.println("digite la opcion" +"\n");
            opcion=Integer.parseInt(teclado.nextLine());
            switch(opcion) 
            {
                case 1:
                    System.out.println("digite el valor del primer digito");
                    valor1=Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    valor2=Integer.parseInt(teclado.nextLine());
                    resultado= ooperacion.sumar(valor1,valor2);
                    System.out.println(resultado);
                break;  
                case 2:
                    System.out.println("digite el valor del primer digito");
                    valor1=Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    valor2=Integer.parseInt(teclado.nextLine());
                    resultado= ooperacion.resta(valor1,valor2); 
                    System.out.println(resultado);
                break;
                    
                case 3:
                    System.out.println("digite el valor del primer digito");
                    valor1=Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    valor2=Integer.parseInt(teclado.nextLine());
                    resultado= ooperacion.division(valor1,valor2);
                    System.out.println(resultado);
                break;    
                case 4:
                    System.out.println("digite el valor del primer digito");
                    valor1=Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    valor2=Integer.parseInt(teclado.nextLine());
                    resultado= ooperacion.multiplicacion(valor1,valor2);  
                    System.out.println(resultado);
                break;  
                case 5:
                    System.out.println("digite el valor del primer digito");
                    valor1=Integer.parseInt(teclado.nextLine());
                    resultado= ooperacion.raiz(valor1);
                    System.out.println(resultado);
                break; 
                    
                    
                case 6:
                    System.out.println("digite el valor del primer digito");
                    valor1=Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    valor2=Integer.parseInt(teclado.nextLine());
                    resultado= ooperacion.potencia(valor1,valor2);
                    System.out.println(resultado);
                break;  
                default:
                  
                    break;    
                    
            }
            
            
            System.out.println("Desea continuar con otra operacion S/N");
           continuar=teclado.nextLine() .charAt(0);
           if((continuar=='S')||(continuar=='s'))
           {   
               validar=true;
           }
           else
           {
               validar=false;
           }    
        }while (validar);
        
        
        
        
    }
    
}
