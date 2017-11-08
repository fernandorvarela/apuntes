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
public class EjemploClaseYObjetos {

    /**
     * @param args the command line arguments
     */
    /**
      * 
      * nombre > 3 letras o "nn"
      * apellido > 3 letras o "nn"
      * correo > 8 letras o "nn"
      * sexo f o m O "esta mal"
      * fechaNac
      * Localidad > 4 letras O "mal localidad"
      * direccion > 8 letras O "mal direccion"
      * legajo de 6 caracteres o "mal"
      * dni = 8 caracteres
      * para la salida todos los tectos en mayuscula.
      * 
      * Necesito una lapicera con 2 colores. rojo y azul.
      * Cada uno tiene una cantidad de 100.
      * El metodo escribir recibe el color y la cantidad de tinta a utilizar.
      * De no tener cantidad suficiente se muestra un mensaje.
      * El metodo cargar tinta recibe el color y la cantidad para cargar.
      * 
      */
    public static void main(String[]args)
    {
        Lapicera AlguaLapicera= new Lapicera();
        AlguaLapicera.Escrbirir("rojo", 120);
        AlguaLapicera.Cargar("Azul", 50);
        AlguaLapicera.Escrbirir("Rojo", 90);



    }
     
}
