/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaswitch2;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class Practicaswitch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero entero : ");
        numero=in.nextInt();
        switch(numero%10)
        {
            case 2:case 5:case 8:
                System.out.println("El cuadrado del numero es : "+numero*numero);break;
            case 4:case 7:case 9:
                System.out.println("El numero multiplicado por 5 es : "+numero*5);break;
            default: 
                System.out.println("El numero ingresado es : "+numero);break;
        }
    }
    }
    

