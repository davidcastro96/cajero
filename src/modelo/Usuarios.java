package modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.List;
import javax.swing.JLabel;

@DatabaseTable(tableName = "usuarios")
public class Usuarios {
    // Atributos
    @DatabaseField(id = true)
    private int cedula;
    @DatabaseField(canBeNull = false)
    private String nombre;
    @DatabaseField(canBeNull = false)
    private int cuenta;
    @DatabaseField(canBeNull = false)
    private String clave;

    // Constructores
    public Usuarios() {
    }

    public Usuarios(int cedula, String nombre, int cuenta, String clave) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.clave = clave;
    }

    // Getters & Setters
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    // Métodos
    public void iniciar_sesion(){
        System.out.println("iniciando");
    }
    public void cerrar_sesion(){
        System.out.println("cerrando");
    }

    public boolean contains(JLabel variable_nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
