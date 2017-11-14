/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulauno;

/**
 *
 * @author alumno
 */
public class Piloto {
    
    private String Nombre;
    private String Apellido;
    public Piloto()
    {
        this.Nombre="Natalia";
        this.Apellido="Natalia";
    
    }
    public void satterNombre(String nombre)
    {
        this.Nombre= nombre;
    
    }
    public void setterApellido (String Apellido)
    {
        this.Apellido= Apellido;
    
    }
    public String DameNombreCompletoMayusc()
    {
        String retorno="";
        
        retorno=this.Nombre+""+this.Apellido;
        
        
        
        
        
        return retorno;
    
    }
}
