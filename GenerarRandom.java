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
public class GenerarRandom {
    
public static String DameUnNombre()
     {
         String retorno="";
       int random=(int)Math.random()*10;
         switch(random)
         {
             case 0:
             retorno="Alfredo";
             break;
             case 1:
             retorno="Rogelio";
             break;
             case 2:
             retorno="Julieta";
             break;
                 
        }
         
         
         
         return retorno;
    
     }
     public static int DameUnaEdad()
     {
         int retorno=0;
         int random=(int)Math.random()*100;
         return retorno;
         
     }
 }
