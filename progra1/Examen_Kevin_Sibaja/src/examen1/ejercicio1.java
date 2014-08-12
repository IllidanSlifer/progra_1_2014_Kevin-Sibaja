/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Sibaja Rodriguez
 */
public class ejercicio1 {

    
    public void CompletarMatriz(String Matriz)
    {
      
        Matriz=new String[6][6];
        for(int f=0;f<6;f++)
        {
            for(int c=0;c<6;c++)
            {
                Matriz[n][m]=indexOf(letra);
            }
        }

    }
    public String TapCode(String original, String matriz) 
    {
        if ((original==null) || original.equals("")) 
        {
            return original;
        }
        String puntos = "";
      
        for (int i=0; i<original.length();i++) 
        {
            String letra = "" + original.charAt(i);
            if (letra.equals("K")) 
            {
                letra = "C";
            } else if (letra.equals(" N")) 
            {
                letra = "N";
            }
            int n=-1, m=-1;
            if (matriz.indexOf(letra)>=0) 
            {
                n=matriz.indexOf(letra)/6;
                m=matriz.indexOf(letra)-n*6;
            }
            if (n>=0&&n>=0) 
            {
                for (int j=0;j<=n;j++)
                {
                    puntos = puntos + ".";
                }
                puntos = puntos + " ";
                for (int j=0;j<=m;j++) {
                    puntos = puntos + ".";
                }
            }
            puntos = puntos + " ";
        }

        if (puntos.length()>0) 
        {
            puntos = puntos.substring(0,puntos.length()-1);
        }
        return puntos;
    }

}
