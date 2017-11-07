/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclaseyobjetos;

/**
 *
 * @author alumno
 */
public class Usuario {
    // es de instancia
    
    //son variables que llamamos atributos
    private String Nombre;
    private String Clave;
    
    //metodos getters. Devuelven
    public String GetNombre()
    {
        return this.Nombre.toUpperCase();//Devuelve en mayuscula
    }
    public String GetClave()
    {
        return this.Clave;
    
    }
    //metodos setter no devuleven sino que asignan public void SetNombre
    public void DameNombre(String  dato)
    {
        this.Nombre=dato;
        
    }//metodos setter public void SetCalve
    public void DameClave(String dato)
    {
        if (dato.length()<4) {
            this.Clave="mal";
            
        }else
        {
            this.Clave=dato;
        
        }
    
    }
    public void MostrarDatos()
    {
        System.out.println("Su nombre es: "+ this.GetNombre()+"clave: "+this.Clave);
    
    }
}
