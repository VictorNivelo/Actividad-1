/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Victor
 */
public class ControladorActividad4 {
    
    public static int ContarRemplazarVocales(String Oracion){
        int ContadorVocales = 0;
        char[] SepararCaracteres = Oracion.toCharArray();
        
        for(int i = 0; i < SepararCaracteres.length; i++){
            char caracteres = SepararCaracteres[i];
            if(caracteres == 'a' || caracteres == 'e' || caracteres == 'i' || caracteres == 'o' || caracteres == 'u' ||
                caracteres == 'A' || caracteres == 'E' || caracteres == 'I' || caracteres == 'O' || caracteres == 'U'){
                SepararCaracteres[i] =  '*';
                ContadorVocales++;
            }
        }
        
        System.out.println("Oracion modificada; "+ new String(SepararCaracteres));
        Vista.VistaActividad4.txtOracionCambiada.setText(new String(SepararCaracteres));
        return ContadorVocales;
        
    }
    
  
    
}
