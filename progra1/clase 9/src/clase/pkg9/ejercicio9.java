/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.pkg9;

/**
 *
 * @author Estudiante
 */
public class ejercicio9 {
    
    private float valoracom[]=new float[8];
    
    public void Agregarvalor(float valor)
    {
        for(int i=0; i<valoracom.length; i++)
            if(valoracom[i]==0)
            {
                valoracom[i]=valor;
                break;
            }
            
            
    }
    public int Sumatoria()
    {
        int sumatoria=0;
        for(int i=0; i<valoracom.length; i++)
        {
            sumatoria+=valoracom[i];
            
        }
        return sumatoria;
    }
    public int SumatoriaMa36()
    {
        int sumatoria1=0;
                for(int i=0; i<valoracom.length; i++)
                {
                    if(valoracom[i]>36)
                    {
                        sumatoria1+=valoracom[i];
                       
                    }
                    
                }
return sumatoria1;
    }
    public int SumatoriaMa50()
    {
        int sumatoria2=0;
                for(int i=0; i<valoracom.length; i++)
                {
                    if(valoracom[i]>50)
                    {
                        sumatoria2+=valoracom[i];
                    }
                }
                return sumatoria2;

    }

    
}
