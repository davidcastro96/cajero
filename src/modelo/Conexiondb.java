package modelo;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class Conexiondb {
    public void crearTablaYconexiones() throws Exception {
        // Conexión a la base de datos
        ConnectionSource conexion;

        // Url de la base de dato
        String url = "jdbc:h2:file:./data/cajero;DB_CLOSE_ON_EXIT=FALSE;AUTO_SERVER=TRUE";

        // Conectarse a la base de datos
        conexion = new JdbcConnectionSource(url);
        System.out.println("Conexión correcta");

        // Crear las 2 tablas
        TableUtils.createTable(conexion,Usuarios.class);
        System.out.println("Tabla Usuarios creada");
        TableUtils.createTable(conexion,Cuentas.class);
        System.out.println("Tabla Cuentas creada");

        // Cerrar la conexión
        conexion.close();
    }
}