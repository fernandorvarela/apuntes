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
public class EjemploContinue {
     public static void main(String[]args)
 {
     int intArray[]=new int[]{1,2,3,4,5};
     
     System.out.println("Todos los numeros a excepcion de 3 son: ");
     
     for (int i = 0; i < intArray.length; i++) {
         if (intArray[i]==3) {
             continue;
             
         }else
             System.out.println(intArray[i]);
     }
 
 }
}
