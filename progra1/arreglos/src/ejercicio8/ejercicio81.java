/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio8;

/**
 *
 * @author Estudiante
 */
public class ejercicio81 {
    
    private double  salariomañana[]=new double[4];
    private double salariotarde[]=new double[4];
    
    public void AgregarSalarioManaña(double sueldo)
    {
        for(int i=0; i<salariomañana.length; i++)
        {
            if(salariomañana[i]==0)
            {
                salariomañana[i]=sueldo;
                break;
            }
        }
    }
    public void AgregarSalarioTarde(double sueldo)
    {
        for(int i=0; i<salariotarde.length; i++)
        {
            if(salariotarde[i]==0)
            {
                salariotarde[i]=sueldo;
                break;
            }
        }
    }
    
    public String imprimirGastos()
    {
        double sumaSalarioMañana=0;
        double sumaSalarioTarde=0;
        for(int i=0; i<salariomañana.length; i++)
        {
            sumaSalarioMañana+=salariomañana[i];
        }
        for(int i=0; i<salariotarde.length; i++)
        {
            sumaSalarioTarde+=salariotarde[i];
        }
        
        return "el salario en el turno de la mañana es" + sumaSalarioMañana+ "\n"+
                "el salario en el turno de la tarde es" + sumaSalarioTarde;
    }
}
