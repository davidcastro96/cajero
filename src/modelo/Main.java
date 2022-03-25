/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


import java.awt.TextField;
import vista.FormCajero;

/**
 *
 * @author DAVIDCASTRO
 */
public class Main {
    public static void main(String[] args) {
        FormCajero forma = new FormCajero();
        forma.setVisible(true);
        Acciones login = new Acciones();
        login.iniciarSesion();
        
    }
    
}
