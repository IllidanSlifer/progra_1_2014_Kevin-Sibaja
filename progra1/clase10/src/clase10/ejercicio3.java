/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase10;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class ejercicio3 {
    
    private int[][]matriz;
    private Scanner teclado;
    
    public void CargarMatriz()
    {
        teclado=new Scanner(System.in);
        matriz=new int[3][4];
        for(int f=0;f<3;f++)
        {
            for(int c=0;c<4;c++)
            {
                System.out.println("ingrese el numero correspondiente");
                matriz[f][c]=teclado.nextInt();
            }
        }
    
    }
    
    public void PrimeraFila()
    {
        System.out.println("primera fila de la matriz");
        for(int c=0;c<4;c++)
        {
            System.out.println(matriz[0][c]+"");
        }
    }
    
    public void UltimaFila()
    {
        System.out.println("ultima fila de la matriz");
        for(int c=0;c<4;c++)
        {
            System.out.println(matriz[2][c]+"");
        }
    }
    
    public void PrimeraColumna()
    {
        System.out.println("primera columna de la matriz");
        for(int f=0;f<3;f++)
        {
            System.out.println(matriz[f][0]+"");
        }
    }
    public void UltimaColumna()
    {
        System.out.println("ultima columna de la matriz");
        for(int f=0;f<3;f++)
        {
            System.out.println(matriz[f][3]+"");
        }
    }
}
