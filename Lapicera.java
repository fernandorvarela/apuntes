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
public class Lapicera {
  
        private int rojo;//  {atributos de
        private int azul;//          la clase}

     public void Escrbirir(String color, int Cantidad){
        
         if (color.equalsIgnoreCase("rojo")) {
             
             if (Cantidad< this.rojo) {
                 this.rojo= this.rojo - Cantidad;
             }else
             {
                 System.out.println("No hay cantidad suficiente");
             
             }
             if (color.equalsIgnoreCase("Azul")) {
             
             if (Cantidad< this.azul) {
                 this.azul= this.azul - Cantidad;
             }else
             {
                 System.out.println("No hay cantidad suficiente");
             
             }
         }
         
       }
         
     }
     public void Cargar(String color,int cantidad)
     {
         if (color.equalsIgnoreCase("rojo")) {
             this.rojo= this.rojo + cantidad;
         }
         if (color.equalsIgnoreCase("Azul")) {
             this.azul=this.azul+cantidad;
         }
     }
}

