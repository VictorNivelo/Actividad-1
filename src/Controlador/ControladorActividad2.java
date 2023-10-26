/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Victor
 */
public class ControladorActividad2 {
    
    String RutaGuardado = "CONTRASENA.txt";

    
    public static void GuardarContrasena(String Contrasena, String RutaGuardado){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RutaGuardado))) {
            writer.write(Contrasena);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String LeerArchivoGuardado(String RutaGuardado) {
        StringBuilder AbrirArchivo = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(RutaGuardado))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                AbrirArchivo.append(linea);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return AbrirArchivo.toString();
    }
    
    public static int verificarContraseña(String contraseñaIngresada, String rutaGuardado) {
        String contraseñaGuardada = LeerArchivoGuardado(rutaGuardado);
        if (contraseñaGuardada != null && contraseñaGuardada.equals(contraseñaIngresada)) {
            return 0;
        } else {
            return 1;
        }
    }

//    public static int VerificarContraseña() {
//        
//        String ContrasenaIngresada = Vista.VistaActividad2.txtIngresarContraseña.getText();
//        String RutaGuardado = "CONTRASENA.txt";
//        String ContraseñaGuardada = LeerArchivoGuardado(RutaGuardado.toString());
//
//        if (ContrasenaIngresada.equals(ContraseñaGuardada)) {
//            return 0;
//        } else {
//            return 1;
//        }
//    }

}
