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
public class Carrera {
    public Auto[] AutoParticipantes;
    private String Fecha;
    private String Pais;
    /**
     * Constructor:
     * 
     * 1- No tiene valor de retorno.
     * 2- Se llama igual que la clase.
     * 3- El por defecto, puede estar o no.
     * 4- Se ejecuta solamente al crear el objeto.
     * 
     */
    public Carrera()// Contructor
    {
        this.Fecha="hoy";
        this.Pais="Argentina";
        this.AutoParticipantes=new Auto[20];
        this.CrearAutosTest();
    }
    private void CrearAutosTest()
    {
        for (int i = 0; i < this.AutoParticipantes.length; i++) {
            
            this.AutoParticipantes[i] = new Auto(i);
        }
    
    }
    public void CorrerCarrera(int CantidadDeVueltas)
    {
        for (int Vueltas = 0; Vueltas < CantidadDeVueltas; Vueltas++) {
            
            for (int i = 0; i < this.AutoParticipantes.length; i++) {
                
                int random=(int) (Math.random()*100);
                this.AutoParticipantes[i].AgregarTiempoRecorrido(random);
            }
            
        }
    
    }
    public Auto DameElGanador()
    {
        Auto retorno= new Auto(0);
        int menorRecorrido=0;
        for (int i = 0; i < this.AutoParticipantes.length; i++) {
            if (i==0) {
                menorRecorrido=this.AutoParticipantes[i].DameElTiempoRecorrido();
                retorno= this.AutoParticipantes[i];
            }else
            {
                if (menorRecorrido>this.AutoParticipantes[i].DameElTiempoRecorrido()) {
                    
                    menorRecorrido=this.AutoParticipantes[i].DameElTiempoRecorrido();
                    retorno= this.AutoParticipantes[i];
                    
                }
            
            }
        }
        
        
        return retorno;
    
    }
}
