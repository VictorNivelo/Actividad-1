/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Victor
 */
public class ControladorActividad1 {
    
    public static boolean PalabraIncluida(String PrimeraPalabra, String SegundaPalabra){
        PrimeraPalabra = PrimeraPalabra.toLowerCase();
        SegundaPalabra = SegundaPalabra.toLowerCase();
        return PrimeraPalabra.contains(SegundaPalabra) || SegundaPalabra.contains(PrimeraPalabra);
    }
}
