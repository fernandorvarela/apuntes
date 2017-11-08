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
public class Alumno {
    //nombre, apellido, correo, sexo, fecha de nacimiento, localidad, direccion, legajo, dni.
    //crear estos atributos y generar 10 objetos ALUMNOS.
    public String Nombre;
     public String Apellido;
     public String Correo;
     public String Sexo;
     public String FechaDeNacimiento;
     public String Localidad;
     public String Direccion;
     public String Legajo;
     public String Dni;
     
     public void MostrarDatosAlumno()
     {
         System.out.println(this.Nombre);
         System.out.println(this.Apellido);
         System.out.println(this.Correo);
         System.out.println(this.Sexo);
         System.out.println(this.FechaDeNacimiento);
         System.out.println(this.Localidad);
         System.out.println(this.Direccion);
         System.out.println(this.Legajo);
         System.out.println(this.Dni);
    }
     private String _Nombre;
     private String _Apellido;
     private String _Correo;
     private String _Sexo;
     private String _FechaDeNacimiento;
     private String _Localidad;
     private String _Direccion;
     private String _Legajo;
     private String _Dni;
     
     public void SetNombre(String UnNombre)
     {
         if (UnNombre.length()>3) {
             this._Nombre=UnNombre;
         }else
         {
             this._Nombre="mal";
         }
     
     }
     
     public String GetNombre()
     {
         return this._Nombre;
     
     }
     public void SetApellido(String UnApellido)
     {
         this._Apellido=UnApellido;
     }
    public void MostrarInstanciaAlumno()
    {
        //1er version
         //System.out.println("Nombre: "+this._Nombre);
        //2da version
        
    }
    public void MostrarDatosAlumnos(Alumno UnAlguien)
    {
        
    
        //1er version
        //UnAlguien.MostrarInstanciaAlumno();
        System.out.println("nombre: "+UnAlguien.GetNombre());
    }
 }


