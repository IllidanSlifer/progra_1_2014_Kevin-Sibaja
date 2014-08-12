/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase7;

/**
 *
 * @author Estudiante
 */
public class ejercicio1 {
    
    private String email;
    public ejercicio1(String pemail)
    {
        this.email=pemail;
        
    }
    public String validarcorreo()
    {
        String mensaje ="el correo no tiene @";
        for(int i=0; i<email.length(); i++)
        {
            if (email.charAt(i)=='@')
            {
                mensaje="el correo si contiene @";
            }
        }
        return mensaje;
    }
}
