/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author DAVIDCASTRO
 */
public class Acciones {
    // Atributos
    private final String welcome = "Bienvenid@\ningrese";
    private String identificacion;
    private String passw;
     
    // Constructor

//    public Acciones(String identificacion, String passw) {
//        this.identificacion = identificacion;
//        this.passw = passw;
//    }
    
    // Métodos
    public void iniciarSesion(){
        String identificacion = JOptionPane.showInputDialog ( "Introduzca un número:" );
        String passw = JOptionPane.showInputDialog ("Introduzca contraseña:" );
    }
}
    

