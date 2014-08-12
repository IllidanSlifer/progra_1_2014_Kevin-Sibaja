/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.pkg9;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float valores;
        float totalvalores=0;
        ejercicio9 oejercicio9=new ejercicio9();
        Scanner teclado=new Scanner(System.in);
        
        do
        {
            System.out.print("digite los valores" +totalvalores);
            valores=teclado.nextFloat();
            oejercicio9.Agregarvalor(valores);
            totalvalores++;
        }while(totalvalores<8);
        
        System.out.println("El valor acomulado es: "+oejercicio9.Sumatoria());
        System.out.println("El valor acomulado es: "+oejercicio9.SumatoriaMa36());
        System.out.println("El valor acomulado es: "+oejercicio9.SumatoriaMa50());
        
    }
    
}
