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
public class ejercicio4 {
    
    
    
    private Scanner teclado;
    private int[][] mat;
    
    public void CargarMatriz() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        mat=new int[filas][columnas];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
        
    public void NumeroMayor() {
    	int mayor=mat[0][0];
    	int filam=0;
    	int columnam=0;
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                if (mat[f][c]>mayor) {
                    mayor=mat[f][c];
                    filam=f;
                    columnam=c;
                }
            }
        }
        System.out.println("El elemento mayor es:"+mayor);
        System.out.println("Se encuentra en la fila:"+filam+ " y en la columna: "+columnam);
    }
}
