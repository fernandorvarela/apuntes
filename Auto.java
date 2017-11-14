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
public class Auto {
    private int Numero;
    private Escuderia Escuderia;
    private String Modelo;
    private Piloto Elpiloto;
    private int TiempoRecorrido;
    
    public void Mostrar()
    {
        
        System.out.println("Numero"+this.Numero);
        System.out.println("Escuderia"+this.Numero);
        System.out.println("Modelo"+this.Numero);
        System.out.println("Tiempo recorrido: "+this.Numero);
        System.out.println("Piloto: "+this.Numero);
    
    }
    
    public int DameElTiempoRecorrido()
    {
        return this.TiempoRecorrido;
    
    }
    public void AgregarTiempoRecorrido(int tiempo)
    {
        this.TiempoRecorrido= this.TiempoRecorrido+tiempo;
    
    }
    public Auto(int numero)
    {
         this.Elpiloto = new Piloto();
         this.Modelo= "Ford";
         this.Numero= Numero;
         this.miEscuderia= new Escuderia();
         this.CargarPilotoRandom();
         
         
    
    }
    private void CargarPilotoRandom()
    {
        this.NombreRandom();
        this.ApellidoRandom(Modelo);
        
    }
    private void NombreRandom()
    {
        int miRandom=(int) (Math.random)()*10;
        switch (miRandom)
        {
            case 0:
                this.Elpiloto.SetterNombre("a");
                break;
                case 1:
                this.Elpiloto.SetterNombre("b");
                break;
                case 2:
                this.Elpiloto.SetterNombre("c");
                break;
                case 3:
                this.Elpiloto.SetterNombre("d");
                break;
                case 4:
                this.Elpiloto.SetterNombre("e");
                break;
                case 5:
                this.Elpiloto.SetterNombre("f");
                break;
                case 6:
                this.Elpiloto.SetterNombre("g");
                break;
                case 7:
                this.Elpiloto.SetterNombre("h");
                break;
                case 8:
                this.Elpiloto.SetterNombre("i");
                break;
                case 9:
                this.Elpiloto.SetterNombre("j");
                break;
                case 10:
                this.Elpiloto.SetterNombre("j");
                break;
        }
    }
    public void ApellidoRandom(String Apellido)
    {
        this.ApellidoRandom(Apellido);
        
        switch (miRandom)
        {
            case 0:
                this.Elpiloto.setterApellido("a");
                break;
                case 1:
                this.Elpiloto.setterApellido("b");
                break;
                case 2:
                this.Elpiloto.setterApellido("c");
                break;
                case 3:
                this.Elpiloto.setterApellido("d");
                break;
                case 4:
                this.Elpiloto.setterApellido("e");
                break;
                case 5:
                this.Elpiloto.setterApellido("f");
                break;
                case 6:
                this.Elpiloto.setterApellido("g");
                break;
                case 7:
                this.Elpiloto.setterApellido("h");
                break;
                case 8:
                this.Elpiloto.setterApellido("i");
                break;
                case 9:
                this.Elpiloto.setterApellido("j");
                break;
                case 10:
                this.Elpiloto.setterApellido("j");
                break;
    
    }
}
