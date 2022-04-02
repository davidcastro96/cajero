/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import java.sql.SQLException;
import vista.FormCajero;

/**
 *
 * @author DAVIDCASTRO
 */
public class Main {

    public static String user = ""; //Ya sabe el usuario
    public static int cedula;
    public static float saldo;
    public static int cuenta;

    public static Dao<Usuarios, Integer> tablaUsuarios;
    public static Dao<Cuentas, Integer> tablaCuentas;

    public static void main(String[] args) throws SQLException {

        ConnectionSource conexion;

        // Url de la base de dato
        String url = "jdbc:h2:file:./data/cajero;DB_CLOSE_ON_EXIT=FALSE;AUTO_SERVER=TRUE";

        // Conectarse a la base de datos
        conexion = new JdbcConnectionSource(url);
        System.out.println("Conexión correcta");
        tablaUsuarios = DaoManager.createDao(conexion, Usuarios.class);
        tablaCuentas = DaoManager.createDao(conexion, Cuentas.class);

        FormCajero forma = new FormCajero();
        forma.setVisible(true);

    }

}
