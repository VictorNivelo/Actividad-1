/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Victor
 */
public class ControladorActividad3 {
    
    public static String Invertir(String Oracion){
        char[] Arreglo = Oracion.toCharArray();
        int Inicio = 0;
        int Final = Arreglo.length -1;
        
        while(Inicio < Final){
            
            char Cambio = Arreglo[Inicio];
            Arreglo[Inicio] = Arreglo[Final];
            Arreglo[Final] = Cambio;
            Inicio++;
            Final--;
            
        }
        return new String(Arreglo);
    }
}
