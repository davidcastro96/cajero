package modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "cuentas")
public class Cuentas {
    // Atributos
    @DatabaseField(id = true)
    private int cuenta;
    @DatabaseField(canBeNull = false)
    private Float saldo;

    // Constructores
    public Cuentas() {
    }

    public Cuentas(int cuenta, Float saldo) {
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    // Getters & Setters
    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    // Métodos
    public void retirar(){
        System.out.println("retirar");
    }
    public void depositar(){
        System.out.println("depositar");
    }
    public void transferir(){
        System.out.println("transferir");
    }
    public void sabers_saldo(){
        System.out.println("saber saldo");
    }

    public void setSaldo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}