/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atributos;
import java.util.Scanner;
/**
 *
 * @author Kevin
 */
public class Atributos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean validar=true;
        int opcion;
        char continuar;
        double monto;
        
        
        account oaccount=new account();
        Scanner teclado=new Scanner(System.in);
        
        while(validar)
        {
            System.out.print("digite 1 si quiere realizar un deposito y 2 si quiere realizar un retiro");
            opcion=Integer.parseInt(teclado.nextLine());
            
            if(opcion==1)
            {
                System.out.print("digite el monto a depositar");
                monto=Double.parseDouble(teclado.nextLine());
                oaccount.Deposito(monto);
                    
            
            }            
            if(opcion==2)
            {
                System.out.print("digite el monto a retirar");
                monto=Double.parseDouble(teclado.nextLine());
                oaccount.retiro(monto);
                if(oaccount.isHayerror())
                {
                    System.out.print("monto que ud desea retirar no puede ser retirado");
                }
            }
            System.out.print("el saldo final es de" +oaccount.getSaldoinicial());
             System.out.print("desea continuar con otra transaccion S/N");
             continuar=teclado.nextLine().charAt(0);
             if((continuar=='S')||(continuar=='s'))
             {
                 validar=true;
             }
             if((continuar=='N')||(continuar=='n'))
             {
                 validar=false;
             }
        }
        
    }
    
}
